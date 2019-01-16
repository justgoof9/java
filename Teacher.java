
class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String myName, int myAge, String myGender, String subject, double salary) {
        super(myName, myAge, myGender);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return this.subject;
    }
    public double getSalary() {
        return this.salary;
    }
 
    public void setSubject(String sub) {
        this.subject = sub;
    }

    public void setSalary(double sal) {
        this.salary = sal;
    }
// but that's not the error . i'm not a fucking jedi to locate the error dude. need time lol
    public String toString() {
        return super.toString() 
        +", subject: "+ this.subject+", salary: "+ this.salary;
    }

}
