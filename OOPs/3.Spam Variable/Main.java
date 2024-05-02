 
    /*Below the first way to modify variable properties works but this not safe.
     * We will make the attributes private so to make this process stop.
     * Hence we will introduce (Private variables) and getters and setters to make them inaccssible externally
     * Getters and setters are methods which are designed to modify the properties of Ojbects
     */

public class Main
{
  public static void main(String[]args)
  {


    Object obj1 = new Object("Object1", "Red", 10);
    obj1.name = "Spam Object";
    obj1.function1();

    Object obj2 = new Object("Object2", "Oranage", 15);
    obj2.function1();

    
  }
}}
