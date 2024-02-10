public class Example extends Sample{
    void add(int a,int b,int c){//changing the numbers of parameters
        int d= a + b + c;
        System.out.println(d);
    }
  //  void add(int a,String b){//interchanging parameters
   // String c=a+b;
    //System.out.println(c);
    //}
     // void add(int a,double b){//changing datatype overloading
       // double c=a+b;
        //System.out.println(c);
    //}


public static void main(String[] args){
    Example c=new Example();
    c.add(3,2,6);
}
}
