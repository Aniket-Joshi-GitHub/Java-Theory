 /* For secuirty We made the attribute Private in Object class
  * Now it can not be modified with the first way.
  * Which gives birth to getters and setters.
  * Method which will be used to modfiy the Object attribute with those methods.
  * Using getters and setters below to modify the attributes of Objects.
  * Using getters and setters below to modify the attributes of Objects.
  */

public class Main
{
  public static void main(String[]args)
  {

    
    Object obj1 = new Object("Object1", "Red", 10);
    obj1.function1();
    System.out.println(obj1.getName());
    obj1.set("New Object1");
    System.out.println(obj1.getName());
    

    Object obj2 = new Object("Object2", "Oranage", 15);
    obj2.function1();

    
  }
}



Output : 
/*
Hi I am a function created by Object1. My Color is Red My number is 10
Object1
New Object1
Hi I am a function created by Object2. My Color is Oranage My number is 15
 */
