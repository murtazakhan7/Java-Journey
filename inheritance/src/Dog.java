public class Dog extends Animal{
    String name;
    Dog(String type, int legs, String name) {
        super(type, legs);
        this.name = name;
    }

    @Override
    void description(){
        System.out.println(" ");
        System.out.println("Type: "+ this.type+ "\nLegs: "+this.legs+ "\nName: "+name);

    }
}
