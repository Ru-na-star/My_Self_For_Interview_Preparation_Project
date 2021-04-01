package advance;

public class LearnSingleTon {
  String name =" ";

    private LearnSingleTon(){


    }

  public static LearnSingleTon ln=new LearnSingleTon();
    public static LearnSingleTon loo(){

       return ln;
    }

    public static void main(String[] args) {





    }


}
