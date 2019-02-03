import java.util.*;

public class Day {

    private static String[] months = new String[] {
      "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"  
    };
    private int year;
    private int day;
    private String month;

    //the constructor
    public Day(String _month, int _day, int _year) {
        this.month = _month;
        this.day = _day;
        this.year = _year;
    }

    // returns true if this is a leap year, and false otherwise
    public boolean isLeapYear() {
        // a year is a leap year if it is divisible by 4 and not 100,
        // or if it is divisible by 400
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
        else return false;
    }
    //day => GET and SET
    public void setDay(int _day) {
        this.day = _day;
    }

    public int getDay() {
        return this.day;
    }

    //month => GET and SET
    public void setMonth(String _month) {
        this.month = _month;
    }

    public String getMonth() {
        return this.month;
    }

    //year => GET and SET
    public void setYear(int _year) {
	    this.year = _year;
    }

    public int getYear() {
	    return this.year;
    }

    //returns the month that follows this.month
    public String nextMonth() {
        String nextMonth = "";
        for (int i = 0; i < months.length; i++) {
            if(this.month.equals(months[i])) {
                if (i == months.length - 1) {
                    nextMonth = months[0];
                }
                else {
                    nextMonth = months[i+1];
                }
            }
        }
        return nextMonth;
    }

    //returns the number of days in this.month
    public int daysInMonth() {
        int days;

        if(this.month.equals("September") || this.month.equals("April") || this.month.equals("June") || this.month.equals("November")) {
            days = 30;
        }
        else if (this.month.equals("February")) {
            days = this.isLeapYear() ? (29) : (28);
        }
        else {
            days = 31;
        }

        return days;
    }

    //returns the next Day 
    public Day nextDay() {
        Day next_day;
        if (this.day == this.daysInMonth()) {
            if (this.month.equals(months[months.length-1])) {
                next_day = new Day(this.nextMonth(), 1, this.year + 1);
            }
            else {
                next_day = new Day(this.nextMonth(), 1, this.year);
            }
        }
        else {
            next_day = new Day(this.month, this.day + 1, this.year);
        }
        
        return next_day;
    }

    //looks at the User class
    //and its users ArrayList
    //goes through all users which I declared at the top of main method
    //if myDay is the same as a user's date it prints out:
    // HAPPY BIRTHDAY <name> <surname>
    public void printBirthdayPeople() {
        for (User user : User.registeredUsers) {
            if (user.birthday.day == this.day && user.birthday.month.equals(this.month) && user.birthday.year == this.year) {
                System.out.println("HAPPY BIRTHDAY " + user.name + " " + user.surname);
            }
        }
    }

    /**
     * will return a boolean value
     * showing whether entered date is actually
     * today's date
    */
    public boolean isToday() {
        Calendar today = Calendar.getInstance();
        if (this.month.equals(months[today.get(Calendar.MONTH)]) && this.day == today.get(Calendar.DATE) && this.year == today.get(Calendar.YEAR)) {
            return true;
        }
        return false;
    }

}