package by.bsuir.kolodko.service;

import by.bsuir.kolodko.entity.Appliance;
import by.bsuir.kolodko.entity.criteria.Criteria;

/**
 * Interface that describe appliance Service layer
 */
public interface ApplianceService {

	/**
	 * Look for appliance that meet the criteria
	 *
	 * @param criteria container that contains request params
	 * @return requested appliance
	 * @see by.bsuir.kolodko.service.impl.ApplianceServiceImpl
	 */
	Appliance find(Criteria criteria);
}
