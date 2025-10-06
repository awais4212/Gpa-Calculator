import java.util.Scanner;
class GPA_Calculator{
    float Philosophy_Marks;
    float Probability_Marks;
    float Discrete_Marks;
    float Coal_Marks;
    float Coal_Lab_Marks;
    float OOP_Marks;
    float OOP_Lab_Marks;

    int cr_Philosophy_Marks;
    int cr_Probability_Marks;
    int cr_Discrete_Marks;
    int cr_Coal_Theory;
    int cr_Coal_Lab;
    int cr_OOP_Theory;
    int cr_OOP_Lab;


    Scanner input = new Scanner(System.in);
        void Courses_Marks() {
            System.out.println("Enter the Student Philosophy Marks");
            Philosophy_Marks = input.nextFloat();

            System.out.println("Enter the Student Probability & Statistics Marks");
             Probability_Marks = input.nextFloat();

            System.out.println("Enter the Student Discrete Marks");
            Discrete_Marks = input.nextFloat();

            System.out.println("Enter The Student COAL (Theory) Marks");
            Coal_Marks =input.nextFloat();

            System.out.println("Enter The Student COAL (LAB) Marks");
            Coal_Lab_Marks =input.nextFloat();

            System.out.println("Enter The Student OOP (Theory) Marks");
            OOP_Marks = input.nextFloat();

            System.out.println("Enter The Student OOP (LAB) Marks");
            OOP_Lab_Marks = input.nextFloat();
        }

        void Courses_Cr_Hr(){
            System.out.println("Enter the Course Philosophy Credit Hours");
            cr_Philosophy_Marks = input.nextInt();

            System.out.println("Enter the Course Probability & Statistics Credit Hours");
            cr_Probability_Marks = input.nextInt();

            System.out.println("Enter the Course Discrete Credit Hours");
            cr_Discrete_Marks = input.nextInt();

            System.out.println("Enter The Course COAL (Theory) Credit Hours");
            cr_Coal_Theory =input.nextInt();

            System.out.println("Enter The Course COAL (LAB) Credit Hours");
            cr_Coal_Lab =input.nextInt();

            System.out.println("Enter The Course OOP (Theory) Credit Hours");
            cr_OOP_Theory = input.nextInt();

            System.out.println("Enter The Course OOP (LAB) Credit Hours");
            cr_OOP_Lab = input.nextInt();
        }

        double marks_to_Gpa(){
            if(Philosophy_Marks >87 && Discrete_Marks >87 &&
                    Probability_Marks >87 && Coal_Marks >87 &&
                    Coal_Lab_Marks >87 &&  OOP_Marks>87 && OOP_Lab_Marks >87){
                return 4;
            }
            else if(Philosophy_Marks >80 && Discrete_Marks >80 &&
                    Probability_Marks >80 && Coal_Marks >80 &&
                    Coal_Lab_Marks >80 &&  OOP_Marks>80 && OOP_Lab_Marks >80){
                return 3.5;
            }
            else if(Philosophy_Marks >73 && Discrete_Marks >73 &&
                    Probability_Marks >73 && Coal_Marks >73 &&
                    Coal_Lab_Marks >73 &&  OOP_Marks>73 && OOP_Lab_Marks >73){
                return 3;
            }
            else if (Philosophy_Marks >66 && Discrete_Marks >66 &&
                    Probability_Marks >66 && Coal_Marks >66 &&
                    Coal_Lab_Marks >66 &&  OOP_Marks>66 && OOP_Lab_Marks >66){
                return 2.5;
            }
            else if (Philosophy_Marks >59 && Discrete_Marks >59 &&
                    Probability_Marks >59 && Coal_Marks >59 &&
                    Coal_Lab_Marks >59 &&  OOP_Marks>59 && OOP_Lab_Marks >59) {
                return 2;
            }
            return 0;
        }



}


public class GPA{
    public static void main(String[] args) {

        GPA_Calculator gpa = new GPA_Calculator();
        gpa.Courses_Marks();
        gpa.Courses_Cr_Hr();
        double v = gpa.marks_to_Gpa();
        System.out.println("Your Gpa is: "+ v);

    }
}