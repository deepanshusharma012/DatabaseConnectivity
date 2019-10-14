/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnectivity;
import java.sql.*;
/**
 *
 * @author RSSHARMA
 */
public class myConnection {
    Connection db;
    public myConnection(){
        try{
    db=DriverManager.getConnection("jdbc:mysql://localhost/dbplacementcell","root","");
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
  }
}
