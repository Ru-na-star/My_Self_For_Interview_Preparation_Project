package advance;

import java.util.Scanner;

public class LearnForLoop {

    public static void main(String[] args) {


//        for (int number = 60; number >= 50; number--) {
//            System.out.println("Int Number is :" + number);
//        }
//
//        System.out.println("**************************");
//
//        for (int i = 0; i <= 5; i++) {
//
//            System.out.println("Hello");
//            for (int j = 0; j <= 7; ++j) {
//                System.out.println(" J is less than 7 " + j);
//            }
//
//        }
    Scanner input =new Scanner(System.in) ;
        System.out.println("Enter your RowNum");
  int rowNum=input.nextInt();
  for (int i=1;i<=rowNum;i++){
      for (int j=1;j<=i;j++) {
          System.out.print(" "+j);
      }
      System.out.println();
  }







    }




}


