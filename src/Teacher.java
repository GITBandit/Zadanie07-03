public class Teacher extends People {


    private int salary;

    public Teacher(String firstName, String lastName, int salary) {
        super(firstName,lastName);
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println(", Wynagrodzenie : " + salary );
    }
}
