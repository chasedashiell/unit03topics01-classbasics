public class TimeV2 {

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