package test;

import java.util.Date;
//import java.util.concurrent.TimeUnit;

public class PicoyPlaca {
	
	public void predictor(String a, String b, Date c ) {
		boolean allow=true;
		String pNumber =a;
		String weekDay=b;
		long minutes= c.getMinutes();
		long hours = c.getHours();
		//String CurrentTime = String.format("%d:%02d",hours , minutes);
		if (!(weekDay.contains("Sat") || weekDay.contains("Sun")))
		{
			
			if (((weekDay.contains("Mon") && (pNumber.endsWith("1") || pNumber.endsWith("2"))) || 
				(weekDay.contains("Tue") && (pNumber.endsWith("3") || pNumber.endsWith("4"))) ||
				(weekDay.contains("Wed") && (pNumber.endsWith("5") || pNumber.endsWith("6"))) ||
				(weekDay.contains("Thu") && (pNumber.endsWith("7") || pNumber.endsWith("8"))) ||
				(weekDay.contains("Fri") && (pNumber.endsWith("9") || pNumber.endsWith("0")))) &&
				((hours>=7 && (hours<=9 && (minutes>=00 && minutes<=30))) || (hours>=16 && (hours<=19 && (minutes>=00 && minutes<=30)))))
				allow=false;
		}
		//return (allow);
		if (allow)
			System.out.print("Car is allowed on the road"+"\n");
		else
			System.out.print("Car is not allowed on the road"+"\n");
			
		//return false;
	}

}

