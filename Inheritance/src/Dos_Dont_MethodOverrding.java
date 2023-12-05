class Ssuper
{
    protected void display()
    {
        System.out.println("Super Display");
    }
}

class Ssub extends Ssuper
{
    @Override
    public void display()
    {
        System.out.println("Sub Display");
    }
}

public class Dos_Dont_MethodOverrding {
    public static void main (String [] args)
    {

    }
}

//Do's
// 1- Signature must be same
// 2 - parameter List must be same
//3 - MethodName should be same (Case sensitive)
//4- Return Type Should be same

// If the return Type is a Class A and the overrided method have a return type of a class B but then Class B should be a Sub Class of Class A, then it is fine!

//Don't
//1- Can't Override Final Method
//1- Can't Override Static Method


//If a Super Method is Private then Override method can be Private, Protected or Public, but if
    // Super Method is Protected Overrided method can be Protected or Public only!