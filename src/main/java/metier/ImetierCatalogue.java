package metier;
import java.util.List;
public interface ImetierCatalogue {
public List<Employee> getEmployeesParMotCle(String mc);
public void addEmployee(Employee e);

}