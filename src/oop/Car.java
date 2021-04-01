package oop;

public interface Car extends CreditCard {

  String name="Runa"  ;
  int number=5678;

  public void startCar();
    public void stopCar();

    public void steering ();
    public void cameras();


    public static  int generalMotor(){
     int num =233;
     int score=576;
     int total =num+score;
        System.out.println(total);
     return total;


    }


    public static void main(String[] args) {
        Car .generalMotor();

    }


}
