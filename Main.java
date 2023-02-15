import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
 
    //create an array
    int[] numbers = {0,-5,12,52,-176,5,0};
    String[] words = {"b","a"};

    //print
    System.out.println(Arrays.toString(numbers));

    //sort
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));

    //copy
    int[] copy = Arrays.copyOf(numbers,7);
    System.out.println(Arrays.toString(copy));

    //convert array to arrayList
    List<String> myWords = Arrays.asList(words);
    System.out.println(myWords);
    Collections.sort(myWords);
    System.out.println(myWords);

    //convert list to ArrayList
    
  }
}