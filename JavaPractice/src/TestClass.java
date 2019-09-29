/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes

*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        
System.out.println("Hi");
        Scanner sc = new Scanner(System.in);
        
        long L = 0, R = 0;
        int STEP_SIZE = 0;
        
        L = 1;//sc.nextLong();
        R = 2;//sc.nextLong();
        STEP_SIZE = 3;//sc.nextInt();
        
        int N = 8;//sc.nextInt();
        long arr[] = {16,10,13,4,8,7,15,20};//new long[N];
//        for(int i=0; i<N; i++)
//            arr[i] = sc.nextLong();
    //     String out =  solve(L, R, STEP_SIZE, arr, N);
    //     System.out.println(out);
    //  }
    
    // public static String solve(long L, long, R, int STEP_SIZE, long[] arr, long N){
        int lc = 0;
        int rc = 0;
        String positions = " ";//Arrays.toString(arr);
        for(int i = 0;i<N;i++){
            positions = positions+arr[i]+" ";
        }
        System.out.print(positions);
         while(L<arr[N-1] && R<arr[N-1]){
            long lpos = L+STEP_SIZE;
            long rpos = R+STEP_SIZE;
            if(positions.indexOf(" "+lpos+" ")>-1){
                lc++;
                L +=STEP_SIZE ;
                R+=STEP_SIZE;
            }
            if(positions.indexOf(" "+rpos+" ")>-1){
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
        sc.close();
    }
}
/*import java.util.*;
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
        String positions = " ";//Arrays.toString(arr);
        for(int i = 0;i<N;i++){
            positions = positions+arr[i]+" ";
        }
         while(L<arr[N-1] && R<arr[N-1]){
            long lpos = L+STEP_SIZE;
            long rpos = R+STEP_SIZE;
            if(positions.indexOf(" "+lpos+" ")>-1){
                lc++;
                L +=STEP_SIZE ;
                R+=STEP_SIZE;
            }
            if(positions.indexOf(" "+rpos+" ")>-1){
                rc++;
                L +=STEP_SIZE ;
                R+=STEP_SIZE;
            }
            
            
        }
        if(L==arr[N-1]){
                rc++;
            }
            if(R==arr[N-1]){
                lc++;
            }
        //return lc + " "+rc ;
        System.out.println(lc + " "+rc);
    }
}
*/
