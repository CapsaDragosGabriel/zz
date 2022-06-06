public class A { static int A = 1; }
class B extends A {
    B() { A = 2; }
}
/*public class A {
    public void hello(){
        System.out.println("hello");
    }
    static void method(StringBuilder s1, StringBuilder s2, int number)
    {
        s1.append("bc");
        s2=new StringBuilder("yz");
        number=123;
    }

    public static void main(String[] args) {
        StringBuilder s1=new StringBuilder("a");
        StringBuilder s2=new StringBuilder("x");
        int n=0;
        method(s1,s2,n);
        System.out.println(s1+","+s2+","+n);
    }
}

class B extends A{
    @Override
    public  void  hello(){
        super.hello();
        System.out.println("hey");
    }
}
*/
