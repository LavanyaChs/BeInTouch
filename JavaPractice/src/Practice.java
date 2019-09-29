import java.util.Arrays;
import java.util.Collections;


public class Practice {
	//public void finalize(){System.out.println("finalize called");}  

	public static void main(String a){
		System.out.println("test");
	}
	public static void main(String[] args) {
		
		
		Integer[] intArray = new Integer[] {
		        new Integer(15),
		        new Integer(9),
		        new Integer(16),
		        new Integer(2),
		        new Integer(30)
		    };

		    // Sorting int Array in descending order
		    Arrays.sort(intArray, Collections.reverseOrder());
		 
		    // Displaying elements of int Array
		    System.out.println("Int Array Elements in reverse order:");
		    for (int i = 0; i < intArray.length; i++)
		       System.out.println(intArray[i]);
		 
		    
		//System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		
		
		/*Practice f1=new Practice();  
		Practice f2=new Practice();  
		f1=null;  
		f2=null;  
		System.gc(); */
		System.out.print(new Integer(1)== new Integer(1));
		System.out.println((Integer)1 == (Integer)1);
		
		outerloop:
	        for (int i=0; i < 5; i++) {
	            for (int j=0; j < 5; j++) {
	                if (i * j > 6) {
	                    System.out.println("Breaking");
	                    break outerloop;
	                }
	                System.out.println(i + " " + j);
	            }
	        }
	        System.out.println("Done");
		
	}

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ONE";
		String s2 = "TWO";
		String s3 = s1.toLowerCase();
		String s4 = new String("ONE");
		String s5 = new String("ONE");
		String s6 = new String("Two");
		String s7 = "ONE";
		System.out.println("s1==s2 :" + (s1==s2?"Yes":"No"));
		System.out.println("s1==s4 :" + (s1==s4?"Yes":"No"));
		System.out.println("s1==s7 :" + (s1==s7?"Yes":"No"));
		System.out.println("s1 equals s2 :" + s1.equals(s2) );
		System.out.println("s1 equals s4 :" + s1.equals(s4));
		System.out.println("s1 equals s7 :" + s1.equals(s7));
		System.out.println("s5==s4 :" + (s5==s4?"Yes":"No"));
		System.out.println("s5 equals s4 :" + s5.equals(s4));
		System.out.println("s7==s4 :" + (s7==s4?"Yes":"No"));
		System.out.println("s5 equals s4 :" + s7.equals(s4));
		
		
	}

}
