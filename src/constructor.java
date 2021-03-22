public class constructor {

  //constructor is  an initilazize object
  //The constructor name should be same as a class name
  //two types of constructor name
  //one is default constructor
  //another is parameterized constructor
String name1;
int number;
double newNumber;

   public  constructor(){
       System.out.println("Hello ");
       String name="runa";
       System.out.println("My name is :"+name);

   }


   public constructor(String name){
      String newName=name;
       System.out.println("My new name is :"+newName);


   }
public constructor(String name,int number,double newNumber){

 this .name1=name;
 this.number=number;
 this.newNumber=newNumber;


       System.out.println("My new name is :"+name1 +" "+"\nMy Number is :"+number+" "+"\nMy  new Number  is :"+""+newNumber);


   }





public static void main(String[]args){

    constructor con=new constructor();
    constructor con1=new constructor("Rima");
    constructor con2=new constructor("Runa",257546,35789);


}

}
