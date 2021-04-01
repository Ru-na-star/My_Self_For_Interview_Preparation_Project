package oop.inheritance;

public class Son extends Father{

    public   String SonFavouriteDish="Chicken" ;
    public  String SonFavouriteSports="FootBall" ;
    private String SonSsn="34567890" ;

    public String getFatherSsn() {
        return SonSsn;
    }

    public void setFatherSsn(String fatherSsn) {
        this.SonSsn = fatherSsn;
    }

    public Son(){
        System.out.println("My Son is in bangladesh");
    }

    public Son(String money){
        String father=money;
        System.out.println("My Son has lots of money: "+ father);
    }

    public void SonHairColor(){
        System.out.println("Son has black Hair");

    }
    public void SonName(String name ){
        String name1="name"  ;
        System.out.println("Son's name is" +name1);

    }public int  SonNumber(int number,int number2 ){

        int number1=number*number2;

        System.out.println("Son's account Number Is :" +number1);
        return    number1;
    }








}
