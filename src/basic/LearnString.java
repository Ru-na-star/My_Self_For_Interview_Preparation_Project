package basic;

public class LearnString {


 //String is a Datatype
 //String is  a class



    public static void main(String[] args) {
        String BurgerName="American Burger";
        System.out.println(BurgerName.concat(BurgerName));
try{
    System.out.println(BurgerName.charAt(4));

}catch (Exception e){
    System.out.println("String out of boundry ex");
}


    }



}
