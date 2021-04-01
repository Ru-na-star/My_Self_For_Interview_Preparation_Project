package advance;

import java.util.Scanner;

public class LearnIfElseIf {


    public static void ageCalculation(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your age");

        int number=input.nextInt();

        if(number>25&& number<35){
            System.out.println("Your age is more than 30");
        }else if(number >=30 &&number<=40){
            System.out.println("Your age is more than 40");
        }else if(number >40 && number<=50){
            System.out.println("your age is more than 50");
        }else {
            System.out.println("this is your retaiinment time");
          input.close();
        }


    }

    public static void main(String[] args) {

        LearnIfElseIf.ageCalculation();





    }










}
