package school.management.system;

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student>students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * new school object is created
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher>teachers,List<Student>students){
        this.teachers=teachers;
        this.students=students;
    }

    /**
     * @return the list of teachers of the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * @return the list of students of the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * @return the total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * adds the total money
     * @param totalMoneySpent total money spent by the school
     */
    public void updateTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneyEarned-=totalMoneySpent;
    }

    /**
     * adds total money earned
     * @param totalMoneyEarned total money earned by the school
     */
    public void updateTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned += totalMoneyEarned;
    }

    /**
     * Add a student to the school
     * @param student the student to be added
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     * Add a teacher to the school
     * @param teacher the teacher to be added
     */
    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }
}
