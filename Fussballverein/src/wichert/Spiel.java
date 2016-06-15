package wichert;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Spiel 
{
	public static void main(String[] args)
	{
		PrintWriter writer = null;
		int i;
				try 
				{
					int day = 1;
					int month = 1;
					int year = 1990;
					int a = 100000;
					writer = new PrintWriter(new BufferedWriter(new FileWriter("Spiel_insert.sql")));
					for(i=1;i < 100001;i++)
					{
						if(day < 10 && month < 10)
						{
							writer.println("INSERT INTO Spiel VALUES ('"+year+"-0"+month+"-0"+day+"','Mannschaft "+i+"','NULL','Mannschaft "+a+"');");
						}
						if(day >= 10 && month < 10)
						{
							writer.println("INSERT INTO Spiel VALUES ('"+year+"-0"+month+"-"+day+"','Mannschaft "+i+"','NULL','Mannschaft "+a+"');");
						}
						if(day >= 10 && month >= 10)
						{
							writer.println("INSERT INTO Spiel VALUES ('"+year+"-"+month+"-"+day+"','Mannschaft "+i+"','NULL','Mannschaft "+a+"');");
						}
						if(day < 28)
						{
							day++;
						}
						else
						{
							month++;
							day=1;
						}
						if(month == 13)
						{
							month=1;
							year++;
						}
						if(a != 1)
						{
							a--;
						}
						System.out.println(a);
					}
					i = 0;
				}
				catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
}
