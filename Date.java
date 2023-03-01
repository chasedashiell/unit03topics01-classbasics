public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int dateMonth, int dateDay, int dateYear){
        month = dateMonth;
        day = dateDay;
        year = dateYear;
    }

    public int getMonth(){
        return month;
    }

    public int getDay(){
        return day;
    }

    public int getYear(){
        return year;
    }

    public String toString(){
        return getMonth() + "/" + getDay() + "/" + getYear();
    }
    public static void main(String[] args) {
        Date one = new Date(11, 9, 2004);
        System.out.println(one.toString());
    }
}