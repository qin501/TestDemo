package cn.wsq;

public class IntegerTest {
    public static void main(String[] args) {
        Integer a=10;
        Integer b=10;
        int c=10;
        Integer d=new Integer(10);
        System.out.println((a==b)+" "+(a==c));
        System.out.println(a==d);
        Integer aa=127;
        Integer bb=127;
        System.out.println(aa==bb);
    }
}
