//We have used File Handling Over here, but we haven't learned that!!

import java.io.*;
import java.util.*;
public class Demo_Try_With_Resources {

//    static FileInputStream fi;
//    static Scanner sc;

    static void Divide() throws Exception
    {
        //Try With Resources
        try (FileInputStream  fi = new FileInputStream("C:\\Users\\kbb91\\Desktop\\A-B-Java\\Test.txt"); Scanner sc = new Scanner(fi);)
        {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / b);
        }

//        int d = sc.nextInt(); // This Cannot be read, as Scanner is closed, as it can read the file

    }

    public static void main(String[] args) throws Exception
    {
        Divide();
//        int d = sc.nextInt(); // Cannot Read as Scanner is Closed
    }
}


// Closing Resources by ourself
//------------------------------------------
//fi = new FileInputStream("C:\\Users\\kbb91\\Desktop\\A-B-Java\\Test.txt");
//
//sc = new Scanner(fi);
//
//int a = sc.nextInt();
//int b = sc.nextInt();
//int c = sc.nextInt();
//        System.out.println(a/b);
//
//        fi.close(); //Closing File Reader
//        sc.close(); //Closing Scanner
//
////        int d = sc.nextInt(); // This Cannot be read, as Scanner is closed, as it can read the file


//With Finally Block
//------------------------------------
//  try {

//fi = new FileInputStream("C:\\Users\\kbb91\\Desktop\\A-B-Java\\Test.txt");
//
//sc = new Scanner(fi);
//
//int a = sc.nextInt();
//int b = sc.nextInt();
//int c = sc.nextInt();
//            System.out.println(a / b);
//        }
//                finally{
//                fi.close();
//            sc.close();
//        }
//
//
////        int d = sc.nextInt(); // This Cannot be read, as Scanner is closed, as it can read the file
//
//                }