package Basics.New_02_09;

import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a pattern rows & columns \t");
        int a=sc.nextInt();
        double rounded_float=Math.round((double)a/2);
        int center_number=(int) rounded_float;
        int j,i;
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

            
            // System.out.println("----N----");
            // System.out.println(center_number);
            // for(int i=1;i<=a;i++){
            //     for(int j=1;j<=a;j++){
            //         if(i==j || j==a-i+1){
            //             System.out.print("*");
            //         }
            //         else{
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            // }


        // for(int i=1;i<=a;i++){
        //     for(int j=1;j<=a;j++){
        //         if 
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print("|");
        //         }
        //     }
        //     System.out.println();
        // }

        // int num=0;
        // int myNum;
        // for(int i=1;i<=a;i++){
        //     num=(i<=center_number)?i-1:a-i;
        //     for(int j=1;j<=a;j++){
        //         myNum=(j<=center_number)?num+=1:num--;
        //         System.out.print(num);
        //     }
        //     System.out.println();
        // }
        // sc.close();

        // int num=0;
        // for(i=1;i<=a;i++){
        //     num=(i<=center_number)?i:a-i+1;
        //     for(j=1;j<=a;j++){
        //         if(i==j || (j==a-i+1)){
        //             System.out.print(num);
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // sc.close();

        // for(i=0;i<a;i++){
        //     for(j=1;j<=i;j++){
        //         System.out.print(" ");
        //     }
        //     for(j=1;j<=a;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        int num=1;
        int a1=1;
        for(i=1;i<=a;i++){
            for(j=1;j<=a-i+1;j++){
                System.out.print(num+++" ");
            }
            System.out.println();
        }
    }
}
