public class School {

    public static void main(String[] args) {


        Student student1 = new Student("Jan","Kowalski",3);
        Teacher teacher1 = new Teacher("Grzegorz", "Brzęczyszczykiewicz", 2200);

        student1.showInfo();
        teacher1.showInfo();
    }
}
