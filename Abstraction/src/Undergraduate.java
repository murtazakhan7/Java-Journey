public class Undergraduate extends Student{
    String study;
    double gpa;
    Undergraduate(String name, int age,String study,double gpa) {
        super(name, age);
        this.study=study;
        this.gpa = gpa;
    }

    @Override
    void studies() {
        System.out.println("Study: " + this.study);
        System.out.println("GPA: " + this.gpa);
    }
}
