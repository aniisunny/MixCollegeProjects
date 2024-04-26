package Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ElyeOnMatrix {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int arr[][] = new int[row][col];
        int helper[] = new int[row*col];
        int k = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = scan.nextInt();
                helper[k] = arr[i][j];
                k++;
            }
        }

        Arrays.sort(helper);
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < helper.length; i++) {
            set.add(helper[i]);
        }

        System.out.println(set);
        k = 1;
        Iterator itr = set.iterator();
        while(itr.hasNext()) {
            int temp = (int)itr.next();
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < col; j++) {
                    if(temp == arr[i][j]) {
                        arr[i][j] = k;
                    }
                }
            }
            k++;
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

	}

}
