import java.util.Scanner;


abstract class animal
{
String color,breed,name;
 abstract void eat();
 void speak()
{
System.out.println("Animals can bark,meow,etc");
}
}

class animal1 extends animal
{
 void eat()
{
System.out.println("Animals eat pedigree,meat,etc");
}
}
public class absmain
{
 public static void main(String[] args)
{
 animal1 a = new animal1();
 a.speak();
 a.eat();
}
}