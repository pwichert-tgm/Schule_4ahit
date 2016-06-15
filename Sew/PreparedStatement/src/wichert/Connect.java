package wichert;
import java.io.FileInputStream;
import java.sql.*;
import javax.swing.JOptionPane;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.util.Properties;

public class Connect {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException 
	{
	   
         String standarteing = "";
         Properties prop = new Properties();
         standarteing = JOptionPane.showInputDialog("Für einlesen \"true\" eingeben, für standartwerte andere eingabe"); 
         
         
         if(standarteing == "true")
         {        
        	String path;
            path = JOptionPane.showInputDialog("Den Pfad des Files eingeben");  // Den Pfad vom Dokumentprop angeben!!!!! zb /home/rene/con.property
            System.out.println(path);
        	BufferedInputStream stream = new BufferedInputStream(new FileInputStream(path));
    		prop.load(stream);
    		stream.close();
    }else
    {
        	// TO_DO : Richtige Werte angeben!!!!!      	   	 
        	prop.setProperty("host","localhost");
        	prop.setProperty("user","postgres");
        	prop.setProperty("password","root");
        	prop.setProperty("db","schokofabrik");
        }
        Connection con = null;
        try 
        {
            Class.forName("org.postgresql.Driver").newInstance();
            System.out.println("postgresql JDBC Driver Registered!");
            con = DriverManager.getConnection("jdbc:postgresql://"+prop.getProperty("host")+":5432/"+prop.getProperty("db"), prop.getProperty("user"),prop.getProperty("password"));
            
            PreparedStatement insert = con.prepareStatement("INSERT INTO Person VALUES (?,?,?)");
           	insert.setInt(1, 1001);
        	insert.setString(2, "David");
        	insert.setString(3, "Sindl");
        	insert.executeQuery();      
        	PreparedStatement select = con.prepareStatement("SELECT vorname FROM Person WHERE nummer=?");
        	select.setInt(1, 1001);     	
        	select.executeQuery();     	
        	PreparedStatement update = con.prepareStatement("UPDATE Person set vorname=? WHERE nummer=?");
        	update.setString(1, "Patrick");
        	update.setInt(2, 1001);
        	update.executeQuery();
        	PreparedStatement delete = con.prepareStatement("DELETE from Person where nummer=?"); 
        	delete.setInt(1, 1001);	
        	delete.executeQuery();
        	
        	//ende der verbindung
            con.close();
                   
        }finally
        {
        	 System.out.println("connection closed");
      
        }

            
	}
}

