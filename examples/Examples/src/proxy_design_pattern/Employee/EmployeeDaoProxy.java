package proxy_design_pattern.Employee;

import java.nio.file.AccessDeniedException;

public class EmployeeDaoProxy implements EmployeeDao {

    EmployeeDaoImpl employeeDaoImpl;

    public EmployeeDaoProxy(EmployeeDaoImpl employeeDaoImpl) {
        this.employeeDaoImpl = employeeDaoImpl;
    }

    @Override
    public void create(String client, String name) throws Exception {
        if (client.equals(EmployeeType.ADMIN.label)) {
            employeeDaoImpl.create(client, name);
        } else {
            throw new AccessDeniedException("Access denied.");
        }
    }

    @Override
    public void delete(String client, String name) throws Exception {
        if (client.equals(EmployeeType.ADMIN.label)) {
            employeeDaoImpl.delete(client, name);
        } else {
            throw new AccessDeniedException("Access denied.");
        }
    }

    @Override
    public Employee get(String client, String name) throws Exception {
        if (client.equals(EmployeeType.ADMIN.label) || client.equals(EmployeeType.USER.label)) {
            return employeeDaoImpl.get(client, name);
        } else {
            throw new AccessDeniedException("Access denied.");
        }
    }
}
