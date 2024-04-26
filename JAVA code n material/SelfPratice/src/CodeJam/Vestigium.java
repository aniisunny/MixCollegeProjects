package CodeJam;

import java.util.HashSet;
import java.util.Scanner;

public class Vestigium {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
        int T,N;
        T=scan.nextInt();
        int count=1;
        for(int m=0;m<T;m++)
        {
            N=scan.nextInt();
            int[][] A=new int[N][N];
            for(int i=0;i<N;i++)
            {
                for(int j=0;j<N;j++)
                {
                    A[i][j]=scan.nextInt();
                }
            }
            int sum=0,r=0,c=0;
            HashSet<Integer> colSet = new HashSet<Integer>();
            for(int i=0;i<N;i++)
            {
                boolean dup = false;
                for(int j=0;j<N;j++)
                {
                	boolean dup1=false;
                    if(i==j)
                    {
                        sum+=A[i][j];
                    }
                    int num = A[i][j];
                    for (int otherCol = 0; otherCol < N; otherCol++)
                    {
                        if (otherCol != j && num == A[i][otherCol])
                        {
                            dup = true;
                            break;
                        }
                    }
                    num = A[i][j];
                    for (int otherCol = 0; otherCol < N; otherCol++)
                    {
                        if (!colSet.contains(j) && otherCol != i && num == A[otherCol][j])
                        {
                        	colSet.add(j);
                        	//System.out.println(num + " " + i + " " + otherCol + " " + j);
                             dup1 = true;
                                break;
                        }
                    }
                    
                    if(dup1==true)
                        c++;
                }
                if(dup==true)
                    r++;
            }
            System.out.println("Case #"+count+": "+sum+" "+r+" "+c);
            count++;
           
        }
	}

}
