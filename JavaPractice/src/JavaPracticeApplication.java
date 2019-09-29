import java.util.*;
public class JavaPracticeApplication {
	
/**
 * @param args
 */
public static void main(String args[]){
	System.out.println("First line");
	Scanner sc = new Scanner(System.in);
	String direct1 = "lavanya";
	String direct2 = "lavanya";
	String direct3 = "sai";
	int m[] = {4,5,6};
	System.out.println(Arrays.toString(m).contains(" 5"));
	String direct4 = "raghu";
	String viaObj1 = new String("lavanya");
	String viaObj2 = new String("siri");
	String viaObj3 = new String("siri");
	System.out.println("direct 1 is : "+direct1+"  direct2 is: "+direct2 +"  direct3 is :"+direct3 +"  viaObj1 is :"+viaObj1 + " viaObj2 is : " +viaObj2+ " viaObj3 is :"+viaObj3);
	System.out.println("Address of direct 1 :" + System.identityHashCode(direct1) );
	System.out.println("Address of direct 2 :" + System.identityHashCode(direct2));
	System.out.println("Address of direct 3 :" + System.identityHashCode(direct3));
	System.out.println("Address of direct 4 :" + System.identityHashCode(direct4));
	System.out.println("Address of viaObj1 :" + System.identityHashCode(viaObj1));
	System.out.println("Address of viaObj2 :" + System.identityHashCode(viaObj2));
	System.out.println("Address of viaObj3 :" + System.identityHashCode(viaObj3));
	
	direct1="kiran";
	System.out.println("\nAddress of direct 1 after re-assigning variable value :" + System.identityHashCode(direct1));
	System.out.println("Address of direct 2 after re-assigning direct1 variable value :" + System.identityHashCode(direct2));
	System.out.println("direct 1 is : "+direct1+"  direct2 is: "+direct2 +"  direct3 is :"+direct3 +"  viaObj1 is :"+viaObj1 + " viaObj2 is : " +viaObj2+ " viaObj3 is :"+viaObj3);
	
	viaObj1 = "raghu";
	System.out.println("\nAddress of viaObj1 after re-assigning variable value :" + System.identityHashCode(viaObj1));
	viaObj2 = new String("lavanya");
	System.out.println("Address of viaObj2 after re-assigning using new :" + System.identityHashCode(viaObj2));
	System.out.println("direct 1 is : "+direct1+"  direct2 is: "+direct2 +"  direct3 is :"+direct3 +"  viaObj1 is :"+viaObj1 + " viaObj2 is : " +viaObj2+ " viaObj3 is :"+viaObj3);
	
	
	direct2 = direct2+" Concat";
	System.out.println("\nAddress of direct 2 after concatination :" + System.identityHashCode(direct2));
	viaObj3 = viaObj3+" Concat1";
	System.out.println("Address of viaObj3 after concatination :" + System.identityHashCode(viaObj3));
	System.out.println("direct 1 is : "+direct1+"  direct2 is: "+direct2 +"  direct3 is :"+direct3 +"  viaObj1 is :"+viaObj1 + " viaObj2 is : " +viaObj2+ " viaObj3 is :"+viaObj3);
	
	//StringBuffer and StringBuilder are mutable objects in java and provide append(), insert(), delete() and substring() methods for String manipulation.
	StringBuffer sb1 = new StringBuffer("lavanya");
	System.out.println("\nAddress of sb1 :" + System.identityHashCode(sb1));
	StringBuffer sb2 = new StringBuffer("lavanya");
	System.out.println("Address of sb2 :" + System.identityHashCode(sb2));
	System.out.println("sb1 is : "+sb1+" sb2 is : "+sb2);
	sb2 = sb2.append(" appened");
	System.out.println("\nAddress of sb2 after appending:" + System.identityHashCode(sb2));
	System.out.println("sb1 is : "+sb1+" sb2 is : "+sb2);
	sb1 = sb2;
	System.out.println("\nAddress of sb1 after assiging sb2 to sb1 :" + System.identityHashCode(sb1));
	System.out.println("Address of sb2 after assiging sb2 to sb1 :" + System.identityHashCode(sb2));
	System.out.println("sb1 is : "+sb1+" sb2 is : "+sb2);
	sc.close();
	/*output:
	First line
	direct 1 is : lavanya  direct2 is: lavanya  direct3 is :sai  viaObj1 is :lavanya viaObj2 is : siri viaObj3 is :siri
	Address of direct 1 :33121026
	Address of direct 2 :33121026
	Address of direct 3 :21933161
	Address of direct 4 :10844563
	Address of viaObj1 :28855442
	Address of viaObj2 :29868116
	Address of viaObj3 :19006625

	Address of direct 1 after re-assigning variable value :10655927
	Address of direct 2 after re-assigning direct1 variable value :33121026
	direct 1 is : kiran  direct2 is: lavanya  direct3 is :sai  viaObj1 is :lavanya viaObj2 is : siri viaObj3 is :siri

	Address of viaObj1 after re-assigning variable value :10844563
	Address of viaObj2 after re-assigning using new :21598637
	direct 1 is : kiran  direct2 is: lavanya  direct3 is :sai  viaObj1 is :raghu viaObj2 is : lavanya viaObj3 is :siri

	Address of direct 2 after concatination :14236464
	Address of viaObj3 after concatination :23934342
	direct 1 is : kiran  direct2 is: lavanya Concat  direct3 is :sai  viaObj1 is :raghu viaObj2 is : lavanya viaObj3 is :siri Concat1

	Address of sb1 :22307196
	Address of sb2 :10568834
	sb1 is : lavanya sb2 is : lavanya

	Address of sb2 after appending:10568834
	sb1 is : lavanya sb2 is : lavanya appened

	Address of sb1 after assiging sb2 to sb1 :10568834
	Address of sb2 after assiging sb2 to sb1 :10568834
	sb1 is : lavanya appened sb2 is : lavanya appened*/
	
}
}


/*import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long arr[] = new long[N];
        for(int i=0; i<N; i++)
            arr[i] = sc.nextLong();
        long out = solve(arr, N);
        System.out.println(out);
    }
    public static long solve(long[] arr, long N){
        // Write your code here
        int count=0;
        for(int i=1;i<N;i++){
            for(int j=1; j<(N-1);j++){
                if(i!=j &&arr[j]==arr[i]*arr[i]){
                    count++;
                }
            }
        }
        return count;
    }
}*/
/*
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

/*

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        

        Scanner sc = new Scanner(System.in);
        
        long L = 0, R = 0;
        int STEP_SIZE = 0;
        
        L = sc.nextLong();
        R = sc.nextLong();
        STEP_SIZE = sc.nextInt();
        
        int N = sc.nextInt();
        long arr[] = new long[N];
        for(int i=0; i<N; i++)
            arr[i] = sc.nextLong();
    //     String out =  solve(L, R, STEP_SIZE, arr, N);
    //     System.out.println(out);
    //  }
    
    // public static String solve(long L, long, R, int STEP_SIZE, long[] arr, long N){
        int lc = 0;
        int rc = 0;
        String positions = "";//Arrays.toString(arr);
        for(int i = 0;i<N;i++){
            positions = positions+arr[i]+" ";
        }
         while(L<=arr[N-1] && R<=arr[N-1]){
            long lpos = L+STEP_SIZE;
            long rpos = R+STEP_SIZE;
            if(positions.indexOf(lpos+" ")>-1){
                lc++;
                L +=STEP_SIZE ;
                R+=STEP_SIZE;
            }
            if(positions.indexOf(rpos+" ")>-1){
                rc++;
                L +=STEP_SIZE ;
                R+=STEP_SIZE;
            }
            // for(int i = 0 ;i<N;i++){
            //     if(lpos==arr[i] ){
            //         lc++;
            //         L +=STEP_SIZE ;
            //         R+=STEP_SIZE;
            //     }
            //     if(rpos==arr[i] ){
            //         lc++;
            //         L +=STEP_SIZE ;
            //         R+=STEP_SIZE;
            //     }
            // }
        }
        //return lc + " "+rc ;
        System.out.println(lc + " "+rc);
    }
}
*/