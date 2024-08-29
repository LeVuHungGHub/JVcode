
package btvn_27082024;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int max=0;
        int min=0;
        Scanner keyboard = new Scanner (System.in);
        for(int i=0; i<5 ;i++){
            System.out.print("Gia tri thu "+(i+1)+":");
            numbers[i] = keyboard.nextInt();
            if(i==1){
                max=numbers[i];
            } else if(numbers[i]>max){
                max = numbers[i];
            }             
        }
        for(int i=1; i<5; i++){
            if(i==1){
                min=numbers[i];
            } else if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.print("Gia tri lon nhat trong mang la:"+max);
        System.out.print("\nGia tri nho nhat trong mang la:"+min);
    }
}
