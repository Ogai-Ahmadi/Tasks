package class23.task;

public class Student {
    //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    //•	Define common behavior within parent class and override some of the methods in child classes
    //•	Define some methods specific to child classes
    //•	Write example of achieving run time polymorphism
    int id;
    String name;
    double average;
    String major;
    String semester;
    char grade;

    public void avg(int first_sem_marks,int second_sem_marks){
        average =(first_sem_marks+second_sem_marks)/2;
        System.out.println("average "+average);
    }
    public void grade(double average){
        if(average>=80) {
            grade = 'A';
        }else if (average>=70) {
                grade = 'B';
            } else if(average<70) {
            grade = 'C';
        } else{
            System.out.println("invalid marks");

                }System.out.println(grade);//end of if statement
            }//end of grade method
    public void printInfo(){
        System.out.println("Student id is"+id+" name is "+name+"Major is "+major);
        }

    }

class SyntaxStudent extends Student{
    static int batch = 13;
    //method specific to SyntaxStudent class
    boolean fee;
    public void payFee(){
        if(fee) {
            System.out.println("You have payed your fee");
        }else{
                System.out.println("you have to pay fine for no fee");
        }

    }

    public  void grade(double average) {
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 70 ) {
            grade = 'B';
        } else if (average <= 60) {
            grade = 'C';
        } else {
            System.out.println("invalid marks");

        }
       System.out.println("Grade: "+grade);//end of if statement

    }
    public void printInfo(){
        System.out.println("Student id is"+id+" name is "+name);
    }
}
class CollageStudent extends Student{
    public void printInfo(){
        System.out.println("Student id is"+id+" name is "+name+" grade is "+grade+"Major is "+major);
    }
    int loan;
    double interest;
    public void loan(int loan){
        if(loan>10000){
            interest=10;
        }else{
            interest=20;
        }System.out.println("your loan is"+loan+"Your interest is: "+interest);

    }
}


class SchoolStudent extends Student{
    public void printInfo(){
        System.out.println("Student id is"+id+" name is "+name+" grade is "+grade);
    }
}
class TestClass{
    public static void main(String[] args){
        Student student = new Student();
        student.avg(600,300);
        student.grade(300);
        student.id=123;
        student.name="Ali";
        student.major="Computer Science";
        //////////////////////////////////////
       SyntaxStudent syntaxStudent = new SyntaxStudent();
       syntaxStudent.fee=true;
       syntaxStudent.payFee();
       syntaxStudent.name="Saba";
       syntaxStudent.printInfo();
       syntaxStudent.grade(20);
       ////////////////////////////////////////
        CollageStudent collageStudent=new CollageStudent();
        collageStudent.loan(9000);
        collageStudent.grade(78);
        ////////////////////////////////////////
        SchoolStudent schoolStudent = new SchoolStudent();
        schoolStudent.name="Zala";
        schoolStudent.major="Engineering";
        schoolStudent.id=1234;
        schoolStudent.printInfo();






    }
}
