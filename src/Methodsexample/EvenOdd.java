package Methodsexample;
import java.util.Scanner;

public class EvenOdd
{
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of num: ");
	int num = sc.nextInt();
	
	EvenOdd e = new EvenOdd();
	e.OddEven(num);
	
}
  public void OddEven(int num) //method of odd even 
  {
	if(num%2==0) 
	{
		System.out.println("Number is even:"+num);
	}
	else {
		System.out.println("Number is odd:"+num);
	}
	
  }
	  
  
  
	  
  
}
