package LearnArray;

public class LearnTwoDArray {


    static String[][] information = new String[4][4];


    public static void main(String[] args) {

        LearnTwoDArray.information[0][0] = "101 ";
        LearnTwoDArray.information[0][1] ="FirstName ";
        LearnTwoDArray.information[0][2] ="LastName";
        LearnTwoDArray.information[0][3] ="Address";


        LearnTwoDArray.information[1][0] = "102 ";
        LearnTwoDArray.information[1][1] = "Runa ";
        LearnTwoDArray.information[1][2] = "Parvin";
        LearnTwoDArray.information[1][3] = "Queens";

        LearnTwoDArray.information[2][0] = "103 ";
        LearnTwoDArray.information[2][1] = "Piya ";
        LearnTwoDArray.information[2][2] = "Parvin";
        LearnTwoDArray.information[2][3] = "Bronx";


        System.out.println(LearnTwoDArray.information[0][0]);


        for (String[] std : LearnTwoDArray.information) {

            for (String st : std) {
                System.out.print(st + " ");

            }
            System.out.println();
        }
    }


}
