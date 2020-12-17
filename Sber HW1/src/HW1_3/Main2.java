package HW1_3;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Convert a = new Convert();
        int c = setCels();
        System.out.println("Градусы по Фаренгейту: " + a.CelsToFar(c));
        System.out.println("Градусы по Кельвину: " + a.CelsToKelv(c));


    }



    public static int setCels (){
        int c;
        System.out.println("Введите градусы Цельсия:");
        c = new Scanner(System.in).nextInt();
        return c;
    }
}
