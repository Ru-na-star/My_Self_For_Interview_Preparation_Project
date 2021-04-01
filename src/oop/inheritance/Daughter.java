package oop.inheritance;

public class Daughter extends Father {



    public   String  DaughterFavouriteDish="Chicken" ;
    public  String  DaughterFavouriteSports="FootBall" ;
    private String  DaughterSsn="34567890" ;

    public String getFatherSsn() {
        return  DaughterSsn;
    }

    public void setFatherSsn(String fatherSsn) {
        this. DaughterSsn = fatherSsn;
    }

    public  Daughter(){
        System.out.println("My  Daughter is in bangladesh");
    }

    public  Daughter(String money){
        String father=money;
        System.out.println("My  Daughter has lots of money: "+ father);
    }

    public void  DaughterHairColor(){
        System.out.println(" Daughter has black Hair");

    }
    public void  DaughterName(String name ){
        String name1="name"  ;
        System.out.println(" Daughter's name is" +name1);

    }public int   DaughterNumber(int number,int number2 ){

        int number1=number*number2;

        System.out.println(" Daughter's account Number Is :" +number1);
        return    number1;
    }









}
