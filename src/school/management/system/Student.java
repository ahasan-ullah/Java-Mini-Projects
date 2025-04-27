package school.management.system;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing
     * fees for every student is $30,000 per year
     * fees paid initially is 0
     * @param id id for the student: unique
     * @param name name of the student
     * @param grade grade of the student
     */
    public Student(int id,String name,int grade){
        feesPaid=0;
        feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
    }

    //not going to alter students name,students id

    /**
     * Used to update the students grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * Add the fess to fees paid
     * The school is going to receive the funds.
     * @param fees the fees that student pays
     */
    public void updateFeespaid(int fees){
        feesPaid+=fees;
    }
}
