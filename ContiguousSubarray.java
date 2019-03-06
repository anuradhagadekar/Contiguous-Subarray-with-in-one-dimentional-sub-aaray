package com.digitate.ignio.ees.utils;
import java.util.Scanner;

public class ContiguousSubarray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int count,start ,end ,max_so_far,max_ending_here;
		String arrayInString=null;
		count=start=end=max_so_far=max_ending_here=0;
		System.out.println("Enter the array:");
		arrayInString=sc.nextLine();
		String se[]=arrayInString.trim().split(" ");
		int[] arrayOfElement=new int[se.length];
		for(int i=0;i<se.length;i++)
		{
			arrayOfElement[i]=Integer.parseInt(se[i]);
			if (arrayOfElement[i] >0)
				count++;
		}
		sc.close();
		if(count==0)
			System.out.println(" Array should contain at least one positive element");

		else
		{

			for(int i=0; i<arrayOfElement.length;i++)
			{
				max_ending_here=max_ending_here + arrayOfElement[i];
				if(max_ending_here<0)
				{
					max_ending_here=0;
					start=i+1;
				}
				else if(max_ending_here>max_so_far)
				{   
					max_so_far=max_ending_here;
					end=i;
				}

			}
			
			System.out.println("Largest SubArray");
			System.out.println("Start Index: "+start);
			System.out.println("Length: "+(end-start+1));
			System.out.println("Sum: "+max_so_far);
			System.out.print("Elements: ");
			for(int i=start;i<=end;i++)
			System.out.print(arrayOfElement[i]+" ");



		}


		

	}


}
