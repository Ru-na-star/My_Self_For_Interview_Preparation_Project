package oop;

public class CreateCreditCardNumber extends ModernCar implements Car,Eno  {

  public void account(){


  }


    public void run() {
        System.out.println("hello");
    }

    public void son() {
        System.out.println("open account");
    }

    public void startCar() {
        System.out.println("close account");
    }

    public void stopCar() {
        System.out.println("security");
    }

    public void steering() {
        System.out.println("loan");
    }

    public void cameras() {
        System.out.println("parmission");
    }

    public void customers() {
        System.out.println("start giving loan");
    }

    public void bankAccount() {
        System.out.println("wanna close account ");
    }


    public static void main(String[] args) {

        CreateCreditCardNumber card=new CreateCreditCardNumber();
        card. startCar();
        card. customers();
        card. run();

        Car car=new CreateCreditCardNumber();
        car. startCar();

        CreditCard cardNumber =new CreateCreditCardNumber();
      Eno cardNumber2 =new CreateCreditCardNumber();
      cardNumber2. startCar();
      cardNumber2.steering ();

      ((CreateCreditCardNumber) cardNumber2).account();
        ModernCar car6=new CreateCreditCardNumber();
        car6.number();

    }


    public void number1() {
        System.out.println("wanna close account ");
    }

    public void number2() {
        System.out.println("wanna close account ");
    }

    public void number3() {
        System.out.println("wanna close account ");
    }
}
