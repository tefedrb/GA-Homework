package tefeStreamsLambda;

import org.junit.Test;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lab {
    public static List<Employee> employees = Arrays.asList(
            new Employee("Bezos, Jeff", LocalDate.of(2004, 4, 2), 68_109.00, "Male"),
            new Employee("Sheryl, Sandberg", LocalDate.of(2014, 7, 1), 87_846.00,"Female"),
            new Employee("Buffet, Warren", LocalDate.of(2011, 7, 23), 95_035.00, "Male"),
            new Employee("Susan, Wojcick", LocalDate.of(2015, 6, 1), 37_210.00, "Female"),
            new Employee("Zuckerberg, Mark", LocalDate.of(2016, 5, 12), 48_450.00, "Male"),
            new Employee("Brin, Sergey", LocalDate.of(2016, 8, 5), 74_416.00, "Male")
    );

    public static void main(String[] args){
//        printList(employees);
//        getEmployeesOver50k();
//        getEmployeeNamesHiredAfter2012();
//        getMaxSalary();
//        getMinSalary();
//        getAverageSalaries();
        getMaximumPaidEmployee();
    }


    public static <T> void printList(List<T> list) {
        list.stream().forEach(i-> System.out.println(i));
    }

    @Test
    public static void getEmployeesOver50k() {
        List<Employee> over50 = employees.stream()
                .filter(e -> e.getSalary() >= 50_000)
                .collect(Collectors.toList());
        printList(over50);
    }

    @Test
    public static void getEmployeeNamesHiredAfter2012() {
        List<String> after2012 = employees.stream()
                .filter(e -> e.getHireDate().isAfter(LocalDate.of(2012,12,31)))
                .map(e -> e.getName())
                .collect(Collectors.toList());
        printList(after2012);
    }

    @Test
    public static void getMaxSalary() {
        Employee highRoller = employees.stream()
                .max(Comparator.comparing(Employee::getSalary)).get();
        double max = highRoller.getSalary();
        System.out.println("Max: " + max);
    }

    @Test
    public static void getMinSalary() {
        Employee pobrecita = employees.stream()
                .min(Comparator.comparing(Employee::getSalary)).get();
        double min = pobrecita.getSalary();
        System.out.println("Min: " + min);
    }

    @Test
    public static void getAverageSalaries() {
        List<Employee> males = employees.stream()
                .filter(e -> e.getGender().equals("Male"))
                .collect(Collectors.toList());

        List<Employee> females = employees.stream()
                .filter(e -> e.getGender().equals("Female"))
                .collect(Collectors.toList());
        double averageMale = males.stream()
                .reduce((double)0,(acc, cur) -> acc + cur.getSalary(), Double::sum) / males.size();
        double averageFemale = females.stream()
                .reduce((double)0,(acc, cur) -> acc + cur.getSalary(), Double::sum) / females.size();

        System.out.println("Averages: Male: " + averageMale + " Female: " + averageFemale);
        System.out.println("Averages: Male: " + averageMale + " Female: " + averageFemale);
    }

    @Test
    public static void getMaximumPaidEmployee() {
        Employee highest = employees.stream()
                .max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(highest);
    }
}
