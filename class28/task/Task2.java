package class28.task;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    /*1.	Create an arraylist of cars and retrieve all the values using 3 different ways.
2.  Create an arrayList of words. Remove every word that ends with “e”.
3.  Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
4.  Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList
*/
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Lemozene");
        cars.add("benze");
        cars.add("BMW");
        cars.add("Farari");
        /*for(String c:cars){
            System.out.println(c);
        }
        for(int i=0; i<cars.size(); i++) {
            System.out.println(cars.get(i));
        }*/
        Iterator<String> it = cars.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println(cars);
        /////////////////////////////////////////////////////
        ArrayList<String> words = new ArrayList<String>();
        words.add("home");
        words.add("School");
        words.add("Notebook");
        words.add("Student");
        words.add("Knife");

        words.removeIf(s -> s.endsWith("e"));
        System.out.println(words);
        ///////////////////////////////////
        ArrayList<String> drinks= new ArrayList<String>();
        drinks.add("Coke");
        drinks.add("engargy");
        drinks.add("beer");
        drinks.add("Juice");
        drinks.add("Votka");
        System.out.println(drinks);
        for(int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("e") || drinks.get(i).contains("a")) {
                drinks.set(i, "water");
            }
        }
        System.out.println(drinks);
        //////////////////////////////////////////////////////////////////////
            ArrayList<Integer> number = new ArrayList<Integer>(500);

            for(int i=0; i<500; i+=2){
                number.add(i);
            }System.out.println(number);
           // if(number.get(i)%5 == 0){
            //    number.remove(i);
        //}System.out.println(number);
        Iterator<Integer> iterator = number.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%5 == 0){
                iterator.remove();
            }

        } System.out.println(number);
    }
}
