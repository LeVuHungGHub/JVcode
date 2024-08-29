
package btvn_27082024;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numbers[] = new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Gia tri thu "+(i+1)+":");
            numbers[i]=keyboard.nextInt();     
        }
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(numbers[i]>numbers[j]){
                    int z=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=z;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.println("Mang sau khi sap xep tang dan:"+numbers[i]);
        }
    }
}
