package wichert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect 
{
	public static void main(String[] arg) 
	{
		try 
		{
			Class.forName("org.postgresql.Driver");

		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println("Postgres Treiber fehlt! Muss in die Libary hinzugefügt werden!");
			e.printStackTrace();
			return;
		}
		System.out.println("Postgres Treiber vorhanden!");
		Connection connection = null;
		try 
		{
			//Das erste Argument ist die postgres Verbindung und Angabe der Datenbank
			//Das zweite Argument ist der Hostname
			//Das dritte Argument ist das Passwort
			//Durch das einfügen von:
			//host	all	all	192.168.0.0/16	md5 statt	host	all	all	127.0.0.1/32	md5
			//Wird JDBC auch erlaubt auf die Datenbank zu zugreifen ohne Probleme.
			connection = DriverManager.getConnection(
					"jdbc:postgresql://192.168.44.134:5432/fussballverein", "paddy",
					"ball");
		} 
		catch (SQLException e) 
		{
			System.out.println("Verbindung Fehlgeschlagen");
			e.printStackTrace();
			return;
		}
		if (connection != null) 
		{
			System.out.println("Verbunden mit der Datenbank!");
		} 
		else 
		{
			System.out.println("Fehler beim Verbinden mit der Datenbank ...");
		}
	}
}
