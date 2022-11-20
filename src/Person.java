import java.util.Arrays;

public abstract class Person {
    private long id;
    private String fullName;
    private int age;
    private char gender;

    public Person(long id, String fullName, int age, char gender) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }
    public Person(){}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    abstract double  period(Group group);

    public static void sortAge(Person[]people) {
        int[] allAge=new int[people.length];
        int counter=0;
        for (Person person : people) {
            allAge[counter]= person.getAge();
            counter++;}
            System.out.println(Arrays.toString(allAge));
        System.out.println("qty people: "+people.length);


    }
    @Override
    public String toString() {
        return "Person{" +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }

}

