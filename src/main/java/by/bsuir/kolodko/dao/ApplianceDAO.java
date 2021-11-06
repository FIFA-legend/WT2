package by.bsuir.kolodko.dao;

import by.bsuir.kolodko.entity.Appliance;
import by.bsuir.kolodko.entity.criteria.Criteria;

/**
 * Interface that describe Appliance DAO
 *
 * @version     1.0
 * @author      Nikita Kolodko
 */
public interface ApplianceDAO {

    /**
     * Look for appliance that meets the criteria
     *
     * @param       criteria {@link Criteria} contains data to search appliance
     * @return      the appliance that meets required params
     * @see by.bsuir.kolodko.dao.impl.ApplianceDAOImpl
     */
    Appliance find(Criteria criteria);
}