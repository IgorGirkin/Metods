import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void leapYear (int year) {
        if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
            System.out.println(year + " - високосный год.");
           } else {
            System.out.println(year+" - не високосный год.");
        }
    }
    public static void choosingSmartphoneOS (int clientDeviceYear,int clientOS) {
         int currentYear = LocalDate.now().getYear();
         if (clientOS == 0&&clientDeviceYear<currentYear) {
                System.out.println("Установите lite-версию приложения для iOS по " +
                        "ссылке!");
             } else if (clientOS == 1&&clientDeviceYear<currentYear) {
            System.out.println("Установите lite-версию приложения для Android по" +
                    " ссылке!");
        }
    }
    public static int sumOfDeliveryDays (int num) {
        int distance =0;
        if(num<20) {
            distance += 1;
            } else if (num>=20&&num<=60) {
           distance+=2;
        } else if (num>60&&num<=100) {
            distance+=3;
        } else {
            System.out.println("С Вами свяжется менеджер!");
        }
        return distance;
    }
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println("Введите год в консоль:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        leapYear(year);
        //
        System.out.println("Задача 2");
        System.out.println("Введите год выпуска Вашего смартфона:");
        int clientDeviceYear = scanner.nextInt();
        System.out.println("Тип операционной системы (ОС) ( 0 — iOS или 1 — Android )");
        int clientOS = scanner.nextInt();
        choosingSmartphoneOS(clientDeviceYear, clientOS);
        //
        System.out.println("Задача 3");
        System.out.println("Дистанция (км):");
        int km = scanner.nextInt();
        int deliveryDays =sumOfDeliveryDays(km);
        System.out.println("Итоговое количество дней доставки: "+deliveryDays);
    }
}