package Basics.New_02_09;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a pattern rows & columns \t");
        int a=sc.nextInt();
        System.out.println("The pattern for "+a+"X"+a+ " given below");
        // System.out.println("----Same Rows & Columns----");
        // for(int i=1;i<=a;i++){
        //     for(int j=1;j<=a;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // System.out.println("----Like Step----");
        // for(int i=1;i<=a;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // System.out.println("----Like Invert Step----");
        // for(int i=1;i<=a;i++){
        //     for(int j=i;j<=a;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // System.out.println("----Box----");
        // for(int i=1;i<=a;i++){
        //     for(int j=1;j<=a;j++){
        //         if(i==1 || i==a || j==1 || j==a){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // System.out.println("---------Single direction Cross * ---------------");
        // for(int i=1;i<=a;i++){
        //     for(int j=1;j<=a;j++){
        //         if(i==j){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }    
        //     System.out.println();
        // }

        if(a%2==0){
            System.out.println("Please give only odd numbers");
        }
        else{
            double rounded_float=Math.round((double)a/2);
            int center_number=(int) rounded_float;
            System.out.println("----N----");
            System.out.println(center_number);
            for(int i=1;i<=a;i++){
                for(int j=1;j<=a;j++){
                    if(i==j || j==a-i+1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
