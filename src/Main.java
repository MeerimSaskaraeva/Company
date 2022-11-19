import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Student student1=new Student(23456,"Mamutov Talant",23,'M',12000);
        Student student2=new Student(43214,"Asanov Uson",43,'M',12000);
        Student student3=new Student(86754,"Esenov Eric",30,'M',12000);
        Student student4=new Student(98765,"Alieva Aliya",23,'F',12000);
        Student student5=new Student(12398,"Temirlanova Malika",34,'F',12000);
        Student[]students1=new Student[]{student1,student2,student3,student4,student5};

        Student student6=new Student(46574,"Urakunov Ulan",38,'M',12000);
        Student student7=new Student(56473,"Davranov Danil",33,'M',12000);
        Student student8=new Student(12345,"Jakshilikov Sanjar",30,'M',12000);
        Student student9=new Student(87634,"Ergeshova Dina",23,'F',12000);
        Student student10=new Student(87245,"Bolotova Burul",34,'F',12000);
        Student[]students2=new Student[]{student6,student7,student8,student9,student10};

        Insructor insructor1=new Insructor(56234,"Asangazieva Aijamal",25,'F',40000);
        Insructor insructor2=new Insructor(65234,"Nuriza Osmonova",22,'F',35000);
        Insructor[]insructors={insructor1,insructor2};

        Mentor mentor1=new Mentor(33456,"Rahim Bazarbay uulu",24,'M',30000);
        Mentor mentor2=new Mentor(76185,"Mukhammed Toichubai uulu",24,'M',30000);
        Mentor[]mentors1={mentor1,mentor2};

        Mentor mentor3=new Mentor(3456,"Esen Niyazov",30,'M',30000);
        Mentor mentor4=new Mentor(6574,"Maksat Akyl",28,'M',30000);
        Mentor[]mentors2={mentor3,mentor4};

        Group group1=new Group("Java8",students1, LocalDate.of(2022,10,01),LocalDate.of(2023,7,1));
        Group group2=new Group("JS8",students2, LocalDate.of(2022,07,01),LocalDate.of(2023,4,1));
        Group[]groups={group1,group2};

        Course course1=new Course("Java",groups,insructor1,mentors1);
        Course course2=new Course("JS",groups,insructor2,mentors2);
        Course[]courses={course1,course2};

        PeaksoftHouse peaksoftHouse=new PeaksoftHouse("PeaksoftHouse","Grajdanskaya 34",courses,"Kyrgyz");
        ItAcademy itAcademy=new ItAcademy("ItAcademy","Mira 7",courses,"Russian");

        Person[] people1={student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
        Person[] people2={mentor1, mentor2,mentor3,mentor4};
        Person[] people3={insructor1,insructor2};


        System.out.println("Total contract per month: "+Company.income(students1,students2));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(insructor1+" "+insructor1.period(group1)+"\n"+
                insructor2+" "+insructor2.period(group2));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Mentor mentor : mentors1) {
        System.out.println(mentor+" "+mentor.period(group1));}
        for (Mentor mentor : mentors2) {
            System.out.println(mentor+" "+mentor.period(group2));}
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Student student : students1) {
        System.out.println(student+" "+student.period(group1));}
        for (Student student : students2) {
            System.out.println(student+" "+student.period(group2));}
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Person.sortAge(people1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Person.sortAge(people2);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        Person.sortAge(people3);

    }
}