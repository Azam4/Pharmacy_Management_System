
package utill;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author A
 */
public class Dataconection {
    public static Connection getconnection1(){
         try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con= (Connection) DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/pharmacymanage","root","root");  
//here sonoo is database name, root is username and password  
return con;
}catch(Exception e){ System.out.println(e);
return null;
}  
    }
}
