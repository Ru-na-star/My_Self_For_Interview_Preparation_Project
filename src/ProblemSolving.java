import java.util.Scanner;

public class ProblemSolving {

    /**
     * This method will take eligible to vote
     * authore Runa
     * Date:35/30
     */

    public static void checkEligibleForVote(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter Your Age");

      int age = input.nextInt();

      if ( age >=18){
          System.out.println("Eligible For Vote");
      }else {
          System.out.println("Not eligible For vote");

      }

        input.close();







    }


    public static void main(String[] args) {

        ProblemSolving.checkEligibleForVote();










    }
















}
