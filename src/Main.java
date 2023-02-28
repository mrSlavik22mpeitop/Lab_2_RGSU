import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Лабораторная работа №2 - Волгин Вячеслав - Вариант №1");
        Conference myConference = new Conference();
        School human_1 = new School("Юрий", 21, "Аниме", 10);
        myConference.addLearner(human_1);
        Student human_2 = new Student("Сергей", 27, "МЭИ", 2);
        myConference.addLearner(human_2);
        School human_3 = new School("Юрий", 30, "Аниме", 10);
        myConference.addLearner(human_3);
        Student human_4 = new Student();
        Scanner in = new Scanner(System.in);
        String human_4_name = in.next();
        human_4.setName(human_4_name);
        int human_4_age = in.nextInt();
        human_4.setAge(human_4_age);
        String human_4_university = in.next();
        human_4.SetNameUniversity(human_4_university);
        int human_4_number = in.nextInt();
        human_4.SetNumberCourse(human_4_number);
        myConference.addLearner(human_4);


        myConference.printLearner();

    }
}
