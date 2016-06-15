package wichert;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Angestellter 
{
	public static void main(String[] args)
	{
		PrintWriter writer = null;
		int i;
		int a = 1;
				try 
				{
					writer = new PrintWriter(new BufferedWriter(new FileWriter("Angestellter_insert.sql")));
					int[] gehalt = {1000,2000,3000,4000,5000};
					for(i=2800000;i < 3000000;i+=2)
					{
						writer.println("INSERT INTO Angestellter VALUES ('"+i+"','"+gehalt[(int)Math.random()*4]+"','1','hallo@aaa.com');");
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
