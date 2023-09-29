package Midterm;

public class DaysInAmonth {
    private int year;
    private int month;
    public DaysInAmonth(int year, int month) {
        this.year = year;
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public String daysInAmonth(){
        String stringrt = "";
        if(month == 1){
            stringrt= "January " + year +" has 31 days";
            return stringrt;
        }
         if(month == 2){
            if(year%4 == 0){
                stringrt= "Febuary " + year +" has 29 days";
            return stringrt;
            }
            else{
            stringrt= "Febuary " + year +" has 28 days";
            return stringrt;
            }
        }
        if(month == 3){
            stringrt= "March " + year +" has 31 days";
            return stringrt;
        }
        if(month == 4){
            stringrt= "april " + year +" has 30 days";
            return stringrt;
        }
        if(month == 5){
            stringrt= "may " + year +" has 31 days";
            return stringrt;
        }
        if(month == 6){
            stringrt= "June " + year +" has 30 days";
            return stringrt;
        }
        if(month == 7){
            stringrt= "July " + year +" has 31 days";
            return stringrt;
        }
        if(month == 8){
            stringrt= "August " + year +" has 31 days";
            return stringrt;
        }
        if(month == 9){
            stringrt= "September " + year +" has 30 days";
            return stringrt;
        }
        if(month == 10){
            stringrt= "October " + year +" has 31 days";
            return stringrt;
        }
        if(month == 11){
            stringrt= "November " + year +" has 30 days";
            return stringrt;
        }
        if(month == 12){
            stringrt= "december " + year +" has 31 days";
            return stringrt;
        }
        else{
            return stringrt;
        }
    }
}
