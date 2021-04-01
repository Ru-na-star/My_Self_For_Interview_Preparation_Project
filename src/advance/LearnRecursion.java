package advance;

public class LearnRecursion {
static int num=0;
public  static void tvDisplay(){
    System.out.println("heloo");
    if( num <=10){
       num++;
        tvDisplay();
    }

}




    public static void main(String[] args) {
        LearnRecursion.tvDisplay();


    }


}
