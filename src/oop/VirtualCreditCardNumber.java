package oop;

public class VirtualCreditCardNumber  {
 String address;
    public void startCar() {
        System.out.println("This is an interface ");
    }

    public void stopCar() {
        System.out.println("Hello ");
    }

    public void steering() {
int num=60;
int serial=23;
int total=num*serial;
        System.out.println(total);
    }

    public void cameras() {

    }

    public String bankAccount(String address){
       String num=address;
        System.out.println(num);
        return num;

    }

    public static void main(String[] args) {
        //System.out.println( VirtualCreditCardNumber.address);


    VirtualCreditCardNumber virtual=new VirtualCreditCardNumber();
    virtual.bankAccount("Bangladesh");

   // Car modern=new VirtualCreditCardNumber();
//modern.startCar();
//modern.bankAccount();



    }



}

