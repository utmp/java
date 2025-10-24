public class index{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "John";
        student1.midTerm = 45;
        student1.finalExam = 34;
        student1.printResult();

        Student student2 = new Student();
        student2.name = "David";
        student2.midTerm = 70;
        student2.finalExam = 90;
        student2.printResult();
    }
}