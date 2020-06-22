package task;
/*
4. Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методо main.
 4.1 Данный метод будет принимает два параметра
 4.2 Будет отвечать на вопрос спать ли дальше (возвращать true либо false).
 4.3 Первый параметр boolean weekday обозначает рабочий день
 4.4 Второй параметр boolean vacation обозначает отпуск.
 4.5 Если у нас отпуск или не рабочий день то мы можем спать дальше (Взято с https://codingbat.com/prob/p187868).
 4.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу
  */
public class Task4 {
    public static void main(String[] args) {

        boolean vacation = true;
        boolean weekday = false;

        sleepIn(weekday, vacation);

    }

    public static void sleepIn(boolean weekday, boolean vacation) {

        if (weekday) {
            weekday = true;
            System.out.println("Идём на работу");
        }
        if (vacation) {
            vacation = true;
            System.out.println("Идём спать дальше");
        }
    }
}
