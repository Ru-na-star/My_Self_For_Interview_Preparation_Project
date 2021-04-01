package advance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LearnDataReader {


    public static void main(String[] args) {

     FileReader fileReader=null;
     BufferedReader bufferedReader=null;
     String filePath="../My_Self_For_Interview_Preparation_Project/DataTest/sample.txt";



    try {
        fileReader =new FileReader(filePath);
        bufferedReader=new BufferedReader(fileReader );
        String data;
        while (( data = bufferedReader.readLine())!=null)
            System.out.println(data);
    }catch (Exception e){
        System.out.println("File Not Found");


    }finally {
        try{
            fileReader.close();
            bufferedReader.close();
        }catch (Exception e){
            System.out.println("File already clsoe  ");
        }
    }








    }








}
