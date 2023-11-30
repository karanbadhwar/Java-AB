public class StudentChallenges {
    public static void main (String[] args){
        String str = "programmer@gmail.com";
        String userName, domainName;
        int index;
        if(str.matches("\\w*\\W*@(.*)")){
            index = str.indexOf("@");
            userName = str.substring(0, index);
            domainName = str.substring((index+1));

            //Check if the email id is on Gmail
//            boolean onGmail = domainName.startsWith("gmail");

            //Method number 2
            int indexDot = domainName.indexOf(".");

            String isGmail = domainName.substring(0,indexDot);

            boolean onGmail = isGmail.equalsIgnoreCase("gmail");

            System.out.println(userName);
            System.out.println(domainName);
            System.out.println(onGmail);
        }

    }
}
