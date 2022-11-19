import java.time.LocalDate;
import java.time.Period;

public class Student extends Person{
    private double contract;

    public Student(long id, String fullName, int age, char gender, double contract) {
        super(id, fullName, age, gender);
        this.contract = contract;
    }
    public Student(){}

    public double getContract() {
        return contract;
    }

    public void setContract(double contract) {
        this.contract = contract;
    }

    @Override
    double period(Group group) {
        double x=0;
        double salary=0;
        LocalDate date1=group.getDateOfStart();
        LocalDate date2=group.getDateOfFinish();
        Period period=Period.between(date2,date1);
        x=period.getMonths();
        salary=-x*getContract();


        return salary;
    }

    @Override
    public String toString() {
        return "Student{" +"id=" + getId() +
                ", fullName='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}' +"contract=" + contract +
                '}'+" Total contract for 9 month: ";
    }
}
