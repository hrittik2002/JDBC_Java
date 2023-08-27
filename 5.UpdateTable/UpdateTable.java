import java.sql.*;

public class UpdateTable {
    public static void main(String[] args) {
        try{
            /*** S1 : Load the driver ***/
            Class.forName("com.mysql.jdbc.Driver");

            /*** S2 : Create connection with database ***/
            String url = "jdbc:mysql://localhost:3306/CollegeAssingment";
            String username = "root";
            String password = "____"; // write your password
            Connection connection = DriverManager.getConnection(url,username,password);
            
            String q = "UPDATE Hobby SET Name=? , Hobby=? WHERE id=?";

            // get the PreparedStatement object
            PreparedStatement preparedStatement = connection.prepareStatement(q);
            
            // set the value to query 
            preparedStatement.setString(1, "Hrittik2");
            preparedStatement.setString(2, "Baranagar");
            preparedStatement.setInt(3, 1);
            
            // execute the query
            preparedStatement.executeUpdate();

            System.out.println("Data Updated successfully");
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
