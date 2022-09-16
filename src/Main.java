public class Main {
    public static void main(String[] args) {
        homework1();
        homework2();
        homework3();
    }

    public static void homework1() {

        System.out.println("\nHomework 1 \ntask 1");

        int salary = 65535;
        int piggyBank = 0;
        int piggyBankComplited = 2_459_000;
        int f = 0;
        while (piggyBank <= piggyBankComplited) {
            piggyBank = piggyBank + piggyBank / 100;
            piggyBank = piggyBank + salary;
            f++;
            System.out.println("mounth " + f + " bill " + piggyBank + " ruble");
        }

        System.out.println("\nTask 2");

        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nTask 3");

        int y = 12_000_000;
        double year = 0;
        double rojdaemost = (double) 17 / 1000;
        double smertnost = (double) 8 / 1000;

        while (year < 10) {
            y = (int) (y + (y * rojdaemost) - (y * smertnost));
            year++;
            System.out.println(y);
        }
    }

    public static void homework2() {

        System.out.println("\nHomework 2 \nTask 1");

        int salaryVasiliy = 65_535;
        int moneyWallet = 15_000;
        int b = 0;
        int bill1 = 12_000_000;
        double procentBank = (double) 7 / 100;
        for (; moneyWallet < bill1; b++) {
            moneyWallet = moneyWallet + salaryVasiliy;
            moneyWallet = (int) (moneyWallet + (moneyWallet * procentBank));
            System.out.println(b + " mounth - " + moneyWallet + " rub");
        }

        System.out.println("\nTask 2");

        int salaryVasiliy1 = 65_535;
        int month = 15_000;
        int b1 = 0;
        int bill2 = 12_000_000;
        double procentBank1 = (double) 7 / 100;
        for (; month < bill2; b1++) {
            month = month + salaryVasiliy1;
            month = (int) (month + (month * procentBank1));
            if (b1 % 6 == 0) {
                System.out.println(b1 + " mounth - " + month + " rub");
            }
        }

        System.out.println("\nTask 3");

        int salaryVasiliy3 = 65_535;
        int month1 = 15_000;
        int b3 = 0;
        int monthInYear = 12;
        int saveMonth = monthInYear * 9;
        double procentBank3 = (double) 7 / 100;
        for (; b3 <= saveMonth; b3++) {
            month1 = month1 + salaryVasiliy3;
            month1 = (int) (month1 + (month1 * procentBank3));
            if (b3 % 6 == 0) {
                System.out.println(b3 + " mounth - " + month1 + " rub");
            }
        }

        System.out.println("\nTask 4");

        int firstFriday = 2;
        for (int d = 1; d <= 31; d++) {
            if (d % 7 == 2) {
                System.out.println("Сегодня пятница, " + d + " число. Необходимо подготовить отчет.");
            }
        }
    }

    public static void homework3() {

        System.out.println("\nHomework 3\nTask 1");

        int kometa = 79;
        int yearNow = 2022;
        int yearBefore = yearNow - 200;
        int yearAfter = yearNow + 100;
        for (; yearBefore <= yearAfter; yearBefore++) {
            if (yearBefore % kometa == 0  ) {
                System.out.println(yearBefore + " year.");
            }
        }

        System.out.println("\nTask 2");

        int number = 2;
        for (int q = 1; q < 11; q++) {
            if (q % number == 0) {
                System.out.println("2 * " + q + " = " + number * q);
            }
        }
    }
}
