package proxy_design_pattern.Employee;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    List<Employee> employeeList;

    public EmployeeDaoImpl(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public void create(String client, String name) {
        System.out.println("Created new employee with name: " + name);
        employeeList.add(new Employee(name));
    }

    @Override
    public void delete(String client, String name) {
        Employee employee = get(client, name);
        if (employee != null) {
            employeeList.remove(employee);
            System.out.println("Deleted new employee with name: " + name);
        } else {
            System.out.println("No employee found with name: " + name);
        }
    }

    @Override
    public Employee get(String client, String name) {
        for (Employee employee : employeeList) {
            if (employee.getName().equals(name)) {
                System.out.println("Fetched employee with name: " + name);
                return employee;
            }
        }
        return null;
    }
}
