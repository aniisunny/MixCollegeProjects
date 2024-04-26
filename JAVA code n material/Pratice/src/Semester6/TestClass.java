package Semester6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestClass {
   
    private static List<Long> solve (long min, long max) {
       
        List<Long> list = new ArrayList <>();
       
        for (long i = min; i <= max; i++) {
            if (Long.toBinaryString (i).contains ("101")) {
                list.add (i);
            }
        }
       
        return list;
    }

     public static void main(String []args) {
       
        Scanner sc = new Scanner (System.in);
        int testCases = sc.nextInt ();
       
//        long min = Long.MAX_VALUE;
//        long max = Long.MIN_VALUE;
//        
//        int[] Klist = new int[testCases];
//        long[] R = new long[testCases];
       
        for (int i = 0; i < testCases; i++) {
            long l = sc.nextLong ();
            long r = sc.nextLong ();
            int k = sc.nextInt ();
            
            List<Long> list = solve (l, r);
            if (k > list.size ()) {
              System.out.println (-1);
            }
            else {
            	System.out.println (list.get (k - 1));
            }
//            Klist[i] = k;
//            R[i] = r;
//           
//            min = Math.min (min, l);
//            max = Math.max (max, r);
        }
       
//        List<Long> list = solve (min, max);
//        System.out.println (list);
//       
//        for (int i = 0; i < testCases; i++) {
//            int k = Klist[i];
//            if (k > list.size () || list.get (k - 1) > R[i]) {
//                System.out.println (-1);
//            }
//            else {
//                System.out.println (list.get (k - 1));
//            }
//        }
     }
}
