package practiceprograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        System.out.print(a + " " + b);
        for(int i = 0; i <= num; i++){
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
