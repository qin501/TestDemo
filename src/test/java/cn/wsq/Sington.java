package cn.wsq;

public class Sington {
    private Sington(){}
    private static Sington sington=new Sington();
    public static Sington getInstance(){
        return sington;
    }
    private  static volatile Sington sington1=null;
    public static Sington getInstance1(){
        if(sington1==null){
            synchronized(Sington.class){
                if(sington1==null){
                    sington1=new Sington();
                }
            }
        }
        return sington1;
    }
}
