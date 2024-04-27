
// Making a function accssible in main method as well in other class using class.method() syntax.

public class Program2 
{
    public static void main(String[]args)
    {
        sayHi();
    }

    public static void sayHi()
    {
        System.out.println("Hi from Program2");
    }

}
