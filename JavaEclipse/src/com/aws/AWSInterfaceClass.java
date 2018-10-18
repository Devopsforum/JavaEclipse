/**
 * 
 */
package com.aws;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Yvs Venkat
 *
 */
public class AWSInterfaceClass implements AWSInterface{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}
	
	public static void main (String args[]) throws FileNotFoundException {
		AWSInterfaceClass awsint = new AWSInterfaceClass();
		awsint.display();
		System.out.println(awsint.toString());
		System.out.println(a);
		for(int i=1;i<=9;i++) {
			System.out.println("print I"+ i);
		}
		File file = new File("E:\\BG-DOcs\\ASCII\\Exhibit-B.pdf");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		try {
			while ((st= br.readLine()) != null) {
				System.out.println("inside while"+ " "+ st);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
