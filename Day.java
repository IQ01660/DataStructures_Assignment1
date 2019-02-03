public class Day {

    private int year;

    // returns true if this is a leap year, and false otherwise
    public boolean isLeapYear() {
	// a year is a leap year if it is divisible by 4 and not 100,
	// or if it is divisible by 400
	if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) return true;
	else return false;
    }

    public void setYear(int y) {
	year = y;
    }

    public int getYear() {
	return year;
    }

}