package com.epam.rd.autotasks.snail;
import java.util.Scanner;

public class Snail
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), h = in.nextInt();
        int current = 0;
        int days = 0;

        while (current < h) {
            days++;
            current += a;
            if (current >= h || current > 999) break;
            current -= b;
        }

        System.out.println(days);
    }
}
