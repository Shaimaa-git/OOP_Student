public class Student {
    private String Name;
    private Integer Age;
    private Integer Grade;

    public Student(String name, Integer age, Integer grade) {
        Name = name;
        Age = age;
        Grade = grade;
    }
    public void studentInfo(){
        System.out.println("Student name:"+Name);
        System.out.println("Student age:"+Age);
        System.out.println("Student grade:"+Grade);
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getGrade() {
        return Grade;
    }

    public void setGrade(Integer grade) {
        Grade = grade;
    }
}
