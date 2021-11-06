package by.bsuir.kolodko.entity;

import java.util.List;

/**
 * Supper class for all appliances
 *
 * @author 		Nikita Kolodko
 * @version 	1.0
 */
public class Appliance {

    /**
     * Search results objects
     */
    List<String> applianceList;

    /**
     * Constructor for the appliance
     *
     * @param result  list of appliances string representations
     */
    public Appliance(List<String> result){
        this.applianceList = result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Appliance:\n");
        for (String appliance : applianceList) {
            sb.append("\t").append(appliance).append(";\n");
        }
        return sb.toString();
    }
}