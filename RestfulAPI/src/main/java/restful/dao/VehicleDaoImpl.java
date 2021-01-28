package restful.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.ResultSet; 
import java.sql.Statement;

import restful.model.Vehicle;

@Repository
public class VehicleDaoImpl implements VehicleDao {
	
	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String DB_URL = "jdbc:h2:mem:testdb;IGNORECASE=TRUE";
	static final String USER = "cfa_admin";
	static final String PASS = "p@$$w0rd!";
	Connection conn = null; 
    Statement stmt = null; 
    
    @Override
    public boolean submitVehicle(Vehicle vehicle) {
        /*try { 
            Class.forName(JDBC_DRIVER);  
            conn = DriverManager.getConnection(DB_URL,USER,PASS);  
            String sqlInsertPrice = "insert into vehicle_price(msrp, savings, final_price) values ('" + vehicle.getVehiclePrice().getMSRP() + "','" 
            																						+ vehicle.getVehiclePrice().getSavings() + "','" 
            																						+ vehicle.getVehiclePrice().getFinalPrice() +"')";
            //String sql = "insert into movie(title, genre, is_activated) values('" + movie.getMovieName() + "','" + movie.getGenre() + "', 1)";
            stmt = conn.createStatement();
            //stmt.execute(sqlInsertPrice);
            stmt.close(); 
            conn.close(); 
         } catch(Exception e) { 
            e.printStackTrace(); 
         }*/
        return true;
    }
}
