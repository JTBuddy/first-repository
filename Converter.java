/**
Name:			Converter
Description:	Computer program to convert Farenheit to celsius and vice versa
Created by:		James Talbot
Created on:		02/04/2018
*/

import java.util.Scanner;// program uses Scanner

public class Converter
{
	public static void main(String[] args)
	{

	Scanner input = new Scanner(System.in);// create Scanner to obtain input from command window

	System.out.println("1.Fahrenheit to Celsius");
	System.out.println("2.Celsius to Farenheit");
	System.out.println("3.Exit\n");

	System.out.println("Enter temperature:");1
	int temp = input.nextInt();

	System.out.println("Choice;");
	int choice = input.nextInt();
	System.out.println("\n");

	switch(choice){
		case 1:
			System.out.println("farenheit to celsius");
			System.out.println();
			farenheit(temp);
		break;
		case 2:
			System.out.println("celsius to farenheit");
			System.out.println();
			celsius(temp);
		break;
		case 3:
			System.out.println("exit");
		break;
	}
	}

	public static int farenheit(int x){
		int celsius = (x-32);
		celsius = (celsius*5)/9;
		System.out.println();
		System.out.println(x+" farenheit is "+ celsius +" in celsius");
		return celsius;
	}

	public static int celsius(int x){

		int farenheit = 9/5*(x+32);
		System.out.println();
		System.out.println(x+" celsius is "+ farenheit +" in farenheit");
		return farenheit;

	}

}//end of class