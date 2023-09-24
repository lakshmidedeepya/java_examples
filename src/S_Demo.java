public class S_Demo{



public static void main(String args[]){

String s="madam";
//String s1="morning";

StringBuffer sf=new StringBuffer();
char[] cArray=s.toCharArray();
for(int i=cArray.length-1;i>=0;i--)
{
    sf.append(cArray[i]);
}
/*
StringBuffer sf=new StringBuffer();
for(int i=s.length()-1;i>=0;i--){
    sf.append(s.charAt(i));
}*/

if(s.equals(sf.toString()))
System.out.println("palindrome");
else
System.out.println("not palindrome");



}
}