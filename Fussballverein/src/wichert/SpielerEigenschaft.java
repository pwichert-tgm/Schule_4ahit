package wichert;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SpielerEigenschaft 
{
	public static void main(String[] args)
	{
		PrintWriter writer = null;
		int i;
		int a = 1;
		int lauf = 0;
				try 
				{
					writer = new PrintWriter(new BufferedWriter(new FileWriter("SpielerEigenschaft_insert.sql")));
					int[] nummer = {1,2,3,4,5,6,7,8,9,10,11};
					for(i=0;i < 2200000;i+=2)
					{
						if(lauf < 11)
						{
							writer.println("INSERT INTO SpielerEigenschaft VALUES ('"+i+"','Mannschaft "+a+"','False','"+nummer[lauf]+"');");
						}
						else
						{
							a++;
							lauf=0;
							writer.println("INSERT INTO SpielerEigenschaft VALUES ('"+i+"','Mannschaft "+a+"','True','"+nummer[lauf]+"');");
						}
						System.out.println(a);
					}
				}
				catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
