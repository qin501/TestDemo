package cn.wsq;

public class SpringTest {
    public static void main(String[] args) {
        String s1="hello";
        String s2=new String("hello");
        String s3="hel";
        String s4="lo";
        String s5="hel"+"lo";
        String s6=s3+s4;
        System.out.println(s1==s2);
        System.out.println(s1==s5);
        System.out.println(s1==s6);
        System.out.println(s1==s6.intern());
        System.out.println(s2==s2.intern());
        StringBuilder builder = new StringBuilder("hello");
        System.out.println(builder.toString()==s1);
        System.out.println("----------");
        String s7=s1;
        System.out.println("hello"==s7);
        StringBuffer buffer;

    }
}
