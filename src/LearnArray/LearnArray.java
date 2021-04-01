package LearnArray;

public class LearnArray {

String [] bs=new String[5];

int [] number={ 345,45,56,57};


    public static void main(String[] args) {

        LearnArray learn=new LearnArray();
learn.bs[0]="456";
learn.bs[1]="456345";
learn.bs[2]="4562345678";
learn.bs[3]="45623456";
learn.bs[4]="sdfghdfgh";

//  learn.number[0] =345;
//  learn.number[1]=45;
//  learn.number[2]=56;
//  learn.number[3]=57 ;

        System.out.println(  learn.number[1]);
        System.out.println("**************");
        for (int nu:learn.number){
            System.out.println(nu);
        }







    }

    }








