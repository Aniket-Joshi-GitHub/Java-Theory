public class Object 
{
    String name;
    String color;
    int number;


    /* Below is constructor method, as the name suggests, this will be same as class name as if create the 
     * objects out of this class the class name is used hence it has such design so it can be used to reduce the
     * code writing and make it more efficient.
     */
    Object(String name,String color,int number )
    {
        this.name = name;
        this.color = color;
        this.number = number;
    }

    public void function1()
    {
        System.out.println("Hi I am a function created by "+this.name);
    }


}
