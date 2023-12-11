class CoffeeMachine
{
    private float coffeQty;
    private float waterQty;
    private float sugarQty;
    private float milkQty;
    static private CoffeeMachine cm = null;

    private CoffeeMachine()
    {
        coffeQty = 1;
        waterQty = 1;
        sugarQty = 1;
        milkQty = 1;
    }

    public void fillWater(float q)
    {
        this.waterQty = q;
    }

    public void fillSugar(float q)
    {
        this.sugarQty = q;
    }

    public void fillMilk(float q)
    {
        this.milkQty = q;
    }

    static CoffeeMachine getInstance()
    {
        if (cm == null)
        {
            cm = new CoffeeMachine();
        }
        return cm;
    }
}

public class SingleTon_Class {
    public static void main(String[] args)
    {
        CoffeeMachine c = CoffeeMachine.getInstance();
        CoffeeMachine c1 = CoffeeMachine.getInstance(); // This c1 is Referring to  same Object c is Holding to as only Object can be present, but ref can be many

        System.out.println("Reference Address: "+c + " "+ c1);
        if(c == c1) {
            System.out.println("Same");
        }
    }
}



