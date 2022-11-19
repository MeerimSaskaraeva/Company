import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAmount;

public class Insructor extends Person{
    private double salary;

    public Insructor(long id, String fullName, int age, char gender, double salary) {
        super(id, fullName, age, gender);
        this.salary = salary;
    }
    public Insructor(){}

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    double period(Group group) {
        double x=0;
        double salary=0;
        LocalDate date1=group.getDateOfStart();
        LocalDate date2=group.getDateOfFinish();
        Period period=Period.between(date2,date1);
        x=period.getMonths();
        salary=-x*getSalary();


        return salary;
    }

    @Override
    public String toString() {
        return "Insructor{" +"id=" + getId() +
                ", fullName='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}' +"salary=" + salary +
                '}'+" Total salary for 9 months: ";
    }

}
