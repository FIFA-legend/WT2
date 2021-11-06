package by.bsuir.kolodko.main;

import by.bsuir.kolodko.entity.Appliance;

/**
 * Representation of response for the requested appliances
 *
 * @author 		Nikita Kolodko
 * @version 	1.0
 */
public class PrintApplianceInfo {

	/**
	 * Print the appliance data
	 *
	 * @param appliance data to include in response
	 * @see Appliance
	 */
	public static void print(Appliance appliance) {
		System.out.println(appliance);
	}
}
