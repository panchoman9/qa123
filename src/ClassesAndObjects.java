public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1= new Person() ;
        person1.name="Roman";
        person1.age=33;
        person1.sayHelloThere();

        Person person2=new Person();
        person2.name="Pablo";
        person2.age=55;
        person2.speak();
        person2.sayHelloThere();

    }
}
class Person {
    String name;
    int age;

    void speak () {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ",i am " + age + " years old.");
        }
    }
    void sayHelloThere (){
        System.out.println("HI");
    };
    };

