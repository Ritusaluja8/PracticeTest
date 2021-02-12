package practicetest;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int countchild=0,countadult=0,countsenior=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number of elements you want to store");
		n=scan.nextInt();
		int age[]=new int[8];
		System.out.println("enter the elements of array:");
		for(int i=0;i<n;i++)
		{
			age[i]=scan.nextInt();
		}
		//System.out.println("array elements are");
		for(int j=0;j<n;j++)
		{
			
		if(age[j]<18)
		{
			countchild++;
		}
		else if(age[j]>=18 || age[j]<=54)
		{
			countadult++;
		}
		else
		{
			countsenior++;
		}
			//countsenior=countsenior+1;
		System.out.println("children: " + countchild);
		System.out.println("adult: " + countadult);
		System.out.println("senior citizen: " + countsenior);
		

	}

}
}