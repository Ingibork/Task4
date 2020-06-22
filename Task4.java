package task;
/*
Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методо main, данный метод будет принимает два параметра и будет отвечать
на вопрос спать ли дальше. Параметр boolean weekday обозначает рабочий день, параметр boolean vacation обозначает отпуск.
 Если у нас отпуск или не рабочий день то мы можем спать дальше
 */
public class Task4 {
    public static void main(String[] args) {

        boolean weekday = false;
        boolean vacation = true;
        sleepIn(weekday, vacation);

    }

    public static void sleepIn(boolean weekday, boolean vacation) {

        if (weekday) {
            weekday = true;
            System.out.println("Рабочий день");
        }
        if (vacation) {
            vacation = true;
            System.out.println("Идём спать дальше");
        }
    }
}
