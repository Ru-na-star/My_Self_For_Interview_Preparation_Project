package oop.inheritance;

public class Father extends GrandFather  {


 public   String fatherFavouriteDish="Chicken" ;
  public  String fatherFavouriteSports="FootBall" ;
   private String fatherSsn="34567890" ;

    public String getFatherSsn() {
        return fatherSsn;
    }

    public void setFatherSsn(String fatherSsn) {
        this.fatherSsn = fatherSsn;
    }

    public Father(){
        System.out.println("My Father is in bangladesh");
    }

    public Father(String money){
        String father=money;
        System.out.println("My Father has lots of money: "+ father);
    }

public void hairColor(){
    System.out.println("Father has black Hair");

}
public void fName(String name ){
        String name1="name"  ;
    System.out.println("Father's name is" +name1);

}public int  accountNumber(int number,int number2 ){

    int number1=number*number2;

    System.out.println("Father's account Number Is :" +number1);
    return    number1;
}



}
