import java.util.*;
import java.util.stream.Collectors;

public class S_Demo9 {
    public static void main(String[] args) {
        List<Employee> al = new ArrayList<Employee>(Arrays.asList(new Employee[]{
                new Employee("1", "sai", "finance", (double) 200000),
                new Employee("4", "Sita", "finance", (double) 100000),
                new Employee("5", "lakshmi", "finance", (double) 6078800),
                new Employee("2", "Ambika", "Management", (double) 379000),
                new Employee("3", "Rama", "Consulting", (double) 770000)
        }));

        int array[] = {12, 33, 45, 33, 12, 67};

        List<Integer> hset = new ArrayList<Integer>();
        for (int j : array){
            if (!hset.contains(j)) {
                hset.add(j);
            }
         }
        int array1[] = new int[hset.size()];
        for(int i=0;i<hset.size();i++){
            array1[i]=hset.get(i);
        }
        Arrays.stream(array1).forEach(System.out::println);
        /*List<Employee> sortedList=al.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println("4 th highest salry employee"+sortedList.get(3));
        int[] array={7,34,12,32,21};
        //find second largest number
        int max=0;
        int secMax=0;
        for(int i=0;i<array.length-1;i++){
            if(array[i]>max){
                if(array[i]>secMax)
                    max=array[i];
            }else if(array[i]<max){
                if(array[i]>secMax)
                    secMax=array[i];
            }
        }
        System.out.println("sec max is"+secMax);
       /* Arrays.sort(array);
        System.out.println(array[array.length-2]);
       */
       // al.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
       /* Map<String,List<String>> hp1=al.stream().collect(Collectors.groupingBy(Employee::getDpmt,Collectors.mapping(Employee::getName,Collectors.toList())));

        hp1.entrySet().stream().map(stringListEntry -> stringListEntry.getValue()).flatMap(Collection::stream).sorted(Collections.reverseOrder()).forEach(System.out::println);

        hp1.entrySet().stream().map(stringListEntry -> stringListEntry.getValue().stream().findFirst()).forEach(System.out::println);

        Map<String, List<String>> hp=al.stream()
                .filter(e->Integer.parseInt(e.id)>3)
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.groupingBy(Employee::getDpmt,
                        Collectors.mapping(Employee::getName,Collectors.toList())
                        )
                );
*/
        //hp.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(System.out::println);
//        System.out.println(hp);
    }
}
class Employee{
    String id;
    String name;
    String dpmt;
    Double salary;

    public Employee(String id, String name, String dpmt, Double salary) {
        this.id = id;
        this.name = name;
        this.dpmt = dpmt;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dpmt='" + dpmt + '\'' +
                '}';
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDpmt() {
        return dpmt;
    }

    public void setDpmt(String dpmt) {
        this.dpmt = dpmt;
    }

}
