class WhiteBoard
{
    String text;
    int noOfStudents= 0;
    int count = 0;

    //Write() for Teacher to write Text
    synchronized public void write(String msg)
    {
        while (count!= 0)
        {
            try {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
        System.out.println("Teacher is writing: "+msg);
        this.text = msg;
        count = this.noOfStudents;
        notifyAll();
    }

    //Read() for Students to Read the Text
    synchronized public String read()
    {
        System.out.println();
        while(count == 0)
        {
            try {
                wait();
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }

        String t = text;
        count--;
        if(count == 0)
            notify();
        return t;

    }

    //Attendance Method
    public void attendance()
    {
        this.noOfStudents++;
    }
}

class Teacher extends Thread
{
    WhiteBoard w;

    public Teacher(WhiteBoard w)
    {
        this.w = w;
    }
    @Override
    public void run()
    {
        String str[] = {"Java is a language.", "It is an OOPs Language.", "It supports MultiThreading", "End"};

        for (String s : str) {
            w.write(s);
        }
    }
}

class Student extends Thread
{
    String name;

    WhiteBoard w;
    public Student(String name, WhiteBoard w)
    {
        this.name = name;
        this.w = w;
    }

    @Override
    public void run ()
    {
        String text = "";
        w.attendance();

        do
        {
                {
                    text = w.read();
                    System.out.println(name+" Reading "+text);
                }

        } while(!text.equals("End"));

    }
}

public class SC_Teacher_Student_Problems
{
    public static void main(String[] args) {
        WhiteBoard w = new WhiteBoard();
        Teacher t = new Teacher(w);

        Student s1 = new Student("Karan", w);
        Student s2 = new Student("Badhwar", w);
        Student s3 = new Student("Karan Badhwar", w);

        t.start();
        s1.start();
        s2.start();
        s3.start();
    }
}
