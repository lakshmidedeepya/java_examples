import java.util.*;
import java.io.*;

public class S_Demo2 {
	public static void main(String args[]){
	String s1="Banglore";
	String s2="Manglore";
	HashSet<String> s3=new HashSet<String>(Arrays.asList(s1));
	HashSet<String> s4=new HashSet<String>(Arrays.asList(s2));
System.out.println("string s3"+s3.toString());
System.out.println("string s4"+s4.toString());
s3.add("Manglore");
		System.out.println("string"+s3.toString());
	s3.retainAll(s4);
System.out.println("string"+s3.toString());

		}
	}
