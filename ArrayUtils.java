/*
  Max Bertfield
  APCS pd 10
  11.3.15
  hw 23
*/
public class ArrayUtils{
    public static String arrayPrint(Object[] arr){
	String ans = "{";
	for (Object b:arr){
	    ans += "" + b + ",";
	}
	return ans.substring(0,ans.length()-1) + "}";
    }
    public static void arrayPop(int[] arr){
	for (int i = 0; i < arr.length; i++){
	    arr[i] = (int)(Math.random() * 20);
	}
    }
    public static int linFreq(Object[] a, Object  target){
	int ans = 0;	
	for (int i = 0; i < a.length; i++){
	    if (a[i].equals(target)){
		ans += 1 ;
	    }
	    
	}
	return ans;
    }
    public static int linSearch(Object[] a, Object target){
	int ans = -1;	
	for (int i = 0; i < a.length; i++){
	    if (a[i].equals(target)){
		return i ;
	    }
	    
	}
	return ans;
    }

    public static void main(String[] args){
	String[] a = {"a","b","c"};
	Integer[] b = {1,2,3};
	System.out.println(arrayPrint(a));
	System.out.println(arrayPrint(b));
	System.out.println(linSearch(a,"a"));
	System.out.println(linSearch(b,1));
	System.out.println(linFreq(a,"a"));
	System.out.println(linFreq(b,1));
	
    }
}
