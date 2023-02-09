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
        System.out.println("Задача 1");

        int start = 0;
        int amountAccumulation = 15000; //сумма накопления
        int numberMonth = 0;

        while (start <= 2_459_000) {
            start = start + amountAccumulation;
            numberMonth++;
            System.out.println("Месяц № " + numberMonth + ", сумма накоплений равна " + start + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        int populationOfTheCountry = 12_000_000; //население страны
        int natality = 17; //рождаемость на 1000 чел
        int mortality = 8; //смертность на 1000 чел
        int populationGrowth = natality - mortality; //естественный прирост на 1000 чел

        for (int year = 1; year <= 10; year++) {
            populationOfTheCountry = populationOfTheCountry + (populationOfTheCountry / 1000 * populationGrowth);
            // populationOfTheCountry += populationOfTheCountry / 1000 * populationGrowth;
            System.out.println("Год № " + year + ", численность населения составляет " + populationOfTheCountry);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int depositSum = 15_000;
        double savingEveryMonth = 0.07;
        int month = 1;

        while (depositSum <= 12_000_000) {
            depositSum += (depositSum * 7 / 100);
            System.out.println("Месяц № " + month + ", накопление составляет " + depositSum);
            month++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");

        int depositSum = 15_000;
        double savingEveryMonth = 0.07;
        int month = 1;

        while (depositSum <= 12_000_000) {
            depositSum += depositSum * 7 / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц № " + month + ", накопление составляет " + depositSum);
            }
            month++;
        }
    }

    public static void task6() {
        System.out.println("Задача 6");

        int depositSumVasiliy = 15_000;
        double savingEveryMonth = 0.07;

        for (int month = 1; month <= 108; month++) {
            depositSumVasiliy += depositSumVasiliy * 7 / 100;
            if (month % 6 == 0) {
                System.out.println("Месяц № " + month + ", накопление составляет " + depositSumVasiliy);
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");

        int dayFriday = 5;

        for (dayFriday = 1; dayFriday <= 31; dayFriday++) {
            if(dayFriday % 5 == 0) {
                System.out.println("Сегодня пятница, " + dayFriday +"-е число. Необходимо подготовить отчет");
            }
        }
    }
    public static void task8() {
        System.out.println("Задача 8");

        int yearGoingCometa = 79;
        int thisYear = 2023;
        int startInterval = thisYear - 200;
        int finishInterval = thisYear + 100;


        for (int i = startInterval; i <= finishInterval; i++) {
            if(i % yearGoingCometa == 0) {
                System.out.println(i);
            }
        }
    }
}
