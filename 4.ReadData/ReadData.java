import java.sql.*;

public class ReadData {
    public static void main(String[] args) {
        try{
            /*** S1 : Load the driver ***/
            Class.forName("com.mysql.jdbc.Driver");

            /*** S2 : Create connection with database ***/
            String url = "jdbc:mysql://localhost:3306/CollegeAssingment";
            String username = "root";
            String password = "_____"; // write your password
            Connection connection = DriverManager.getConnection(url,username,password);
            
            String q = "SELECT * FROM Hobby";

            // get the statement
            Statement statement = connection.createStatement();
            // execute the query
            ResultSet res = statement.executeQuery(q);

            while(res.next()){
                int id = res.getInt(1);
                String name = res.getString(2);
                String city = res.getString(3);

                System.out.println(id + " " + name + " " + city);
            }

            
            connection.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
