package proxy_design_pattern.Driver;

import proxy_design_pattern.Employee.EmployeeDao;
import proxy_design_pattern.Employee.EmployeeDaoImpl;
import proxy_design_pattern.Employee.EmployeeDaoProxy;

import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        try {
            EmployeeDao employeeDao = new EmployeeDaoProxy(new EmployeeDaoImpl(new ArrayList<>()));
            employeeDao.create("ADMIN", "Rohit");
            employeeDao.get("USER", "Rohit");
            employeeDao.create("USER", "Raman");
            employeeDao.get("ABC", "Roman");
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e.getMessage());
        }
    }
}
