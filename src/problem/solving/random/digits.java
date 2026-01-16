package problem.solving.random;

import java.util.Scanner;

public class digits {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //Given a number N. Print the digits of that number from right to left separated by space.
        int numTest=input.nextInt();
        for(int i=0;i<numTest;i++){
            int num=input.nextInt();
            if(num==0){
                System.out.println(0);
                continue;
            }
            while(num>0){
               int reminder=(int) (num%10);
                System.out.print(reminder+" ");
                num/=10;
            }
            System.out.println();
        }
    }
}
