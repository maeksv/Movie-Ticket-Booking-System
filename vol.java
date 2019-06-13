//ticket booking system
import javax.swing.*;
class TicketBooking
{
	int seats[][]=new int[5][20];
	double total;
	void bookseat(int count,int count2)
	{
		seats[count][count2]=1;
		
	}
	void addbill(double x)
	{
		 total=total+x;
		
	}
	void printbill()
	{
		System.out.print("Successfully Booked");
		System.out.print("your total amount="+(total+100));
		
	}
	void input()
	{
		int countseat=0;
		countseat=Integer.parseInt(JOptionPane.showInputDialog("total seats to book"));
		for(int i=0;i<countseat;i++)
		{
			int count=1;
			int seatno=Integer.parseInt(JOptionPane.showInputDialog("enter seat slot "));
			for(int k=0;k<seats.length;k++)
			{
				for(int m=0;m<seats[k].length;m++)
				{
					if(count==seatno)
				    {
						bookseat(k,m);
					    if(k<2)
						{
							
							addbill(300);
						}
						else{
							addbill(100);
						}
				    }
				    count++;
				}
			}
		}
		
	}
	public void printseats()
	{
		String output=" ";
		for(int i=0;i<seats.length;i++)
		{
			for(int j=0;j<seats[i].length;j++)
			{
				if(seats[i][j]==1)
				{
					output=output+"x"+" ";
				}
				else
				{
					output=output+"#"+" ";
				}
				
			}
			output=output+"\n";
		}
		System.out.print(output);
		
	}

}
public class vol 
{
	public static void main(String[] arg)
	{
		TicketBooking ob = new TicketBooking();
		ob.printseats();
		System.out.print("PRICES\nrow A. 300rs\nrow B. 300rs\nrow C. 100rs\nrow D. 100rs\nrow E. 100rs \n Excluding GST.\n");
		ob.input();
		ob.printseats();
		ob.printbill();
		
		
	}
}
	
	


