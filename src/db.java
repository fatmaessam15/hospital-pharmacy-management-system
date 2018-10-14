/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
// sw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Basma Ashraf
 */
public class db {
    public Connection con;
    public Statement st;
    public ResultSet rs;
    public db()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost"
                    + ""
                    + ":3306/sw","root","");
            st=con.createStatement();
        }
        catch(Exception ex)
        {
            System.out.print("ssss");
        }
    }
    
    }  

