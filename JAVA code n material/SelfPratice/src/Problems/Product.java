package Problems;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Product {
	
	static public void product(int arr[], int n, int x) {
        LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>();
        for(int i = 0; i < arr.length - 2; i++) {
            for(int j = i + 1; j < arr.length - 1; j++) {
                for(int k = j + 1; j < arr.length; k++) {
                    LinkedList<Integer> temp = new LinkedList<Integer>();
                    temp.add(i);
                    temp.add(j);
                    temp.add(k);
                    list.add(temp);
                }
            }
        }
        Iterator<LinkedList<Integer>> itr = list.iterator();
        while(itr.hasNext()) {
            LinkedList<Integer> l = itr.next();
            Collections.sort(l);
            int m = l.getLast();
            l.remove(m);
        }
        int p = 1;
        itr = list.iterator();
        while(itr.hasNext()) {
            LinkedList<Integer> l = itr.next();
            Iterator<Integer> itr1 = l.iterator();
            while(itr1.hasNext()) {
                int m = itr1.next();
                p *= m;
            }
        }
        System.out.println(p);
    }

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the testcases: ");
        int t = scan.nextInt();
        while(t != 0) {
        	System.out.print("Enter the n: ");
            int n = scan.nextInt();
            System.out.print("Enter the x: ");
            int x = scan.nextInt();
            int arr[] = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }
            for(int var : arr)
            	System.out.print(var + " ");
            product(arr, n, x);
            System.out.println("done");
            t--;
        }

	}

}
