package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[20];
        int total = 19;
        
        for(int i = 0; i < 20; i++) {
            n[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 10; i++) {
            int aux = n[i];
            n[i] = n[total];
            n[total] = aux;
            total -= 1;
        }
        for(int i = 0; i < 20; i++) {
            System.out.println("N[" + i + "] = " + n[i]);
        }
    }
}
