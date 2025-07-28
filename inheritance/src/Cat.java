public class Cat extends Animal{
    String name;
    int lives;

    Cat(String type, int legs,String name,int lives) {
        super(type, legs);
        this.lives = lives;
        this.name = name;
    }

    @Override
    void description() {
        System.out.println("Type: "+ this.type+ "\nLegs: "+this.legs +"\nName: "+this.name+"\nLives: "+this.lives);

    }
}
