import java.sql.*;

public class insertIntoTable {
    public static void main(String[] args) {
        try{
            /*** S1 : Load the driver ***/
            Class.forName("com.mysql.jdbc.Driver");

            /*** S2 : Create connection with database ***/
            String url = "jdbc:mysql://localhost:3306/CollegeAssingment";
            String username = "root";
            String password = "_____"; // write your password
            Connection connection = DriverManager.getConnection(url,username,password);
            
            String q = "INSERT INTO Hobby(Name,Hobby) VALUES (?,?)";

            // get the PreparedStatement object
            PreparedStatement preparedStatement = connection.prepareStatement(q);
            
            // set the value to query 
            preparedStatement.setString(1, "Hrittik1");
            preparedStatement.setString(2, "Kolkata");
            
            // execute the query
            preparedStatement.executeUpdate();

            System.out.println("Data Inserted successfully");
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
