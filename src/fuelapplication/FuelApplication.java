/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fuelapplication;

import java.sql.*;

/**
 *
 * @author Pramuditha Dilshan
 */
public class FuelApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws ClassNotFoundException, SQLException  {
        // TODO code application logic here
        System.out.println("starting");

        String host = "localhost";
        String instance = "DESKTOP-H0GHTEU";
        String database = "jdbc";
        try{
        String uname = "sa";
        String pas = "root";
        String url = "jdbc:sqlserver://"+host+":1433;"+"instance="+instance+":databaseName="+database+";encrypt=true;trustServerCertificate=true";
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

//        String url = "jdbc:sqlserver://localhost:1433;instance=DESKTOP-H0GHTEU:databaseName=jdbc;encrypt=true;trustServerCertificate=true";
                        System.out.println("2");
        Connection con = DriverManager.getConnection(url, uname, pas);

        Statement st = con.createStatement();
        st.executeUpdate("insert into table2 values(203)");
//            st.executeUpdate("delect from table2");
        
        
        System.out.println("Connected to db with Fuel application.");
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
