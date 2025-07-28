public class Ali implements human{


    @Override
    public void intro(String name, String gender, int age) {
        System.out.println("Name: "+ name);
        System.out.println("Gender: "+ gender);
        System.out.println("Age: "+ age);
    }

    @Override
    public void studies(String degree, double GPA) {
        System.out.println("Degree: "+ degree);
        System.out.println("GPA: "+GPA);

    }
}
