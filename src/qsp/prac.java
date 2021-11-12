package qsp;

import java.util.ArrayList;
import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter No. of companies");
		int n=s.nextInt();
		
		String cname[] = new String[n];
		
		System.out.println("Name of Company: ");
		
		for (int i=0;i<n;i++)
		{
			 
			cname[i]=s.nextLine();
			
		}
		
		String reviews[] = new String[n];
		
		System.out.println("Review of Company: ");
		for (int i=0;i<n;i++)
		{
		
			reviews[i]=s.nextLine();
			
		}
		
		ArrayList<Object> details= new ArrayList<>();
		details.add(cname);
		details.add(reviews);
								
		for (int i=0;i<details.size();i++)
		{
			System.out.println(details.get(i));
		}
		
		

	}
	
	}


