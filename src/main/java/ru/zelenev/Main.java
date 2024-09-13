package ru.zelenev;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        double s1, s2, s3, s4, s, r1, r2, r3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус меньшей окружности: ");
        r1 = sc.nextDouble();
        System.out.print("Введите радиус меньшей окружности: ");
        r2 = sc.nextDouble();
        System.out.print("Введите радиус меньшей окружности: ");
        r3 = sc.nextDouble();
        s1 = ((Math.pow(r1, 2) * PI) / 4);
        s2 = (((Math.pow(r2, 2) * PI)) - ((Math.pow(r1, 2) * PI))) * 3 / 8;
        s3 = ((Math.pow(r3, 2) * PI) - (Math.pow(r2, 2) * PI)) / 2;
        s4 = (((Math.pow(r3, 2) * PI) * 4) - ((Math.pow(r3, 2)) * PI)) * 3 / 8;
        s = s1 + s2 + s3 + s4;
        System.out.println(s);
        sc.close();

        /*if (r1 < r2 && r2 < r3) {
            System.out.println("Данные удволетворяют условию");
        } else {
            System.out.println("Данные противоречат условию");
        }*/


    }
}