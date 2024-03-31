package projects;
import java.util.*;
import java.io.*;
public class A7Part1Sorting {
	// Name:		Ben Pallotti
	// Class:		CS 3305/W02
	// Term:		Fall 2022
	// Instructor:  Prof McManus
	// Assignment:  7-Part-1-Sorting

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int userInput = 0;

		//Prompt user to load linked list
		System.out.println("Load the list by typing an integer, "
				+ "then enter. When you are done, type a non-integer. ");

		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		LinkedList<Integer> sortedList = new LinkedList<Integer>();

		//Loop that loads integers until user types a non integer
		for (int i=0; i < 100;i++) {
			try {
				userInput = scan.nextInt();
				linkedList.push(userInput);
			}

			catch (InputMismatchException e)
			{
				break;
			}
		}

		//print both list pre and post sort.
		sortedList = mergeSort(linkedList);
		System.out.println("Your List: \n" + linkedList + "\nSorted List: \n" + sortedList);



		scan.close();
	}




	public static LinkedList<Integer> mergeSort(LinkedList<Integer> linkedList) {
		if (linkedList.size() > 1) {
			// Merge sort the first half
			LinkedList<Integer>  firstHalf = new LinkedList<Integer>();
			int split = (linkedList.size())/2;
			
			for (int i = 0; i < split; i++) {
				firstHalf.addFirst(linkedList.get(i));
			}
			System.out.println(mergeSort(firstHalf));
			
			// Merge sort the second half
			LinkedList<Integer>  secondHalf = new LinkedList<Integer>();
			int split2 = linkedList.size()-(linkedList.size()/2);
			
			for (int i = linkedList.size()-1; i > split2 ; i--) {
				secondHalf.addFirst(linkedList.get(i));
			}
			System.out.println(mergeSort(secondHalf));
			mergeLists(firstHalf, secondHalf);
		}
		
		
		return linkedList;
	}
	
	public static void mergeLists (LinkedList<Integer> LL1, LinkedList<Integer> LL2){
		LinkedList<Integer>  LL = new LinkedList<Integer>();
		
		if (LL1.get(0)>=LL2.get(0))
		{
			for (int i = 0; i < LL1.size(); i++)
				LL.push(LL1.get(i));
			for (int i = 0; i < LL2.size(); i++)
				LL.push(LL2.get(i));
			
		}
		else if (LL2.get(0)>=LL1.get(0)) {
			for (int i = 0; i < LL2.size(); i++)
				LL.push(LL2.get(i));
			for (int i = 0; i < LL1.size(); i++)
				LL.push(LL1.get(i));
		}
		
		
		return;
		
	}

	


}
