/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnectivity;
import java.util.*;
import java.sql.*;
/**
 *
 * @author RSSHARMA
 */
public class AddStudentCode {
    public static void main(String args[]){
        try
        {
            String q="insert into tbstudent(Fname,Lname,Marks) values(?,?,?)";
            int marks;
            String f,l;
            Scanner s1=new Scanner(System.in);
            System.out.println("Enter the Fname, Lname and marks of student to add");
            f=s1.next();
            l=s1.next();
            marks=s1.nextInt();
            myConnection obj=new myConnection();
            PreparedStatement pst=obj.db.prepareStatement(q);
            pst.setString(1, f);
            pst.setString(2, l);
            pst.setInt(3, marks);
            pst.executeUpdate();
        
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());        
        }
    
    }
}
