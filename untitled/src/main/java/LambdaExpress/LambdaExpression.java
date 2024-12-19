package LambdaExpress;



@FunctionalInterface
interface Example
{
    public String fun(String s);
}


public class LambdaExpression
{

    public static void example()
    {
        Example  obj =   (s) ->
        {
            return s;
        };

        System.out.println(obj.fun("hello"));

    }

    public static void main(String[] args) {

        example();
    }


}
