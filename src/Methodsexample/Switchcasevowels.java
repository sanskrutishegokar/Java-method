package Methodsexample;
import java.util.Scanner;

public class Switchcasevowels 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter ch:");
	char ch = sc.next().charAt(0);
	
	Switchcasevowels s = new Switchcasevowels();
	s.Vowels(ch);
	
}

public void Vowels(char ch)
{
	switch(ch)
	{
	case ('A'):
	{
		System.out.println("A is vowel");
		break;
	}
	case 'E':
	{
		System.out.println("E is vowel");
		break;
	}
	case 'I':
	{
		System.out.println("I is vowel");
		break;
	}
	case 'O':
	{
		System.out.println("O is vowel");
		break;
	}
	case 'U':
	{
		System.out.println("U is vowel");
		break;
	}
	default:
	{
		System.out.println(ch+" is consonant");
	}
	}
}
}
