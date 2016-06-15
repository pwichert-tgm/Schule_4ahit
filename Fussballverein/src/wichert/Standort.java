package wichert;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Standort 
{
	public static void main(String[] args)
	{
		PrintWriter writer = null;
		int i;
		int a = 1;
				try 
				{
					writer = new PrintWriter(new BufferedWriter(new FileWriter("Standort_insert.sql")));
					for(i=0;i < 100000;i++)
					{
						writer.println("INSERT INTO Standort (land,plz,ort) VALUES ('Land "+i+"','PLZ "+i+"','ORT"+a+"');");
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
