import java.time.Year;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("task1");
        int total = 0;
        int mes = 1;
        while (total < 2_459_000) {
            total = total + 15_000;
            System.out.println("Месяц " + mes + ", сумма накоплений равна " + total + " рублей");
            mes = mes + 1;
        }
    }

    public static void task2() {
        System.out.println("task2");
        System.out.println("while");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        System.out.println("for");
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("task3");
        int numberPeopleY = 12_000_000;
        int fertilityPeopleY = 17 * numberPeopleY / 1000;
        int mortalityPeopleY = 8 * numberPeopleY / 1000;
        int sumYearNumberPeopleY = 0;
        int i = 0;
        while (i < 10) {
            i++;
            sumYearNumberPeopleY = (numberPeopleY + fertilityPeopleY - mortalityPeopleY) * i;
            System.out.println("Год " + i + ", численность населения составляет " + sumYearNumberPeopleY);
        }
    }

    public static void task4() {
        System.out.println("task4");
        int salary = 15000;
        double totalContribution = 0.;
        int contribution = 0;
        double totalPenny = salary;
        int percentInMonth = 7;
        for (int i = 1; totalPenny <= 12_000_000; i++) {
            totalPenny = totalPenny + totalPenny * percentInMonth / 100;
            contribution = (int) (totalPenny * 100);
            totalContribution = contribution / 100.;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalContribution + " рублей");
        }
    }

    public static void task5() {
        System.out.println("task5");
        int salary = 15000;
        double totalContribution = 0.;
        int contribution = 0;
        double totalPenny = salary;
        int percentInMonth = 7;
        for (int i = 1; totalPenny <= 12_000_000; i++) {
            totalPenny = totalPenny + totalPenny * percentInMonth / 100;
            contribution = (int) (totalPenny * 100);
            totalContribution = contribution / 100.;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + totalContribution + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("task6");
        int salary = 15000;
        double totalContribution = 0.;
        int contribution = 0;
        double totalPenny = salary;
        int percentInMonth = 7;
        int year = 9;
        int yearMonth = 9 * 12;
        for (int i = 1; i <= yearMonth; i++) {
            totalPenny = totalPenny + totalPenny * percentInMonth / 100;
            contribution = (int) (totalPenny * 100);
            totalContribution = contribution / 100.;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений равна " + totalContribution + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("task7");
        int Friday = 2;
        int dayMonth = 31;
        for (int i = Friday; i <= 31; i = i + 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("task8");
        int year = 2023;
        int minYear = year - 200;
        int maxYear = year + 100;
        for (int i = 0; i <= maxYear; i = i + 79) {
            if (i >= minYear) {
                System.out.println(i);
            }
        }
    }

}