package com.acadgild;
/**
 * Session 9 Assignment 2
 * Write a program to copy all the elements from set2 to set1 so that the set1 becomes the union of set1 and set2.
 */
import java.util.LinkedList;                            //This is required to work with LinkedLists

public class CollectionUnion {

    public static void main (String [] args){

        LinkedList<Integer> set1 = new LinkedList<Integer>();   //Instantiating set1 as a linkedList of Integers
        LinkedList<Integer> set2 = new LinkedList<Integer>();   //Instantiating sets as a linkedList of Integers

        for(int i=0; i<10; i++){                        //Populating set1 and set2 with some Integers
            if(i%2==0)
                set2.add(i);                            //Adding all even numbers to set2
            else
                set1.add(i);                            //Adding all odd numbers to set1
        }

        System.out.print("\nThe content of set1:");     //Printing out the contents of set1
        for(Integer elem: set1){
            System.out.print("\t"+elem.toString());
        }

        System.out.print("\nThe content of set2:");     //Printing out the contents of set2
        for(Integer elem: set2){
            System.out.print("\t"+elem.toString());
        }

        set2.addAll(set1);                              //Copying contents of set1 into set2
        System.out.print("\nThe new content of set2:"); //Printing out the new contents of set2
        for(Integer elem: set2){
            System.out.print("\t"+elem.toString());
        }

    }
}