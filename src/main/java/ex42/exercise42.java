package ex42;

//pseudocode
    //for this project I must take input and divide it up into a chart
    //the easiest way to do this is to read in the input and manipulate then and then print it
    //this helps avoid unnecessary lists and such and will just work with the format of the line

import java.io.*;
import java.util.Scanner;


public class exercise42 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/main/java/ex42/exercise42_input.txt");
        Scanner info = new Scanner(file);

        System.out.println("Last      First     Salary");
        System.out.println("--------------------------");

        while (info.hasNext()){
            String data = info.nextLine();
            String[] temp = data.split(",");
            System.out.printf("%-17s%-17s%-17s\n", temp[0],temp[1],temp[2]);

        }

    }

}
