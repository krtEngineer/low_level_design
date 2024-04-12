package proxy_design_pattern.Employee;

import java.util.Arrays;

public enum EmployeeType {
    ADMIN("ADMIN"),
    USER("USER");

    public final String label;

    EmployeeType(String label) {
        this.label = label;
    }

    public static EmployeeType get(String label) {
        return Arrays.stream(EmployeeType.values())
                .filter(employeeType -> employeeType.label.equals(label))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
