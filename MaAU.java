package jay_github;
import java.util.*; 
public class MaAU {
	
	public static void main(String args[])
	{
		int K,N;
		
		System.out.println("Enter number of test cases");
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		int[] res = new int[test_case];
		for(int i = 0 ; i<test_case ; i++)
		{
			System.out.println("Inside Testcase loop");
			System.out.println("Enter Array size and update number");
			N=sc.nextInt();
			K=sc.nextInt();
			int[] A = new int[N];
			System.out.println("Enter Array Elements");
			for(int j=0;j<N;j++)
				A[j] = sc.nextInt();
			int k=0;
			int count = 0;
			while(A[k]<K)
			{
				System.out.println("k="+k);
				System.out.println("Inside while loop");
				if(A[k]<K)
				{
					System.out.println("Inside if");
					count=count+1;
					System.out.println("count value"+count);
					for(int j=0;j<N;j++)
						A[j]+=1;
					k=0;
					continue;
				}
				k++;
				System.out.println("kvalue after k++");
			}
			res[i] = count;
		}
		for(int i = 0 ; i<test_case ; i++)
		System.out.println(""+res[i]);
		
	}

}