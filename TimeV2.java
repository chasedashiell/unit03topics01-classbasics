public class TimeV2 {

    // TODO: your code works and uses the same philosophy as the Student example I did in class. However, the README asked that your one instance variable represented the number of seconds since midnight (which yours doesn't currently do). Try re-coding this class to use that representation; I think it'd be good practice.
    int allInOne;

    public TimeV2(int timeHours, int timeMinutes, int timeseconds){
        allInOne = timeHours;
        allInOne *= 100;
        allInOne += timeMinutes;
        allInOne *= 100;
        allInOne += timeseconds;
    }

    public int getHours(){
        return allInOne / 10000;
    }

    public int getMinutes(){
        return allInOne / 100 % 100;
    }

    public int getSeconds(){
        return allInOne % 100;
    }

    public String toString(){
        return getHours() + ":" + getMinutes() + ":" + getSeconds();
    }
    public static void main(String[] args) {
        TimeV2 one = new TimeV2(13, 36, 21);
        System.out.println(one.toString());
    }
}