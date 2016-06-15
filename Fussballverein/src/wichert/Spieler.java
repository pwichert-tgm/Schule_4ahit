package wichert;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Spieler 
{
	public static void main(String[] args)
	{
		PrintWriter writer = null;
		int i;
		int a = 1;
				try 
				{
					writer = new PrintWriter(new BufferedWriter(new FileWriter("Spieler_insert.sql")));
					String[] position = {"Sturm","Mittelfeld","Verteidigung","Tormann"};
					int[] gehalt = {1000,2000,3000,4000,5000};
					String[] von = {"2001-09-28","2002-03-21","2003-06-12","2004-07-24","1999-09-20"};
					String[] bis = {"2006-09-28","2007-03-21","2008-06-12","2009-07-24","2010-09-20"};
					for(i=0;i < 2200000;i+=2)
					{
						writer.println("INSERT INTO Spieler VALUES ('"+i+"','"+position[(int)Math.random()*4]+"','"+gehalt[(int)Math.random()*5]+"','"+von[(int)Math.random()*4]+"','"+bis[(int)Math.random()*4]+"');");
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
