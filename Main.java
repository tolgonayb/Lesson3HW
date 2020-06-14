package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        double[] num = {-22.1, -48.365, -5.67, -55.77, -99.789, -66.45, 26.25, 61.34, 13.90, 84.456, 152.3, 77.333, 111.64, 7.098, 36.277};
        System.out.println(Arrays.toString(num));

        double sum = 0.0;
        if (num.length <= 0) ;
        for (int i = 0; i < num.length; i++) {

        }


        for (double x : num) {
            sum += x;
            double average = sum / num.length;

        }


        System.out.print("среднее арифметическое чисел равно: " + sum / num.length);


    }

}




