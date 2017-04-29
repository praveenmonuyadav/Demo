package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
//import java.util.concurrent.TimeUnit;

public class PicoyPlaca {
	
	public void predictor(String a, String b, String c ) throws Exception{
		boolean allow=true;
		Date d = DateFormat.getDateInstance(DateFormat.SHORT).parse(b);
		Date t = DateFormat.getTimeInstance(DateFormat.SHORT).parse(c);
		String pNumber =a;
		int weekDay=d.getDay();
		int minutes= t.getMinutes();
		int hours = t.getHours();
		//String CurrentTime = String.format("%d:%02d",hours , minutes);
		
		
		if (!(weekDay==6 || weekDay==0))
		{
			
			if (((weekDay==1 && (pNumber.endsWith("1") || pNumber.endsWith("2"))) || 
				(weekDay==2 && (pNumber.endsWith("3") || pNumber.endsWith("4"))) ||
				(weekDay==3 && (pNumber.endsWith("5") || pNumber.endsWith("6"))) ||
				(weekDay==4 && (pNumber.endsWith("7") || pNumber.endsWith("8"))) ||
				(weekDay==5 && (pNumber.endsWith("9") || pNumber.endsWith("0")))) &&
				((hours>=7 && (hours<=9 && (minutes>=00 && minutes<=30))) || (hours>=16 && (hours<=19 && (minutes>=00 && minutes<=30)))))
				allow=false;
		}
		//return (allow);
		//System.out.print("\n"+d+"\t"+weekDay+"\t"+hours+"\t"+minutes+"\n");
		if (allow)
			System.out.print("Car is allowed on the road"+"\n");
		else
			System.out.print("Car is not allowed on the road"+"\n");
			
		//return false;
	}

}

