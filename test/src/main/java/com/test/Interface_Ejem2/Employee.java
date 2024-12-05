package com.test.Interface_Ejem2;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Employee implements Comparator<Employee> {
   String firstName;
   String lastName;
   Date joinDate;
   public Employee(String firstName, String lastName, Date joinDate) {
           this.firstName = firstName;
           this.lastName = lastName;
           this.joinDate = joinDate;
   }

    public Employee() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   public String toString() {
     DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
     return firstName + " " + lastName + " " + dateFormat.format(joinDate);
}
   
   public Date getJoinDate(){
      return joinDate; 
   }
   
   public int compare(Employee emp1, Employee emp2) {
       return emp1.getJoinDate().compareTo(emp2.getJoinDate());
}

     public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        List<Employee> listEmployees = new ArrayList<>();
        Employee employee1 = new Employee("Tom", "Eagar", dateFormat.parse("2007-12-03"));
        Employee employee2 = new Employee("Tom", "Smith", dateFormat.parse("2005-06-20"));
        Employee employee3 = new Employee("Bill", "Joy", dateFormat.parse("2009-01-31"));
        Employee employee4 = new Employee("Bill", "Gates", dateFormat.parse("2005-05-12"));
        Employee employee5 = new Employee("Alice", "Wooden", dateFormat.parse("2009-01-22"));
        listEmployees.add(employee1);
        listEmployees.add(employee2);
        listEmployees.add(employee3);
        listEmployees.add(employee4);
        listEmployees.add(employee5);
        System.out.println("Before sorting: ");
        System.out.println(listEmployees);
        Collections.sort(listEmployees, new Employee());
        System.out.println("After sorting: ");
        System.out.println(listEmployees);
    }
    
}