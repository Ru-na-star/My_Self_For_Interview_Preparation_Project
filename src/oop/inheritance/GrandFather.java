package oop.inheritance;

public class GrandFather {









    public   String  GrandFatherFavouriteDish="Chicken" ;
    public  String  GrandFatherFavouriteSports="FootBall" ;
    private String  GrandFatherSsn="34567890" ;

    public String getFatherSsn() {
        return  GrandFatherSsn;
    }

    public void setFatherSsn(String fatherSsn) {
        this.GrandFatherSsn = fatherSsn;
    }

    public  GrandFather (){
        System.out.println("My GrandFather  is in bangladesh");
    }

    public GrandFather (String money){
        String father=money;
        System.out.println("My  GrandFather  has lots of money: "+ father);
    }

    public void  GrandFatherHairColor(){
        System.out.println("GrandFather has black Hair");

    }
    public void  GrandFatherName(String name ){
        String name1="name"  ;
        System.out.println("GrandFather 's name is" +name1);

    }public int   GrandFatherNumber(int number,int number2 ){

        int number1=number*number2;

        System.out.println(" GrandFather 's account Number Is :" +number1);
        return    number1;
    }




}
