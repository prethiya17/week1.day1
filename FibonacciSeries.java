package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=8;
		int fnum=0;
		int snum=1;
		
		for(int i=1;i<=n;i++)
		{
			int sum=fnum+snum;
			System.out.println(sum);
			
			fnum=snum;
			snum=sum;
			
		}

	}

}
