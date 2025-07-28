public class Animal {

    String type;
    int legs;

    Animal(String type,int legs){
        this.type = type;
        this.legs = legs;
    }

    void description(){
        System.out.println("Type: "+ this.type+ "\nLegs: "+this.legs);

    }
}
