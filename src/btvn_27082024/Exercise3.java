
package btvn_27082024;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int numbers[] = new int[5];
        double sum = 0;
        double average = 0;
        Scanner keyboard = new Scanner(System.in);
        for(int i=0; i<5; i++){
            System.out.print("Gia tri thu "+(i+1)+":");
            numbers[i] = keyboard.nextInt();
            sum+=numbers[i];
        }
        for(int i=0; i<5; i++){
            average = sum/numbers[i];
        }
        System.out.println("Tong cac so trong mang la:"+sum);
        System.out.println("Trung binh cong cua mang la:"+average);
    }
}
