public class UseDay {

    public static void main(String [] args) {
	if(args.length < 3) {
	    showUsageAndExit();
	}

	String month = args[0];
	int day = Integer.parseInt(args[1]);
	int year = Integer.parseInt(args[2]);
	
	Day myDay = new Day();
	myDay.setYear(year);

	System.out.println(myDay.getYear() + " is a leap year: " 
			   + myDay.isLeapYear());

    }

    public static void showUsageAndExit() {
	System.out.println("USAGE: java UseDay <month>  <day>  <year>");
	System.exit(0);
    }

}