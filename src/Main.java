public class Main {
    public static void main(String[] args) {
        homework1();
        homework2();
        homework3();
    }

    public static void homework1() {

        System.out.println("\nHomework 1 \ntask 1");

        int salary1 = 65535;
        int bank = 0;
        int n = 0;
        for (; bank < 1_000_000; n++) {
            bank = bank + (bank / 100);
            bank = bank + salary1;
            if (n % 5 == 0) {
                System.out.println(bank);
            }
            // System.out.println("месяц " + n + " сумма накоплений равна " + bank);
        }
        //System.out.println(bank);
        //System.out.println(i);


        int salary = 65535;
        int piggyBank = 0;
        while (piggyBank < 2_459_000) {
            piggyBank = piggyBank + piggyBank / 100;
            piggyBank = piggyBank + salary;
            System.out.println(piggyBank + " ruble");
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

        int Y = 12_000_000;
        double year = 0;
        double rojdaemost = (double) 17 / 1000;
        double smertnost = (double) 8 / 1000;

        while (year < 10) {
            Y = (int) (Y + (Y * rojdaemost) - (Y * smertnost));
            year++;
            System.out.println(Y);
        }
    }

    public static void homework2() {

        System.out.println("\nHomework 2 \nTask 1");

        int salaryVasiliy = 65_535;
        int moneyWallet = 15_000;
        int b = 0;
        double procentBank = (double) 7 / 100;
        for (; moneyWallet < 12_000_000; b++) {
            moneyWallet = moneyWallet + salaryVasiliy;
            moneyWallet = (int) (moneyWallet + (moneyWallet * procentBank));
            System.out.println(b + " mounth - " + moneyWallet + " rub");
        }

        System.out.println("\nTask 2");

        int salaryVasiliy1 = 65_535;
        int moneyWallet1 = 15_000;
        int b1 = 0;
        double procentBank1 = (double) 7 / 100;
        for (; moneyWallet1 < 12_000_000; b1++) {
            moneyWallet1 = moneyWallet1 + salaryVasiliy1;
            moneyWallet1 = (int) (moneyWallet1 + (moneyWallet1 * procentBank1));
            if (b1 % 6 == 0) {
                System.out.println(b1 + " mounth - " + moneyWallet1 + " rub");
            }
        }

        System.out.println("\nTask 3");

        int salaryVasiliy3 = 65_535;
        int moneyWallet3 = 15_000;
        int b3 = 0;
        double procentBank3 = (double) 7 / 100;
        for (; b3 <= 108; b3++) {
            moneyWallet3 = moneyWallet3 + salaryVasiliy3;
            moneyWallet3 = (int) (moneyWallet3 + (moneyWallet3 * procentBank3));
            if (b3 % 6 == 0) {
                System.out.println(b3 + " mounth - " + moneyWallet3 + " rub");
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
        for (int y = 1822; y <= 2122; y++) {
            if (y % kometa == 0) {
                System.out.println(y + " year.");
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
