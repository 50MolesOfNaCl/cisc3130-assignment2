/******************************************************************************
 *  _Example commands for running this file_
 *  Compilation:  javac -Xlint Merge.java
 *  Execution:    java Merge
 *
 *  Example code reverses the input array. Edit this file
 *  to check whether the input is a palindrome.
 *
 ******************************************************************************/


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Merge {

  // Sample input
  public static int[] input1 = {1,3,5,7};
  public static int[] input2 = {2,4,5,6};

  public static void main(String[] args){

    // Display Input1
    System.out.println("Input1\t" + Arrays.toString(input1));

    // Create empty queues
    Queue<Integer> queue1 = new LinkedList<Integer>();
    Queue<Integer> queue2 = new LinkedList<Integer>();
    Queue<Integer> merged = new LinkedList<Integer>();
    
    //FILL QUEUE
    load_queue(input1, queue1);
    load_queue(input2, queue2);
    
    /*
    // Save the input string
    String output = "";
    while(queue1.peek() != null ){
      //One by one pop all characters from stack and put them back to string.
      output += Integer.toString(queue1.poll());
    }
    */
    
    //ADDED CODE
    while(queue2.isEmpty() == false)
    {
    	if(queue1.peek() <= queue2.peek())
    		merged.add(queue1.poll());
    	else
    		merged.add(queue2.poll());
    }
    System.out.println(merged.toString());
  }
  
  public static void load_queue(int a[], Queue<Integer> queue)
  {
	  for(int i=0; i<a.length; i++){// One by one push all characters of string to queue.
		  queue.add(a[i]);
	  }
  }
}
