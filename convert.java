import java.util.Scanner;
import java.util.*;
public class convert
{
  public static void main(String[] args)
  {
    String a1,a2;
  int a,b;
    Scanner in = new Scanner(System.in);
    
      System.out.println("Enter first string");
      a1 = in.next();
      System.out.println("Enter second string");
      a2 = in.next();
       a = Integer.parseInt(a1);
       b = Integer.parseInt(a2);
      if (a>b)
      {
        System.out.println("Number of first string is max");
      }
      else 
      {
        System.out.println("Number of second string is max");
      }
    
  }
}