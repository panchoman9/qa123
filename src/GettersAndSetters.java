public class GettersAndSetters {
    public static void main(String[] args) {
        Human human1=new Human();
        human1.setName("Bob");
        human1.setAge(33);
        human1.getInfo();

    }
}

class Human{
   private   String name;
   private int age ;

    public void setName(String name) {
        this.name=name;
    }

    public void setAge (int age){
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge () {
        return age;
    }
    public void getInfo(){
        System.out.println(name+","+ age);
    }
}