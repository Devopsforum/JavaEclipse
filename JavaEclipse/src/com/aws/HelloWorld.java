/**
 * 
 */
package com.aws;

/**
 * @author Yvs Venkat
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello DevOps Forum");
		Objects obj = new Objects();
		obj.fullName = "Yeluri";
		obj.actBal = 1000;
		obj.testCredit();
		System.out.println("are u okay" + " "+ obj.creditEligible);
	}

}
