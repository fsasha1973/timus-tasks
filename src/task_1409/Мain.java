package task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class Мain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int numberOfCans = a + b - 1;

        int harri = numberOfCans - a;
        int larri = numberOfCans - b;

        out.println(harri + " " + larri);
        out.flush();
    }
}

