public class StringSample {
    public static void main(String[] args){
        String s="my name is sreedhar";
        String c=s.toUpperCase();
        System.out.println("UPPER CASE: "+c);
        String b=s.replace('s','c');
        System.out.println("NEW STRING:"+b);
        String a=s.toLowerCase();
        System.out.println("LOWERCASE:"+a);
        String d=s.substring(2,6);
        System.out.println("SUBSTRING:"+d);
        char e=s.charAt(6);
        System.out.println("CHAR AT:"+e);
        String f=s.concat("*");
        System.out.println("CONCAT:"+f);
        String g=s.substring(9);
        System.out.println(g);
        boolean h=s.startsWith("s");
        System.out.println(h);
    }
}
