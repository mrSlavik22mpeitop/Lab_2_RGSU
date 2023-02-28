public class Student extends Learner{
    String name_university;
    int number_course;

    public Student()
    {
        super();
    }
    public Student(String name, int age, String name_university, int number_course){
        super(name, age);
        this.name_university = name_university;
        this.number_course = number_course;
    }
    public void SetNameUniversity(String newnameuniversity){
        name_university = newnameuniversity;
    }

    public void SetNumberCourse(int newnumbercourse){
        number_course = newnumbercourse;
    }

    public String getName_university(){
        return name_university;
    }
    public int getNumber_course(){
        return number_course;
    }
}
