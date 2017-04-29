package test;

import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.*;
import java.text.DateFormat;

public class DriverClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PicoyPlaca pl = new PicoyPlaca();
		Date CurrentTime= new Date();
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter car number: ");
		String NumberPlate=sc.nextLine();
		if(!NumberPlate.equals("") && Pattern.matches("\\d+",NumberPlate ))
		{
		System.out.print("Please enter Date in this format, DD/MM/YYYY : ");
		String UserDate=sc.nextLine();
		System.out.print("Please enter time in this format, HH:MM 24 hr format : ");
		String UserTime=sc.nextLine();
		pl.predictor(NumberPlate, UserDate, UserTime);
		}
		else
			System.err.println("\n"+" !!!!! Please enter valid number !!!!!");
		//String regex = "\\d+";
		//while(!NumberPlate.equalsIgnoreCase("Stop"))
			
		sc.close();
	}
}