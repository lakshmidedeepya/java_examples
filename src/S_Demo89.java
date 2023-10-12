/* using streams finding max element in the array */
import java.util.*;
public class S_Demo89 {


	public static void main(String []args){
		System.out.println("Hello, World!");
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(2,5,48,6,9,3,12,8));
		int max=al.stream().filter(i->i%2==0).reduce(0,(a,b)->Math.max(a,b));
		System.out.println("max is"+max);
	}
}