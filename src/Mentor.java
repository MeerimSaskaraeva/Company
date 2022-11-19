import java.time.LocalDate;
import java.time.Period;

public class Mentor extends Insructor{
    public Mentor(long id, String fullName, int age, char gender, double salary) {
        super(id, fullName, age, gender, salary);
    }
    public Mentor(){}



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
        return "Mentor{" +"id=" + getId() +
                ", fullName='" + getFullName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}' +"salary=" + getSalary() +
                '}'+" Total salary for 9 months: ";
    }
}
