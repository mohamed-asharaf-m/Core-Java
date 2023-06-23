//This console aplication is yet to be finished
package booking_system;
import java.util.*;
abstract  class Booking {
int displaymenu()
{
	System.out.print("Select a option by picking a number:\n");
	System.out.print("1.Book a movie ticket\n2.View available seats for a movie\n");
	Scanner sc=new Scanner(System.in);
	int mn=sc.nextInt();
	return mn;
}
int movies()
{
	char mo='y';
	while(mo=='y')
	{
		int flag=0;
	System.out.print("\nSelect a movie by picking the number;");
	System.out.print("\n1.Muthu\n2.Annamalai\n3.Kaala\nyour option:");
	Scanner sc=new Scanner(System.in);
	int ms=sc.nextInt();
	for(int i=1;i<3;i++)
	{
		if(i==ms)
		{
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		System.out.print("Invalid number!!!\nDo want select the movie again?\n(Press y for yes others for no):");
		mo=sc.next().charAt(0);
	}
	else if(flag==1)
		return ms;
	}
return 0;
	
	
}
}
class movieseats extends Booking
{
	int a[][]=new int[20][20];
	int b[][]=new int[20][20];
	int c[][]=new int[20][20];
	
	void displayseats(int mn)
	{
		if(mn==1)
		{
			for(int i=0;i<20;i++)
			{if(i>4)
				System.out.print(false);
			}
			for(int i=0;i<20;i++)
			{
				for(int j=0;j<20;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
		else if(mn==2)
		{
			for(int i=0;i<20;i++)
			{
				for(int j=0;j<20;j++)
				{
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
		}
		else if(mn==3)
		{
			for(int i=0;i<20;i++)
			{
				for(int j=0;j<20;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
	int seatavailable(int r,int co,int m)
	{
		if(m==1)
		{
			if(a[r][co]==0)
				return 0;
			else
				return 1;
		}
		else if(m==2)
		{
			if(b[r][co]==0)
				return 0;
			else 
				return 1;
		}
		else if(m==3)
		{
			if(c[r][co]==0)
				return 0;
			else 
				return 1;
		}
		else
			return 1;
	}
	
}
class Main{
	public static void main(String []args)
	{
		
		movieseats b=new movieseats();
		Scanner sc=new Scanner(System.in);
		char a='y';
		while(a=='y')
		{
		int n=b.displaymenu();
		if(n==1)
		{
			int movie=b.movies();
			b.displayseats(movie);
			int flag=0;
			int r=0,c=0;
			while(flag==0)
			{
			System.out.print("\nSelect the number by specifying row and column\nRow:");
			 r=sc.nextInt();
			System.out.print("\nColumn:");
			 c=sc.nextInt();
			if((r>=0&&r<20)&&(c>=0&&c<20))
			{
				flag=0;
				break;
			}
			else
				flag=1;
			}
			
			int sa=b.seatavailable(r,c,n);
			if(sa==0)
			{
				System.out.print("\nSeat is Booked");
				System.out.print("\nDo you want to book");
			}
			
		}
		else if(n==2)
		{
			
		}
		else
		{
			System.out.print("Do you want to try again?\npress y for yes others for no:");
			a=sc.next().charAt(0);
		}
		
	}
}
}
