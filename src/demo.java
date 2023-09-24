public class demo{

int i=8;
String a;

public demo(String a,int i){
	this.a=a;
	this.i=i;
}
public int reverse(int num){
int res=0;


while(num>0){
res=res*10+num%10;
num=num/10;
//System.out.println("test"+res+num);
}
return res;
}

public boolean ispalindrome(int num1){
if(num1==reverse(num1))
	return true;
else return false;
}

public static void main(String args[]){
int iteration=0;
demo d=new demo("sai",9);
System.out.println("hello"+d.a+"no is "+d.i);
System.out.println("rev"+d.ispalindrome(54845));
int[] abc={345,25,181,2325,1221};
for(int j=0;j<abc.length;j++){
	int sum=abc[j]+d.reverse(abc[j]);
	if(d.ispalindrome(sum)) {
		iteration++;
		System.out.println(" "+sum);
	}
	else continue;
}
System.out.println("iterations are "+iteration);
}
}