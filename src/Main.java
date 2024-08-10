import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkLeapYear(2024);

        checkClientOSAndYear(1, 2023);

        int deliveryDistance = checkDaysForDelivery(40);
        System.out.println(deliveryDistance);
    }

    //Task 1
    public static void checkLeapYear(int year) {
        if (year < 1584) {
            System.out.println("Год не является високосным.");
        } else {
            if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
                System.out.println("Год является високосным.");
            } else {
                System.out.println("Год не является високосным.");
            }
        }
    }

    //Task 2
    public static void checkClientOSAndYear(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0) {
            if (clientDeviceYear <= currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear <= currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        }

    }

    //Task 3
    public static int checkDaysForDelivery(int distance) {
        int deliveryTime;

        if (distance <= 20) {
            deliveryTime = 1;
        } else if (distance > 20 && distance <= 60) {
            deliveryTime = 2;
        } else if (distance > 60 && distance <= 100) {
            deliveryTime = 3;
        } else {
            deliveryTime = -1;
        }
        return deliveryTime;
    }
}