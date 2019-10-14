/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseconnectivity;
import java.sql.*;
import java.util.*;
/**
 *
 * @author RSSHARMA
 */
public class test {
    public static void main(String args[]){
        try{
        int i,a,b,c;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter Roll No. , first marks & second marks");
        i=s1.nextInt();
        a=s1.nextInt();
        b=s1.nextInt();
        c=a+b;
        String q="insert into tbresult(ID,First_marks,Second_marks,Result) values(?,?,?,?)";
        myConnection obj=new myConnection();
        PreparedStatement pst= obj.db.prepareStatement(q);
        pst.setInt(1,i);
        pst.setInt(2,a);
        pst.setInt(3,b);
        pst.setInt(4,c);
        pst.executeUpdate();
        }
        catch(Exception e){System.out.println(e.getMessage());}
    
    }
    
}
