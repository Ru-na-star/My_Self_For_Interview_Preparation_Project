package basic;

public class LearnMethod {

    //method is a block of code which hhave name y using this name we can execute the block of code

    //two tyes of method
    // one is called non return type
    // another is return type method
    //non return type with parametersd and without parameters
    // return type with parameter and without parameters



    String name;
    String contactNum;





   //non return type without parameterize method
   public static void creditCard(){
       String name ="runa";
       String address="queens";
       System.out.println("My name is :"+name +" "+"My address is :"+address);


   }
   public static String  creditCard1(){
       String name ="runa";
       String address="queens";
       System.out.println("My name is :"+name +" "+"My address is :"+address);
return ("My name is :"+name +" "+"My address is :"+address);
   }

   public static int doSum(int numb,int nm ){
     int number= numb;
     int number2=nm;
     int total=numb+nm;
       System.out.println("Total Sumition is :"+total);
   return total;
   }




public  void creditCard( String name ,String address,String coon){
    String name1 =name;
    String address2=address;
    this.contactNum=coon;

    System.out.println("My name is :"+name +" "+"My address is :"+address+" "+ "My contact Number is:"+     this.contactNum);


}




    public static void main(String[] args) {
        LearnMethod.creditCard();
        LearnMethod learn=new LearnMethod();
        System.out.println("########################");
        LearnMethod . creditCard1();
        LearnMethod. doSum(4667,5678);
//learn.creditCard("Runa ","Queens","234536");
    }




}
