public abstract class Student {

    String name;
    int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;

    }
    void intro(){
        System.out.println("Name: "+this.name+"\nAge: "+this.age);
    }

    abstract void studies();
}
