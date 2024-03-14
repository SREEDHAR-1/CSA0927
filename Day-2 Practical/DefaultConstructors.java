
    class MyClass {
        int a;
        int b;
        MyClass() {
            this.a = 10;
            this.b = 15;
        }
        MyClass(int a, int b) {
            this.a = a;
            this.b = b;
        }
        void disp() {
            System.out.println("a = " + a + ", b = " + b);
        }
    }
    public class DefaultConstructors {
        public static void main(String[] args) {
            MyClass obj1 = new MyClass();
            obj1.disp();
            MyClass obj2 = new MyClass(20, 25);
            obj2.disp();
        }
    }


