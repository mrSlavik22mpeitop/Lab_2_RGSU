public class School extends Learner{
    private String name_school;
    private int number_class;

    public School(){
        super();
    }
    public School(String name, int age, String name_school, int number_class){
        super(name, age);
        this.name_school = name_school;
        this.number_class = number_class;
    }


    public void SetNameSchool(String newnameschool){
        name_school = newnameschool;
    }

    public void SetNumberClass(int newnumberclass){
        number_class = newnumberclass;
    }

    public String getName_school(){
        return name_school;
    }
    public int getNumber_class(){
        return number_class;
    }



}
