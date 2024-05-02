public class Object 
{
    private String name;
    private String color;
    private int number;


    Object(String name,String color,int number )
    {
        this.name = name;
        this.color = color;
        this.number = number;
    }


    // We added getters and setters below

    public String getName()
    {
        return this.name;
    }

    public void set(String name)
    {
        this.name = name;
    }

    
    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    
    public int getNumber()
    {
        return this.number;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }









    public void function1()
    {
        System.out.println("Hi I am a function created by "+this.name+ ". My Color is "+this.color+" My number is " +this.number);
    }


}
