package oop;

import java.util.Scanner;

public class FindOutLargestNumber {





  public static  void largestNumber() {
      int x;
      int y;
      int z;

      Scanner scan=new Scanner(System.in)   ;
      System.out.println("Enter your x Number");
    x=scan.nextInt();
      System.out.println("Enter your y Number");
     y=scan.nextInt();
      System.out.println(" Enter your z number ");
     z=scan.nextInt();
     if(x>=z&& x>=y){
         System.out.println("Number is Greater Than x");
     }else if(y>=z&&y>=x ){
         System.out.println("Largest Number is y");
     }else if( z>=x &&z>=y){
         System.out.println("Gratest Number is z");
     }else{
         System.out.println("invilld Number");
     }


  }

    public static void main(String[] args) {
        FindOutLargestNumber.largestNumber();
    }







}
