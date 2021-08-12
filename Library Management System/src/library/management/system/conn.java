
/*
            TCR  Innovation
   CORE JAVA+SQL INTERNSHIP PROGRAM
        INTERNSHIP (( FINAL PROJECT ON LIBRARY MANAGEMENT SYSTEM )) .

Name -- VICKY KUMAR JHA
EMAIL -- vk2535vk@gmail.com

INTERNSHIP (( FINAL PROJECT ON LIBRARY MANAGEMENT SYSTEM ))

 */

package library.management.system;


import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root" , "" );   
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  
