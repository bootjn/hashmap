package com.company;

import java.io.File;
import java.util.HashMap; //mao
import java.util.Scanner;

public class Hashmap {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer, String> mymap = new HashMap<Integer, String>();
        //mymap.put(10,"ten");
        Scanner keyboard = new Scanner(System.in);

        //map.put(1, "cat");
        //map.put(3, "dog");
        //map.put(2, "kitty:);
        //map.put(4, "puppy");//'
        //map.put(5, "tutle");

        /*System.out.print("key: ");
        int key = keyboard.nextInt();
        System.out.print("value: ");
        String value = keyboard.next();*/

        /*mymap.put(key,value);//mamap
        //HashMap<Integer, String> hash = // login logic
        //System.out.print(mymap.put(key,value));
        for(Integer keyy : mymap.keySet()) {
            //System.out.print(mymap.values(keyy);
            // )
            System.out.print(keyy);
        }
        for ( String valuee : mymap.values()) {
            System.out.print(valuee);
        }
        /*File file = new File();
        Scanner scannerInput = new Scanner(file);//note that Scanner can read from a file!
        while (scannerInput.hasNextLine()) {
            String line = scannerInput.nextLine();
            System.out.println(line);
        }*/
        /*for ( int i = 0; i <3 ; i++) {
            System.out.print("key: ");
            int key = keyboard.nextInt();
            System.out.print("value: ");
            String value = keyboard.next();
            mymap.put(key, value);
            String value2 = mymap.get(key);
            System.out.print("You entered " + value2 + " ");
        }
        */
        //System.out.print(map);*/

        /*// TODO code application logic here
        HashMap <Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "cat");
        map.put(3, "dog");

        //System.out.print(map);*/

        int key;
        //String value;
        //Scanner keyboard = new Scanner(System.in);

        //enter ket, & value
        /*System.out.print("key?: ");
        key = keyboard.nextInt();
        System.out.print("value?: ");
        value = keyboard.next();

        map.put(key, value);
        System.out.print(map);

        System.out.print("key?: ");
        key = keyboard.nextInt();
        System.out.print("value?: ");
        value = keyboard.next();

        map.put(key, value);
        System.out.print(map);*/

        //for each : loop
        /*for (Integer keys : map.keySet()) {
            System.out.println("Key = " + keys);
        }
        for (String values : map.values()) {
            System.out.println("Value = " + values);
        }*/

        //get used to, doneg~! kitty
        System.out.print("key?: ");
        key = keyboard.nextInt();
        //System.out.print("You entered " + map.get(key) + " "+ map.containsKey(key));
        if (mymap.containsKey(key) == false) {
            System.out.print("no value there.");
            System.out.print("enter value there,");
            //String newvalue = keyboard.next();
            //map.put(key, newvalue);
            String value = keyboard.next();
            mymap.put(key, value);
            System.out.print(mymap);
        }
        else
            System.out.print("You entered " + mymap.get(key) + " "+ mymap.containsKey(key));
    }
}
