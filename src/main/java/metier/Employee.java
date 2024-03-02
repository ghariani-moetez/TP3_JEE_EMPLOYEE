package metier;
import java.io.Serializable;
public class Employee implements Serializable{
private Long idEmployee;
private String nomEmployee;
private String prenomEmployee;
private double salaire;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Long idEmployee, String nomEmployee, String prenomEmployee, double salaire) {
	super();
	this.idEmployee = idEmployee;
	this.nomEmployee = nomEmployee;
	this.prenomEmployee = prenomEmployee;
	this.salaire = salaire;
}
public Long getIdEmployee() {
	return idEmployee;
}
public void setIdEmployee(Long idEmployee) {
	this.idEmployee = idEmployee;
}
public String getNomEmployee() {
	return nomEmployee;
}
public void setNomEmployee(String nomEmployee) {
	this.nomEmployee = nomEmployee;
}
public String getPrenomEmployee() {
	return prenomEmployee;
}
public void setPrenomEmployee(String prenomEmployee) {
	this.prenomEmployee = prenomEmployee;
}
public double getSalaire() {
	return salaire;
}
public void setSalaire(double salaire) {
	this.salaire = salaire;
}

}