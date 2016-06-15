package wichert;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Person 
{
	public static void main(String[] args)
	{
		PrintWriter writer = null;
		int i;
		int a = 1;
				try 
				{
					writer = new PrintWriter(new BufferedWriter(new FileWriter("Person_insert.sql")));
					String[] geschlecht = {"W","M","N"};
					String[] gebdat = {"2001-09-28","2002-03-21","2003-06-12","2004-07-24","1999-09-20"};
					for(i=0;i < 3240000;i+=2)
					{
						writer.println("INSERT INTO Person VALUES ('"+i+"','Vorname "+a+"','Nachname "+a+"','"+geschlecht[(int)Math.random()*3]+"','"+gebdat[(int)Math.random()*4]+"');");
						a++;
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
