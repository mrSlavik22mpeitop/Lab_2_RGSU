public class Learner {
    String name;
    int age;
    public Learner (String name, int age){
        this.name = name;
        this.age = age;
    }
    public Learner()
    {

    }

    public void setName(String newname)
    {
        name = newname;
    }
    public void setAge(int newage)
    {
        age = newage;
    }
    public String name_learner()
    {
        return name;
    }

    public int age_learner()
    {
        return age;
    }

}
