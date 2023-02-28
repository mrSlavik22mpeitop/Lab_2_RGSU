import java.util.ArrayList;
public class Conference {
    private ArrayList<Learner> masLearner = new ArrayList<Learner>();
    public void addLearner(Learner m){
        masLearner.add(m);
    }
    public Conference (){

    }

    public Boolean findLearner(Learner m)
    {
        return masLearner.contains(m);
    }

    public Conference(ArrayList<Learner> n){
        masLearner = n;
    }
    public void printLearner(){
        System.out.println("Присутствуют на конференции:");
        int count_student = 0;
        int count_school = 0;
        for (Learner a:masLearner){
            if (a instanceof School){
                System.out.println("Это школьник");
                System.out.println("\t"+a.name_learner());
                count_school = count_school + 1;
            }
            else
            {
                count_student = count_student + 1;
            }


//            System.out.println("\t"+a.age_learner());
        }
        System.out.printf("Количество школьников на конференции:%d\n", count_school);
        System.out.printf("Количество студентов на конференции:%d", count_student);

    }
}
