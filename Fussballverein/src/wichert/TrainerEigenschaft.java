package wichert;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TrainerEigenschaft 
{
	public static void main(String[] args)
	{
		PrintWriter writer = null;
		int i;
		int a = 1;
		int lauf = 0;
		int erg = 0;
				try 
				{
					writer = new PrintWriter(new BufferedWriter(new FileWriter("TrainerEigenschaft_insert.sql")));
					for(i=0;i < 400000;i+=2)
					{
						
						if(lauf < 1)
						{
							erg = i +2200000;
							writer.println("INSERT INTO TrainerEigenschaft VALUES ('"+erg+"','Mannschaft "+a+"','False','True');");
						}
						else
						{
							a++;
							lauf=0;
							writer.println("INSERT INTO TrainerEigenschaft VALUES ('"+erg+"','Mannschaft "+a+"','True','False');");
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
