//package 1.connectToDB;
import java.sql.*;


class ConnectToDB{
    public static void main(String[] args) {
        try{
            /*** S1 : Load the driver ***/
            Class.forName("com.mysql.jdbc.Driver");

            /*** S2 : Create connection with database ***/
            String url = "jdbc:mysql://localhost:3306/CollegeAssingment";
            String username = "root";
            String password = "_____";
           
            Connection con = DriverManager.getConnection(url,username,password);
            
            if(con.isClosed()){
                System.out.println("Connection is closed");
            }
            else{
                System.out.println("Connection is established");
            }
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}