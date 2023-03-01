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
//        Student human_4 = new Student();
//        Scanner in = new Scanner(System.in);
//        String human_4_name = in.next();
//        human_4.setName(human_4_name);
//        int human_4_age = in.nextInt();
//        human_4.setAge(human_4_age);
//        String human_4_university = in.next();
//        human_4.SetNameUniversity(human_4_university);
//        int human_4_number = in.nextInt();
//        human_4.SetNumberCourse(human_4_number);
//        myConference.addLearner(human_4);

        boolean human_x = true;
        int jojo = 0;
        while (human_x){
            Scanner in = new Scanner(System.in);
            System.out.print("Введите 1-шкила или 2-студент:");
            jojo = in.nextInt();
            if (jojo == 1)
            {
                System.out.print("Введите имя:");
                String name_human_school = in.next();
                System.out.print("Введите возраст:");
                int age_human_school = in.nextInt();
                System.out.print("Введите название школы:");
                String name_school = in.next();
                System.out.print("Введите номер класса:");
                int number_school = in.nextInt();
                School human_school = new School(name_human_school, age_human_school, name_school, number_school);
                myConference.addLearner(human_school);


            }
            else
            {
                System.out.print("Введите имя:");
                String name_human_university = in.next();
                System.out.print("Введите возраст:");
                int age_human_university = in.nextInt();
                System.out.print("Введите название университета:");
                String name_university = in.next();
                System.out.print("Введите номер курса:");
                int number_university = in.nextInt();
                Student human_student = new Student(name_human_university, age_human_university, name_university, number_university);
                myConference.addLearner(human_student);
            }
            System.out.print("Нажмите 10 если хотите закончить:");
            int test = in.nextInt();
            if (test == 10)
            {
                human_x = false;
            }

        }


        myConference.printLearner();

    }
}
