public class Person{
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }
    public static void main(String[] args) {
        Person person1 = new Person("Sreedhar", 19);
        Person person2 = new Person("Sreedhar", 19);
        System.out.println("person1: " + person1.toString());
        System.out.println("person2: " + person2.toString());
        System.out.println("Are persons equal? " + person1.equals(person2));
    }
}
