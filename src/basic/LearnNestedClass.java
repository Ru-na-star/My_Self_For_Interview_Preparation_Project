package basic;

public class LearnNestedClass {
    public static void main(String[] args) {
        System.out.println("Hello");
        Computer com=new Computer();
        System.out.println(com.age);

    }


public   static class Computer {

 public static int age=60;

}
}


