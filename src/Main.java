import java.time.LocalDate;

public class Main {


    public static void year(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println( year + " год является високосным");

        } else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println();
    }
    public static void os (int currentYear, int os) {
        if (os == 0 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (os == 1 && currentYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (os == 0 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (os == 1 && currentYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
    }
public static void dilivery (int distance) {
    if(distance <= 20) {
        System.out.println("Потребуется 1 день на доставку" );
    }
    if (distance > 20 && distance <= 60) {
        System.out.println("Потребуется 2 дня на доставку");
    }
    else if (distance > 60 && distance <= 100) {
        System.out.println("Потребуется 3 дня на доставку");
    }

}

    public static void main(String[] args) {
        int years = 2022;
        year(years);
        int currentYear = LocalDate.now().getYear();
        int clientOs = 0;
        os(currentYear,clientOs);
        int diliveryDistance = 95;
        dilivery(diliveryDistance);
    }

}