package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java.util.concurrent.TimeUnit;

public class PicoyPlaca {
	
	public void predictor(String a, String b, String c ) throws Exception{
		boolean allow=true;
		Date d = DateFormat.getDateInstance(DateFormat.SHORT).parse(b);
		//Date t = DateFormat.getTimeInstance(DateFormat.SHORT).parse(c);
		SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
		Date date = displayFormat.parse(c);
		String dstr= DateFormat.getTimeInstance().format(date);
		String pNumber =a;
		int weekDay=d.getDay();
		    String string1 = "07:00";
		    Date time1 = new SimpleDateFormat("HH:mm").parse(string1);
		    Calendar calendar1 = Calendar.getInstance();
		    calendar1.setTime(time1);

		    String string2 = "09:30";
		    Date time2 = new SimpleDateFormat("HH:mm").parse(string2);
		    Calendar calendar2 = Calendar.getInstance();
		    calendar2.setTime(time2);
		    calendar2.add(Calendar.DATE, 0);
		    
		    String string3 = "16:00";
		    Date time3 = new SimpleDateFormat("HH:mm").parse(string3);
		    Calendar calendar3 = Calendar.getInstance();
		    calendar3.setTime(time3);
		    calendar3.add(Calendar.DATE, 0);
		    
		    String string4 = "19:30";
		    Date time4 = new SimpleDateFormat("HH:mm").parse(string4);
		    Calendar calendar4 = Calendar.getInstance();
		    calendar4.setTime(time4);
		    calendar4.add(Calendar.DATE, 0);

		    //String UserTimeIn = dstr;
		    //Date d1 = new SimpleDateFormat("HH:mm a").parse(UserTimeIn);
		    //SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm");
		    //Date d1 = parseFormat.parse(UserTimeIn);
		    //String d2 = displayFormat.format(d1);
		    Calendar calendar5 = Calendar.getInstance();
		    calendar5.setTime(date);
		    calendar5.add(Calendar.DATE, 0);

		    Date x = calendar5.getTime();
		
		if (!(weekDay==6 || weekDay==0))
		{
			
			if (((weekDay==1 && (pNumber.endsWith("1") || pNumber.endsWith("2"))) || 
				(weekDay==2 && (pNumber.endsWith("3") || pNumber.endsWith("4"))) ||
				(weekDay==3 && (pNumber.endsWith("5") || pNumber.endsWith("6"))) ||
				(weekDay==4 && (pNumber.endsWith("7") || pNumber.endsWith("8"))) ||
				(weekDay==5 && (pNumber.endsWith("9") || pNumber.endsWith("0")))) &&
					((x.after(calendar1.getTime()) && x.before(calendar2.getTime())) || (x.after(calendar3.getTime()) && x.before(calendar4.getTime()))))
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

