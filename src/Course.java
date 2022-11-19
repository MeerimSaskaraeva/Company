public class Course {
    private String programming;
    private Group[]groups;
    private Insructor instructor;
    private Mentor[]mentors;

    public Course(String programming, Group[] groups, Insructor instructor, Mentor[] mentors) {
        this.programming = programming;
        this.groups = groups;
        this.instructor = instructor;
        this.mentors = mentors;
    }

    public String getProgramming() {
        return programming;
    }

    public void setProgramming(String programming) {
        this.programming = programming;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Insructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Insructor instructor) {
        this.instructor = instructor;
    }

    public Mentor[] getMentors() {
        return mentors;
    }

    public void setMentors(Mentor[] mentors) {
        this.mentors = mentors;
    }
}
