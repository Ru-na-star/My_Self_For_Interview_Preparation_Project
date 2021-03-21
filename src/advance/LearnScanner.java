package advance;

import java.util.Scanner;

public class LearnScanner {


    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in) ;
        System.out.println("Enter employe name");
        String name=scan.nextLine();
        System.out.println("employe name is :"+name);
        System.out.println("Enter employee address");
        String address= scan.nextLine();
        System.out.println("employee address is:"+address);
        System.out.println("Enter employee fee");
        int cFee= scan.nextInt();
        System.out.println("employee fee is:"+cFee);
        System.out.println("Enter Total discout");
        double total= scan.nextDouble();
        System.out.println("discout fee is:"+total);
        System.out.println("discount fee is:"+cFee*(total)/100);
        scan.close();




    }










}
