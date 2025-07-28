public class Graduate extends Student{

    String study;
    double cgpa;
    Graduate(String name, int age,String study,double cgpa) {
        super(name, age);
        this.study = study;
        this.cgpa = cgpa;
    }

    @Override
    void studies() {
        System.out.println("Study: " + this.study);
        System.out.println("CGPA: " + this.cgpa);

    }
}
