import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///dbmsprojectums","root","Greetings@38");
            s =(Statement)c.createStatement();


        }catch(Exception e){
            System.out.println(e);
        }
    }

}
