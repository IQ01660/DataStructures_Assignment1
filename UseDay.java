public class UseDay {

    public static void main(String [] args) {
		//users 
		//check out constructor
		//there I send users to an array list
		User ikram = new User("Ikram", "Gabiyev", new Day("November", 27, 2001));
		User messi = new User("Messi", "Lionel", new Day("May", 21, 1989));

		if(args.length < 3) {
			showUsageAndExit();
		}

		String month = args[0];
		int day = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		
		Day myDay = new Day(month, day, year);
		
		System.out.println("Next day is: " + myDay.nextDay().getMonth() + " " + myDay.nextDay().getDay() + " " + myDay.nextDay().getYear());

		//will send congratulations to those who have birthdays
		myDay.printBirthdayPeople();

		//prints different messages
		//depending on whether entered value is today's real date or not
		if(myDay.isToday()) {
			System.out.println("You're right, it is really today's date");
		}
		else {
			System.out.println("That not today's date");
		}
    }

    public static void showUsageAndExit() {
		System.out.println("USAGE: java UseDay <month>  <day>  <year>");
		System.exit(0);
    }

}