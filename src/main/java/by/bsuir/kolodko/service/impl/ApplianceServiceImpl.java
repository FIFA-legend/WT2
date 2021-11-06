package by.bsuir.kolodko.service.impl;

import by.bsuir.kolodko.dao.ApplianceDAO;
import by.bsuir.kolodko.dao.DAOFactory;
import by.bsuir.kolodko.entity.Appliance;
import by.bsuir.kolodko.entity.criteria.Criteria;
import by.bsuir.kolodko.service.ApplianceService;
import by.bsuir.kolodko.service.validation.Validator;

/**
 *  Implementation of the {@link ApplianceService} interface, that represent Service layer
 *
 * @author 		Nikita Kolodko
 * @version 	1.0
 */
public class ApplianceServiceImpl implements ApplianceService {

	/**
	 * Look for appliances with consumed criteria
	 *
	 * @param criteria  representation of the request params
	 * @return 			appliance, that meets criteria
	 * @see Criteria
	 * @see Appliance
	 */
	@Override
	public Appliance find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		return applianceDAO.find(criteria);
	}
}