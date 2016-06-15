package wichert;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Mannschaft 
{
	public static void main(String[] args)
	{
		PrintWriter writer = null;
		int i;
		int a = 1;
				try 
				{
					String[] gebdat = {"2001-09-28","2002-03-21","2003-06-12","2004-07-24","1999-09-20"};
					writer = new PrintWriter(new BufferedWriter(new FileWriter("Mannschaft_insert.sql")));
					for(i=1;i < 100001;i++)
					{
						writer.println("INSERT INTO Mannschaft VALUES ('Mannschaft "+i+"','Klasse "+i+"','"+gebdat[(int)Math.random()*4]+"');");
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
