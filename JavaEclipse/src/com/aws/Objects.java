/**
 * 
 */
package com.aws;

/**
 * @author Yvs Venkat
 *
 */
public class Objects {
	
	String fullName;
	float actBal;
	boolean creditEligible;
	
	public void testCredit() {
		if (actBal>=15000) {
			creditEligible=true;
		}
	}

}
