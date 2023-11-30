import java.util.*;
public class Student_challenge_type_website {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Display the name of the day based on Number
//        int day;
//        day = sc.nextInt();

//        System.out.println("Enter a Day Number");
//        if(day == 1){
//            System.out.println("Monday");
//        } else if(day == 2){
//            System.out.println("Tuesday");
//        } else if(day == 3){
//            System.out.println("Wed");
//        } else if(day == 4){
//            System.out.println("Thur");
//        } else if(day == 5){
//            System.out.println("Fri");
//        } else if(day == 6){
//            System.out.println("Sat");
//        } else if (day == 7) {
//            System.out.println("Sun");
//        } else {
//            System.out.println("Invalid Day Number");
//        }

        //Find type of website and the protocol used

        String url = "http://www.google.com";

        String protocol = url.substring(0, url.indexOf(":"));

        if(protocol.equals("http")){
            System.out.println("Hyper Text Tranfer Protocol");
        } else if(protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }

        String ext = url.substring(url.lastIndexOf('.'));
        System.out.println(ext);

        if(ext.equals(".com")){
                System.out.println("Commercial");
        } else if(ext.equals(".gov")){
            System.out.println("Government");
        }else  if(ext.equals(".org")){
            System.out.println("Organization");
        }


    }
}
