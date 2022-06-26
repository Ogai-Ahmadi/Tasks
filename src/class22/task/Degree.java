package class22.task;

import class19task.B;

public class Degree {
    //1.	Create a class 'Degree'
    // having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".
    public void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }

}
//•	Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.
//•	Call the method by creating an object of each of the three classes.
class Bachelor extends Degree{

}
class Master extends Degree{
    public void getPrerequisite(){
        System.out.println("To get a degree you need Bachelor degree");
    }
}
class DegreeTest{
    public static void main(String[] args){
        Degree degree = new Degree();
        degree.getPrerequisite();
        Master master = new Master();
        master.getPrerequisite();
        Bachelor bachelor =new Bachelor();
        bachelor.getPrerequisite();
    }
}
