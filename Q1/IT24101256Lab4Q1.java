import java.util.Scanner;
public class IT24101256Lab4Q1
{
 public static void main(String[]args)
 {
  //Create an object called input to scanner class
  Scanner input=new Scanner(System.in);
  
  //Input the number
  System.out.print("Enter a number:");
  double number=input.nextDouble();

  //Check the number is positive,negative,or zero
  if(number>0)
  {
    System.out.println("The number is:Positive");
  }
  else if(number<0)
  {
   System.out.println("The number is:Negative");
  }
  else
  {
   System.out.println("The number is Zero");
  }
 }
}

 

