//Max Bertfield
//apcs pd10
//hw #53 MY SORTS
import java.util.ArrayList;
public class MySorts{
      //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
    //precond: lo < hi && size > 0
    //postcond: returns an ArrayList of random integers
    //          from lo to hi, inclusive
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }

    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
	int randomIndex;
        for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
            randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
            al.set( i, al.set( randomIndex, al.get(i) ) );
        }
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   // VOID version of SelectionSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void selectionSortV( ArrayList<Comparable> data ) 
    {
	Comparable temp2;
	for(int i = 0; i < data.size()-1; i++){
	    Comparable min=data.get(i);
	    for(int j =i; j < data.size(); j++){//find min

		if (data.get(j).compareTo(min) < 0){
		    min = data.get(j);
		}
	    }
	    temp2 = data.get(i);
	    data.set(data.indexOf(min),temp2);
	    data.set(i,min);

	    System.out.println(data);
	}
    }
       // ArrayList-returning selectionSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input ) 
          {
	      ArrayList<Comparable> temp = input;
	      selectionSortV(temp);
	      return temp;
	      
	/* your implementation UP IN HERE, UP IN HERE */
	   }//end selectionSort -- O(?)
    
    // VOID version of bubbleSort
    // Rearranges elements of input ArrayList
    // postcondition: data's elements sorted in ascending order
    public static void bubbleSortV( ArrayList<Comparable> data ) {
	//System.out.println("check");
	for(int j = 0; j < data.size(); j++){
	    // System.out.println("check3");
	    for (int i = data.size()-1; i > 0; i--){
		//	System.out.println("chekc 4");
		if (data.get(i).compareTo(data.get(i-1)) < 0){
		    Comparable temp1 = data.get(i);
		    Comparable temp2 = data.get(i-1);
		    data.set(i,temp2);
		    data.set(i-1,temp1);
		}
			System.out.println(data);
	    }
	     }

    }//end bubbleSortV -- O(n^2)
    
    // ArrayList-returning bubbleSort
    // postcondition: order of input ArrayList's elements unchanged
    //                Returns sorted copy of input ArrayList.
     public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
    {
	ArrayList<Comparable> temp = input;
       bubbleSortV(temp);
	//return temp;
	return temp;
	
    }//end bubbleSort -- O(?)

    public static boolean isSorted(ArrayList<Comparable> input){
	for (int i = 0; i < input.size() - 1; i++){
	    if (input.get(i).compareTo(input.get(i+1)) > 0){
		return false;
	    }
	}
	return true;
    }
    public static void bogoSortV(ArrayList<Comparable> in){
	ArrayList<Comparable> input;
	input = in;
	while (!isSorted(input)){
	    shuffle(input);
	    System.out.println(input);
	}
    }
    public static ArrayList<Comparable> bogoSort(ArrayList<Comparable> input){
	ArrayList<Comparable> ret;
	ret = input;
	bogoSortV(ret);
	return ret;
    }
}
    
	    
