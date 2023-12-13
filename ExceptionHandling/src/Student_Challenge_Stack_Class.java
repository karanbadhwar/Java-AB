class StackOverFlowException extends Exception
{
    @Override
    public String toString()
    {
        return "Stack is FUll";
    }
}

class StackUnderFlowException extends Exception
{
    @Override
    public String toString()
    {
        return "Stack is Empty";
    }
}

class Stack
{
    private int size;
    private int top = -1;
    private int S[];

    public Stack(int sz)
    {
        this.size = sz;
        S = new int[sz];
    }

    public void push(int p) throws StackOverFlowException
    {
        if(top == this.size - 1)
            throw new StackOverFlowException();

        top++;

        S[top] = p;
    }

    public int pop() throws StackUnderFlowException
    {
        int x = 0;
        if(top == -1)
            throw new StackUnderFlowException();

        x = S[top];
        S[top] = 0;
        top--;
        return x;
    }

    public void values()
    {
        for(int s:S)
            System.out.println(s);
    }

}

public class Student_Challenge_Stack_Class
{
    public static void main(String[] args)
    {
        Stack s1 = new Stack(5);

        try
        {
            s1.push(10);
            s1.push(20);
            s1.push(30);
            s1.push(40);
            s1.push(50);
//            s1.push(60); Error AS Stack is Full

            s1.pop();
            s1.pop();
            s1.pop();
        }
        catch(StackOverFlowException e)
        {
            System.out.println(e);
        }
        catch(StackUnderFlowException err)
        {
            System.out.println(err);
        }




        s1.values();
    }
}
