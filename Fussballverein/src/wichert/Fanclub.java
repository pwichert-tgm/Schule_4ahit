package wichert;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Fanclub 
{
	public static void main(String[] args)
	{
		PrintWriter writer = null;
		int i;
		int a = 2600000;
				try 
				{
					writer = new PrintWriter(new BufferedWriter(new FileWriter("Fanclub_insert.sql")));
					for(i=0;i < 100000;i++)
					{
						writer.println("INSERT INTO Fanclub VALUES ('Mannschaft "+i+"','"+a+"','2000-11-01','"+i+"');");
						a+=2;
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
