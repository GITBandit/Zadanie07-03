public class School {

    public static void main(String[] args) {

        People[] people = new People[2];

        people[0] = new Student("Jan","Kowalski",3);
        people[1] = new Teacher("Grzegorz", "Brzęczyszczykiewicz", 2200);

        people[0].showInfo();
        people[1].showInfo();

        people[1].setSalary(2500);

        people[1].showInfo();
    }
}
