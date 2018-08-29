import java.util.Scanner;
interface animals
{
  void speak();
  void eat();
}

class dog implements animals
{
 public void speak()
{
System.out.println("Dog says BOW");
}
 public void eat()
{
System.out.println("Dog eats Meat");
}
}

class cat implements animals
{
public void speak()
{
System.out.println("Cat says MEOW");
}

public void eat()
{
System.out.println("Cat eats Head");
}
}


public class interface1
 {
 public static void main(String[] args)
{
 dog d = new dog();
 cat c = new cat();
 d.speak();
 d.eat();
 c.speak();
 c.eat();
 
}
}


