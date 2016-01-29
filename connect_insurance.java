package com.first.Jan92016.JavaTutorial;

/**
 * Created by Geetha Yedida on 1/29/2016.
 */
//STEP 1. Import required packages
import java.sql.*;

public class connect_insurance {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/insurance";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "geetha";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //STEP 4: Execute a query
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM employee;";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                String emp_name = rs.getString("emp_name");
                String email = rs.getString("email");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Name: " + emp_name);
                System.out.println(", Email: " + email);
            }
            //STEP 6: Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            //Handle errors for JDBC
            System.out.println("jdbc error");
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            System.out.println("class.forname error");
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }//end finally try
        }//end try
        System.out.println("Goodbye!");
    }//end main
}//end FirstExample