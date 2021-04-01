package oop.polymorphisum;

public class MethodOverRiding {

    public static void capitalOne(String accountNumb,int number,double money){

        String newAccountUnm=accountNumb;
        int newNumber=number;
        double transForMoney=money;
        System.out.println("My new account Number is :"+accountNumb+"My New Number is:"+number+"Transfor Balance is:"+money);
    }
//    public  static void capitalOne(String accountNumb,int number,double money,boolean isAvalable){
//
//        String newAccountUnm=accountNumb;
//        int newNumber=number;
//        double transForMoney=money;
//        boolean isAvalaableOk=isAvalable;
//        System.out.println("My new account Number is :"+accountNumb+"My New Number is:"+"Transfor Balance is:"+money+"Is Avalable Okay:"+isAvalaableOk);
//    }


    public static void main(String[] args) {
        MethodOverRiding riding=new MethodOverRiding();
//        riding. capitalOne("23456789",435678956,458.00);
//        riding. capitalOne("23456789",435678956,458.00,true);
//        MethodOverRiding. creditCard(45);
//        MethodOverRiding. creditCard(45,68);
    }

// public  static int creditCard(int num){
//    int num1=num;
//        System.out.println(num1);
//        return num1;
//    }
      public  int creditCard(int num,int num2){
    int num1=num;
    int num3=num2;
        System.out.println(num1+num2);
        return num1;
    }






}
