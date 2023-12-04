class Student
{
    public int rollNo;
    String name;
    String course;
    int m1, m2,m3;


    //Methods
    public int total()
    {
       return m1+m2+m3;
    }

    public float average()
    {
        return ((float) total() /3);
    }

    public char grade()
    {
        if(average() >= 60)
            return 'A';
            else
                return 'B';
    }

//    public String details()
//    {
//        return "Roll No: "+rollNo+"\n"+"Name: "+name+"\n"+"Course: "+course+"\n";
//    }

    public String toString()
    {
        return "Roll No: "+rollNo+"\n"+"Name: "+name+"\n"+"Course: "+course+"\n";
    }
}



public class Student_Challenge_Student_Class {
    public static void main (String ...args)
    {
        Student s1 = new Student();

        s1.rollNo = 7;
        s1.name= "karan";
        s1.course = "BCA";

        s1.m1 = 90;
        s1.m2 = 89;
        s1.m3 = 85;

        System.out.println(s1);
        System.out.println("Grade: "+s1.grade());
        System.out.println("Average: "+s1.average()+"%");
    }
}















