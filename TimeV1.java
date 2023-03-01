public class TimeV1 {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeV1(int timeHours, int timeMinutes, int timeseconds){
        hours = timeHours;
        minutes = timeMinutes;
        seconds = timeseconds;
    }

    public int getHours(){
        return hours;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getSeconds(){
        return seconds;
    }

    public String toString(){
        return getHours() + ":" + getMinutes() + ":" + getSeconds();
    }
    public static void main(String[] args) {
        TimeV1 one = new TimeV1(13, 36, 21);
        System.out.println(one.toString());
    }
}
