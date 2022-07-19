package class28.task;

import java.util.ArrayList;

public class Task1 {
    /*1.	Create an ArrayList that will store 5 names into it.
•	Find out whether the given ArrayList is empty or not?
•	Check whether the specific name is present in an ArrayList or not?
•	Find the size of your arrayList and print all values from that

     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(5);
        list.add("Yama");
        list.add("Aimal");
        list.add("Ali");
        list.add("Hosai");
        list.add("Malalai");
        System.out.println(list);
        System.out.println(list.size());
        if(list.isEmpty()){
            System.out.println("Empty List");
            }else{
            System.out.println("NotEmpty List");
        }
        System.out.println(list.contains("Yama"));


    }
}
