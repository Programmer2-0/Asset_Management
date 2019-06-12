package Task;

import java.util.Scanner;
import java.util.ArrayList;

class Box 
{
ArrayList<Asset> management = new ArrayList<Asset>();
public void start()
{
	System.out.println("\n............... WELCOME TO ASSET MANAGEMENT!...........\n");
	System.out.println("\n 1. Add Asset Name"+"\n 2. View Asset Details"+"\n 3. Update the Asset Details"+"\n 4. Delete the Asset Details"+"\n 5. Exit");
	while(true)
	{
		Scanner s = new Scanner(System.in);
		String k = s.next();
		if(k.equalsIgnoreCase("1"))
		{
			add_the_data();
		}
		else if(k.equalsIgnoreCase("2"))
		{
			view_the_data();
		}
		else if(k.equalsIgnoreCase("3"))
		{
			update_the_data();
		}
		else if(k.equalsIgnoreCase("4"))
		{
			delete_the_data();
		}
		else
		{
			break;
		}
		s.close();
	}
}

public void add_the_data()
{
	Scanner A = new Scanner(System.in);
	Asset B = new Asset();
	System.out.println("\n Enter the Asset Name :");
	B.setAsset_Name(A.next());
	System.out.println("\n Enter the Asset Worth :");
	B.setAsset_Cost(A.nextInt());
	System.out.println("\n Enter the Type of Asset :");
	B.setAsset_Type(A.next());
	System.out.println("\n Enter the Asset Date of purchase :");
	B.setAsset_Date_of_purchase(A.nextInt());
	management.add(B);
	System.out.println("\nAdded the data Successfully.........");
	A.close();
}

public void view_the_data()
{
	for(Asset B : management)
	{
		System.out.println("\n The details are shown as follows.............\n");
		System.out.println(B.getAsset_Name()+"  "+B.getAsset_Cost()+"  "+B.getAsset_Type()+"  "+B.getAsset_Date_of_purchase());
	}
}

public void update_the_data()
{
	System.out.println("\n Enter the Asset Name :");
	Scanner A = new Scanner(System.in);
	Asset B = new Asset();
	String C=A.next();
	for(int i=0;i<management.size();i++)
	{
		if(management.get(i).getAsset_Name()==C)
		{
			B.setAsset_Name(C);
			System.out.println("\n Enter the Asset Worth :");
			B.setAsset_Cost(A.nextInt());
			System.out.println("\n Enter the Type of Asset :");
			B.setAsset_Type(A.next());
			System.out.println("\n Enter the Asset Date of purchase :");
			B.setAsset_Date_of_purchase(A.nextInt());
			management.set(i,B);
			System.out.println("\n Updated Sucessfully............");
			break;
		}
		System.out.println("\n Wrong Name................");
		A.close();
	}
	
}

public void delete_the_data()
{
	System.out.println("\n Enter the Asset Name :");
	Scanner A = new Scanner(System.in);
	Asset B = new Asset();
	String D = A.next();
	for(int i=0;i<management.size();i++) 
	{
		if(management.get(i).getAsset_Name()==D)
		{
			management.set(i,B);
			management.remove(B);
			System.out.println("\n Deleted Successfully............");
			A.close();
		}
	}
	
}
public static void main(String[] args) 
{
	Box g = new Box();
	g.start();
	}
}
