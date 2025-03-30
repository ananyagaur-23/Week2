import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        List<Employee> employee = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee("A103","James",2500, 500);
        fte.assignDepartment("IT");
        PartTimeEmployee pte = new PartTimeEmployee("B202","Sarah",1000,5, 100);
        pte.assignDepartment("HR");

        employee.add(fte);
        employee.add(pte);

        for(Employee emp : employee){
            emp.displayDetail();
        }
    }
}