package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public  class MetierImpl implements ImetierCatalogue {
@Override
public List<Employee> getEmployeesParMotCle(String mc) {
List<Employee> employs= new ArrayList<Employee>();
Connection conn=SingletonConnection.getConnection();
try {

PreparedStatement ps= conn.prepareStatement("select * from EMPLOYEE where NOM_EMPLOYEE LIKE ?");

ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
Employee p = new Employee();
p.setIdEmployee(rs.getLong("ID_EMPLOYEE"));
p.setNomEmployee(rs.getString("NOM_EMPLOYEE"));
p.setPrenomEmployee(rs.getString("PRENOM_EMPLOYEE"));
p.setSalaire(rs.getDouble("SALAIRE"));
employs.add(p);
}
} catch (SQLException e) {
e.printStackTrace();
}
return employs;
}

@Override
public void addEmployee(Employee e) {
	// TODO Auto-generated method stub
	
}
}