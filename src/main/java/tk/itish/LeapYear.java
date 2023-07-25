package tk.itish;
// a class to test if leap year
public class LeapYear {
    // test method here
    public boolean isLeapYear(int year) {
        if(year % 100 == 0){
            return false;
        }
        else if(year % 4 == 0){
            return true;
        }
        return false;
    }
}
