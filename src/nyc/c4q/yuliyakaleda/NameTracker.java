package nyc.c4q.yuliyakaleda;

import java.util.ArrayList;
import java.util.Scanner;

public class NameTracker {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();

        System.out.println("Give me some names: ");
        for (int i = 0; i <5; i++) {
            names.add(in.next());
        }

        //print the names in the reverse order
        /*int size = names.size();
          System.out.println("Your " + size + " name(s) are saved! They are: ");

        for (int i = names.size()-1; i>=0; i--) {
            System.out.println(names.get(i));
        }
        */

        //search for a certain name
        System.out.println("Search for a name: ");
        String search = in.next();
        if(names.contains(search)) {
            System.out.println("Yes!");
        }
        else {
            System.out.println ("No!");
        }
    }
}
