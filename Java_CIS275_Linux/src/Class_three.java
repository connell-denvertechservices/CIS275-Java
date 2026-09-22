import java.util.Scanner;

public class Class_three {

	public static void main(String[] args) {
		//declare vars const
		Scanner scr = new Scanner(System.in);
		String strState, strOutput;
		int initialHour, initialMin, finalHour, adjuster;
		boolean isTomorrow=false, isYesterday=false;

		//gather inputs
		System.out.println("Enter the hour to be converted");
		initialHour = scn.nextInt();
		System.out.println("Enter the minute");
		initialMin = scr.nectInt();
		System.out.println("Enter the two character state using CAPS");
		strState = scr.next();

		//calc results
		switch (strState) {
			case: "HI": adjuster = -4;
				break;
			case; "AK": adjuster = -12;
				break;
			case "CA":
			case "ID": 
			case "NV":
			case "OR":
			case "WA": adjuster = -1;
				break;
			case "AZ":
			case "CO":
			case "MT":
			case "NM":
			case "UT":
			case "WY": adjuster = 0;
				break;
			//central time
			case "AL":
			case "AR":
			case "IA":
			case "IL":
			case "KS":
			case "KY":
			case "LA":
			case "MA":
			case "MN":
			case "MO":
			case "MS":
			case "ND":
			case "NE":
			case "OK":
			case "SD":
			case "TN":
			case "TX":
			case "WI": adjuster = 1;
				break;
			default: adjuster = 2; //using default to handle the east coast states ;) 
		}

		finalHour = initialHour + adjuster;
		strOutput = "The adjusted time is "; 
		if (finalHour >= 24) {
			finalHour = finalHour-24;
			strOutput = strOutput + finalHour + ":" + initialMin + " tomorrow";
		} else if (finalHour < 0) {
			finalHour = finalHour + 24;
			strOutput = strOutput + finalHour + ":" + initialMin + " yesterday";
		} else {
			strOutput = strOutput + finalHour + ":" + initialMin + " today";
		} 
		
		System.out.println(strOutput);
		//display outs
	}

}
