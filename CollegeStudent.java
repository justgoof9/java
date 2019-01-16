
class CollegeStudent extends Student {
    private String major;
    private int year;

    public CollegeStudent(String name, int age, String gender,String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.major = major;
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }
    public String getMajor() {
        return this.major;
    }

    public void setYear(int y) {
        this.year = y;
    }
    public void setMajor(String maj) {
        this.major = maj;
    }

    public String toString() {
        return super.toString()+", year:"+this.year+", major: "+this.major;
        // wtf, this is the file i was working on?
        // what

    }
}
