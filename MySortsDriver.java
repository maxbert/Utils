import java.util.ArrayList;
public class MySortsDriver{
        public static void main(String [] args){

    	ArrayList glen = new ArrayList<Integer>();
	glen.add(7);
	glen.add(1);
	glen.add(5);
	glen.add(12);
	glen.add(3);
	ArrayList ben = new ArrayList<Integer>();
	ben.add(16);
	ben.add(67);
	ben.add(245);
	ben.add(21);
	ben.add(2);
	ArrayList sven =new ArrayList<Integer>();
	sven.add(17);
	sven.add(11);
	sven.add(15);
	sven.add(112);
	sven.add(13);
	System.out.println( "ArrayList glen  before sorting:\n" + glen );
	System.out.println( "ArrayList ben  before sorting:\n" + ben );
	System.out.println( "ArrayList sven  before sorting:\n" + sven );
	
	ArrayList glenSorted = MySorts.bubbleSort( glen );
	System.out.println( "Bubblesorted version of ArrayList:\n" 
			    + glenSorted );
	System.out.println("-----------");
	ArrayList benSorted = MySorts.selectionSort(ben);
	System.out.println( "Selectionsorted version of ArrayList:\n" 
			    + benSorted );
	System.out.println("-----------");
	ArrayList svenSorted = MySorts.bogoSort(sven);
	System.out.println( "Bogosorted version of ArrayList:\n" 
			    + svenSorted );
	

    }//end main
}
