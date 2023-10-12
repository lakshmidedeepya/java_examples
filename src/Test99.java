import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test99 {

    public static void main(String srgs[]){
        List<Integer> al=new ArrayList<>();
        al.add(400);
        al.add(401);
        al.add(400);
        al.add(403);
        al.add(500);

        /*Find the occurances of items in a list*/
       //Using Java8 Streams
        al.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().forEach((entry)->System.out.println(entry));

        Set<Integer> unique=new HashSet<>(al);
        //Java 7 traditional for loop
       for(Integer integer:unique){
            System.out.println(integer+""+Collections.frequency(al,integer));
        }

       /* Given Map of employee name and their rating*/
        Map<String,Integer> hp=new HashMap<>();
        hp.put("swathi",4);
        hp.put("Dedeepya",6);
        hp.put("renu",4);

        //increment the rating by 1 whose rating is 4
        hp.entrySet().stream().filter(entry->entry.getValue().equals(4)).map(entry-> {
            entry.setValue(entry.getValue()+1);
            return entry;
        }).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        hp.entrySet().forEach(System.out::println);

    }
}
