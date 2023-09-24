import java.util.*;
import java.io.*;

public class S_Demo1 {
	public static void main(String args[]){
		String s1="Banglore";
		String s2="Manglore";
		StringBuffer st1=new StringBuffer();
		for(char c:s1.toCharArray()) {
			for(char c1:s2.toCharArray()) {
				if(c==c1) {st1.append(c);}
			}
		}
		System.out.println("common-->"+st1);
		System.out.println("sdfsdf"+s1);
		LinkedHashSet<Character> s3=new LinkedHashSet<Character>();
		for(char c:s1.toCharArray()) {
			s3.add(c);
		}
		HashSet<Character> s4=new HashSet<Character>();
		for(char c:s2.toCharArray()) {
			s4.add(c);
		}
	System.out.println("string s3"+s3.toString());
	System.out.println("string s4"+s4.toString());
		s3.retainAll(s4);
	System.out.println("string"+s3.toString());
		}
	}
