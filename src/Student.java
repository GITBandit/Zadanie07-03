public class Student {

    private String firstName;
    private String lastName;
    private double average;

    public Student(String firstName, String lastName, double average) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.average = average;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void  showInfo(){
        System.out.println("Imię : " + firstName + ", Nazwisko : " + lastName + ", Średnia : " + average);
    }
}
