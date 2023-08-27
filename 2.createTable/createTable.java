import java.sql.*;

public class createTable {
    public static void main(String[] args) {
        try{
            /*** S1 : Load the driver ***/
            Class.forName("com.mysql.jdbc.Driver");

            /*** S2 : Create connection with database ***/
            String url = "jdbc:mysql://localhost:3306/CollegeAssingment";
            String username = "root";
            String password = "_____"; // write your password
            Connection connection = DriverManager.getConnection(url,username,password);
            
            String q = "CREATE TABLE Hobby(id int(20) PRIMARY KEY AUTO_INCREMENT , Name varchar(200) NOT NULL , Hobby varchar(400))";
    
            Statement statement = connection.createStatement(); // create a statement
            statement.executeUpdate(q); // execute the insert query
            System.out.println("Table created successfully");
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }   
}
