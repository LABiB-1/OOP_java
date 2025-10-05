package javaapplication4;
import java.util.Scanner;

public class JavaApplication4 {


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int numbers[] = new int[100];
        System.out.print("Number of inputs: ");
        int num = inp.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("Number "+(i+1)+" : ");
            numbers[i] = inp.nextInt();
        }
        System.out.println("\nOutput......");
        int sum = 0;
        for(int i=0;i<num;i++){
            System.out.print(numbers[i]);
            sum+=numbers[i];
            if(i==num-1){
            System.out.print("="+ sum);
            break;
            }
            System.out.print("+");
            
            
        }
        System.out.println("\nSum is: "+sum);
        
    }
    
}
