 
    /*Below is the external external variable which does not belong to Object class.
     * This is not right as not object properties can modifed with external variable.
     * Hence we will introduce (Private variables) and getters and setters to make them inaccssible externally
     * Getters and setters are methods which are designed to modify the properties of Ojbects
     */

public class Main
{
  public static void main(String[]args)
  {

    String name = "Spam Object";

    Object obj1 = new Object(name, "Red", 10);
    obj1.function1();

    Object obj2 = new Object("Object2", "Oranage", 15);
    obj2.function1();

    
  }
}