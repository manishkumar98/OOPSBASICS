public abstract class Employee
{
private String firstName;
private String lastName;
private String PAN;
public
public
public
public
public
public
public
Employee(String first,String last,String ssn ) {/*code*/}
void setFirstName( String first ){/*code */}
String getFirstName() ){/*code */}
void setLastName( String last ) ){/*code */}
String getLastName() ){/*code */}
void setPAN( String ssn ) ){/*code */}
String getPAN() ){/*code */}
public String toString() {
return String.format( "%s %s\nPAN: %s", getFirstName(),
getLastName(), getPAN() );public abstract double earnings();
}
public class SalariedEmployee extends Employee {
private double weeklySalary;
public SalariedEmployee(String frst,String lst,String pan,double sal) {/*code */}
...
public String toString() {
return String.format("salaried employee: %s\n%s: Rs.%,.2f", super.toString(),
"weekly salary", getWeeklySalary() );
}
}