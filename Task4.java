package task;

public class Task4 {
    public static void main(String[] args) {

        boolean vacation = false;
        boolean weekday = true;
        sleepIn(weekday, vacation);
    }

    public static void sleepIn(boolean weekday, boolean vacation) {

        if (weekday) {
            weekday = true;
            System.out.println("Идем на работу");
        }
        if (vacation) {
            vacation = false;
            System.out.println("Идём спать дальше");
        }
    }
}

