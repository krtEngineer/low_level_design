package proxy_design_pattern.Employee;

import java.nio.file.AccessDeniedException;

public interface EmployeeDao {
    public void create(String client, String name) throws Exception;
    public void delete(String client, String name) throws Exception;
    public Employee get(String client, String name) throws Exception;
}
