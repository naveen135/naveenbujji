import java.util.*;
import java.lang.*;
import java.io.*;
class KOddNumber
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int m[]=new int[n];
		for(int i=0;i<n;i++)
		m[i]=sc.nextInt();
		if(m[k]%2!=0)
		System.out.println(m[k]);
		else
		System.out.println(m[k]+1);
	}
}
