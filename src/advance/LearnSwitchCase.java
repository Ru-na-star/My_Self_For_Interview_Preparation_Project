package advance;

import java.util.Scanner;

public class LearnSwitchCase {
    public static void main(String[] args) {
Scanner scan =new Scanner(System.in);

        System.out.println("Enter you number");
int number=scan.nextInt();

        String foodName=scan.nextLine();
scan.close();

//double money=60.80;

switch (number){
    case 1:

        foodName="fish";
        break;


            case 2:
    foodName="potato";

    break;

            case 3:
                foodName="pizza";

    break;
            default:

                foodName="Invalid";
break;
        }
        System.out.println("You have selected :"+foodName);

    }



}
