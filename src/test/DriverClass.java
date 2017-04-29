package test;

import java.util.Date;
import java.util.regex.Pattern;
import java.io.*;

public class DriverClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		PicoyPlaca pl = new PicoyPlaca();
		String currentDay = new Date().toString().substring(0, 3);
		//System.out.println(result);
		Date CurrentTime= new Date();
		InputStreamReader ip = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ip);
		String NumberPlate="";
		//String regex = "\\d+";
		//while(!NumberPlate.equalsIgnoreCase("Stop"))
			System.out.print("Please enter car number: ");
			NumberPlate=br.readLine();
			if(!NumberPlate.equals("") && Pattern.matches("\\d+",NumberPlate ))
			pl.predictor(NumberPlate, currentDay, CurrentTime);
			else
				System.err.println("\n"+" !!!!! Please enter valid number !!!!!");
		br.close();
		ip.close();
	}
}