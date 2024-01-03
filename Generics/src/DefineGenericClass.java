
class Data<T>
{
    private T obj;

    public void setData(T value)
    {
        obj = value;
    }

    public T getData()
    {
        return obj;
    }
}


public class DefineGenericClass {

    public static void main(String[] args)
    {
        Data<Integer> d = new Data<>(); // We are expecting Integer type Obj

        d.setData(7);

        System.out.println(d.getData());
    }
}
