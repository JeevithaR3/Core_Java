package collections;

import java.util.HashSet;
import java.util.Scanner;

public class IsogramChecker 
{
	public static boolean isIsogram(String str)
	{
		HashSet<Character> seen=new HashSet<>();
		str=str.toLowerCase();
		for(char ch:str.toCharArray())
		{
			if(Character.isLetter(ch))
			{
				if(seen.contains(ch))
				{
					return false;
				}
				seen.add(ch);
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a word or phrase: ");
        String input = sc.nextLine();

        if (isIsogram(input))
            System.out.println("It IS an Isogram");
        else
            System.out.println("It is NOT an Isogram");

        sc.close();
	}
}