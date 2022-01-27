public class KlasserOgObjekter {
    public static void main(String[] args) {
        // Student student1;
        // student1 = new Student();

        Student student1 = new Student();

        System.out.println(student1.name);
        System.out.println();

        student1.name = "Nhut";
        student1.lastName = "Pham";
        student1.age = 35;
        student1.studentID = 4269;

        //System.out.println(student1.name + " " + student1.lastName);
        System.out.println(student1.name + "\n" +
                student1.lastName + "\n" +
                student1.age + "\n" +
                student1.studentID);
    }


}
