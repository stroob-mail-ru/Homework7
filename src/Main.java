public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Задача 1");

        int deposit = 15_000;
        int total = 0;
        int month = 1;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }

        System.out.println();
        System.out.println("Задача 2");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println();
        System.out.println("Задача 3");

        int population = 12_000_000;
        int birthRatePer1000 = 17;
        int mortalityPer1000 = 8;
        for (int yaer = 1; yaer <= 10; yaer++) {
            population = population + (population / 1000 * birthRatePer1000) - (population / 1000 * mortalityPer1000);
            System.out.println("Год " + yaer + ", численность населения составляет " + population);
        }

        System.out.println();
        System.out.println("Задача 4");

        total = 0;
        month = 1;
        while (total <= 12_000_000) {
            total = total + total / 100 * 7;
            total = total + deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }

        System.out.println();
        System.out.println("Задача 5");

        total = 0;
        month = 1;
        while (total <= 12_000_000) {
            total = total + total / 100 * 7;
            total = total + deposit;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
            month++;
        }

        System.out.println();
        System.out.println("Задача 6");

        int yaer = 9;
        int monthTotal = yaer * 12;
        total = 0;
        for (month = 1; month <= monthTotal; month++) {
            total = total + total / 100 * 7;
            total = total + deposit;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }

        System.out.println();
        System.out.println("Задача 7");

        int oneFriday = 3;

        int twoFriday = oneFriday + 7;
        int treeFriday = twoFriday + 7;
        int fourFriday = treeFriday + 7;
        int fiveFriday = fourFriday + 7;
        for (int day = 1; day <= 31; day++) {
            if (day == oneFriday || day == twoFriday || day == treeFriday || day == fourFriday || day == fiveFriday) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }

        System.out.println();
        System.out.println("Задача 8");

        int currentYaer = 2023;

        int ago200yaers = currentYaer - 200;
        int in100yaers = currentYaer + 100;
        for (yaer = ago200yaers; yaer <= in100yaers; yaer++) {
            if (yaer % 79 == 0) {
                System.out.println();
                System.out.println(yaer);
            }
        }
    }
}