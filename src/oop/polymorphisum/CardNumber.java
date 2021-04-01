package oop.polymorphisum;

public class CardNumber extends MethodOverRiding {


    public static void capitalOne(String accountNumb,int number,double money){

        String newAccountUnm=accountNumb;
        int newNumber=number;
        double transForMoney=money;
        byte numbert=44;
        System.out.println("My new account Number is :"+accountNumb+"My New Number is:"+number+"Transfor Balance is:"+money+"number is:"+numbert);
    }
   public static  String name="Runa ";





    public static void main(String[] args) {

        CardNumber card=new CardNumber();
        card.capitalOne("456",345,338);

        System.out.println(name.toString());
    }




    public  int creditCard(int num,int num2){
        int num1=num;
        int num3=num2;
        System.out.println(num1+num2);
        return num1;
    }


    }












