import java.util.Scanner;

public class Main {

    private byte a = -128;
    private byte b = 127;

    private short c = 2000;
    private int d = 3000;
    private long e = 4000;

    private float f = 2.0f;
    private double g = 2.0;

    private char ch = 'a';
    private Boolean s = true;


    public static void main(String[] args) {
        int a = doThreeOne(1, 2, 3, 4);
        System.out.println(a); //2

        double b = doThreeTwo(1, 2, 3, 4.0);
        System.out.println(b); //2.75

        System.out.println(doFour(1, 2));
        System.out.println(doFour(4, 6));
        System.out.println(doFour(5, 8));
        System.out.println(doFour(9, 11));
        System.out.println(doFour(14, 11));

        doFive(-10);
        doFive(0);
        doFive(4);

        System.out.println(doSix(-3));
        System.out.println(doSix(4));

        doSeven("a"); //см. комментарий

        doEight(4);
        doEight(100);
        doEight(400);


    }

    private static int doThreeOne(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    private static double doThreeTwo(int a, int b, int c, double d) {
        return a * (b + (c / d));
    }

    private static boolean doFour(int a, int b) {
        if (a + b >= 10 & a + b <= 20) {
            return true;
        } else return false;
    }

    private static void doFive(int a) {
        if (a >= 0) {
            System.out.println("Передано положительное число");
        } else System.out.println("Передано отрицательное число");
    }

    private static boolean doSix(int b) {
        if (b < 0) {
            return true;
        } else return false;
    }

    private static void doSeven(String a) { // знаю что а никак не используется , сделал через Сканнер
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String str = sc.next();
        System.out.println("Привет, " + str + "!");
    }

    private static void doEight(int a) {
        if (a % 4 == 0 & a % 100 != 0) {
            System.out.println("Год високосный!");

        } else if (a % 400 == 0) System.out.println("Год високосный!");
        else System.out.println("Год не високосный!");
    }

}
