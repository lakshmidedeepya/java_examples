public class S_Demo11 {
    public static void main(String args[]) {
       Test t=new Test();

       String s="abcdefg";
       int hPostion=3;
       int pPostion=2;
      int count=0;
       StringBuffer sb=new StringBuffer(s);
        while(true) {
            sb=t.reArrange(sb, hPostion);
            count++;
            if(s.equals(sb.toString())) {
                System.out.println("test 1  " + count);
                break;
            }else if(s.equals(t.reArrange(sb, pPostion).toString())) {
                count++;
                System.out.println("test 2  " + count);
                break;
            }
            count++;
        }
    }
}
class Test{
        public StringBuffer reArrange(StringBuffer sb,int pos){
            String substring = sb.substring(sb.length() - pos);
            sb.delete(sb.length() - pos, sb.length());
            sb.insert(0, substring);
            return sb;
        }
        }
