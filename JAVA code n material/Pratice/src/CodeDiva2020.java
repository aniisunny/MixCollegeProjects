import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CodeDiva2020 {
	
	public static void main (String[] args) throws java.lang.Exception
	  {
	      Scanner scan=new Scanner(System.in);
	      int N, M;
	      N=scan.nextInt();
	      M=scan.nextInt();
	      int A[][] = new int[N][M];
	      for(int i=0;i<N;i++)
	      {
	    	  for(int j=0;j<M;j++)
	    	  {
	    		  A[i][j]=scan.nextInt();
	    	  }
	      }
	      
	      boolean flag = false;
	      List<Integer> list=new ArrayList<Integer>();
	      for(int i=0;i<N-1;i++)
	      {
	    	int j = 0;
	    	for(; j < M; j++) {
	    		if(A[i][j] == 1) {
	    			break;
	    		}
	    	}
	    	if(j == M) continue;
	        int counter=0, k = i;
	        while(k < N && counter!=2)
	        {
	          int sum=0;
	          for(j=0;j<M;j++)
	          {
	            if(A[k][j]==1)
	            {
	              sum+=A[k][j];
	              flag=true;
	            }
	          }
	          if(flag==true)
	          {
	            flag=false;
	            counter++;
	            list.add(sum);
	          }
	          k++;
	        }
	      }
	      
	      int total=0;
	      for(int i=0;i<list.size()-1;i+=2)
	      {
	        total+=list.get(i)*list.get(i+1);
	      }
	      System.out.println(total);

	    }

}
