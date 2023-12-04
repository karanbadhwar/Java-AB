class Subject
{
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;

    //Constructors
    public Subject(String subId, String name)
    {
        this.subId = subId;
        this.name = name;
    }

    public Subject(String subId, String name, int maxMarks)
    {
        this.subId = subId;
        this.name = name;

        setMaxMarks(maxMarks);
    }

    public Subject(String subId, String name, int maxMarks, int marksObtain)
    {
        this.subId = subId;
        this.name = name;

        setMaxMarks(maxMarks);
        setMarksObtain(marksObtain);
    }


    //Getters
    public String getSubId()
    {
        return subId;
    }

    public String getName()
    {
        return name;
    }

    public int getMaxMarks()
    {
        return  maxMarks;
    }

    public int getMarksObtain()
    {
        return marksObtain;
    }


    //Setters
    public void setMaxMarks(int m)
    {
        if(m <= 0)
            this.maxMarks = m;
        else
            this.maxMarks = 0;
    }

    public void setMarksObtain(int m)
    {
        if(m >= 0)
            this.marksObtain = m;
        else
            this.marksObtain = 0;
    }

    boolean isQualified()
    {
        return marksObtain>= maxMarks/10*4;
    }

    //toString method to get all the values
    public String toString()
    {
        return "\nSubject ID: "+subId+"\nName: "+name+"\nMarks Obtained: "+marksObtain;
    }

}

//Student Class
class Student_With_Constructor
{
    private int rollNo;
    private String name;
    private String dept;
    private Subject[] subjects;

    //Constructors
    public Student_With_Constructor(int rollNo, String name, String dept)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
    }

    public Student_With_Constructor(int rollNo, String name, String dept, Subject[] subjects)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.subjects = subjects;
    }

    //Getters
    public int getRollNo()
    {
        return rollNo;
    }

    public String getName()
    {
        return name;
    }

    public String getDept()
    {
        return dept;
    }

    public Subject[] getSubjects()
    {
        return subjects;
    }

    //Setters
    public void setSubjects(Subject ...s)
    {
        subjects = new Subject[s.length];

        for (int i = 0; i < s.length; i++)
        {
            subjects[i] = s[i];
        }
    }

    public String toString()
    {
        return "\nStudent: "+name+"\nRoll No: "+rollNo+"\nSubjects: "+subjects;
    }
}


public class Student_Challenge_ArrayOfObjects {
    public static void main (String ...args)
    {
        Subject subs[] = new Subject[3];

        subs[0] = new Subject("s101", "Ds", 100);
        subs[1] = new Subject("s102", "Algorithms", 100);
        subs[2] = new Subject("s103", "Operating Systems", 100);

        subs[2].setMarksObtain(80);

//        for (Subject s: subs)
//            System.out.println(s);

        Student_With_Constructor s1 = new Student_With_Constructor(123, "karan", "Cs");
        s1.setSubjects(subs);


        for(Subject s: s1.getSubjects())
            System.out.println(s);


    }
}
