import java.util.Date;
class Student
{
    private String rollNo;
    private String name;
    private String dept;
    private static int count = 1;

    private String generateRollNo()
    {
        Date d = new Date();
        String rn = "Univ-"+(d.getYear()+1900)+"-"+count;
        count++;
        return rn;
    }

    Student(String name)
    {
        rollNo = generateRollNo();
        this.name = name;
    }
    Student(String name, String dept)
    {
        rollNo = generateRollNo();
        this.name = name;
        this.dept = dept;
    }

    //Setter
    public void setDept(String d)
    {
        this.dept = d;
    }

    //Getter
    public String getRollNo()
    {
        return this.rollNo;
    }
}

public class Student_Challenge_Student_RollNo {
    public static void main(String[] args)
    {
        Student s = new Student("Karan");
        s.setDept("Cs");
        Student s1 = new Student("Badhwar", "DSA");
        System.out.println(s.getRollNo());
        System.out.println(s1.getRollNo());
    }
}
