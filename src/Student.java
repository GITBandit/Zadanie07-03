public class Student extends People {


    private double average;

    public Student(String firstName, String lastName, double average) {
        super(firstName,lastName);
        this.average = average;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public void  showInfo(){
        super.showInfo();
        System.out.println(", Średnia : " + average);
    }
}
