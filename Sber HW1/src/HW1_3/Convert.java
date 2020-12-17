package HW1_3;

import java.util.Scanner;

import static HW1_3.Constant.*;

public class Convert {



    public static double CelsToFar (int c) {
        double result;
        result = c * COEF + FAR;
        return result;
    }

    public static double CelsToKelv (int c) {
        double result;
        result = c + KELV;
        if (result<0){
            System.out.println("Значение по Кельвину не может быть меньше 0");
            return 0;
        }
        return result;
    }
}
