package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=14;
//boolean prime=false;
//System.out.println("Prime");
for(int i=2;i<n;i++)
{
	if(n%i==0)
	{
//		prime=true;
		System.out.println(n+" "+ "Not a Prime");
		break;				
	}
	else if(n%i!=0)
	{
		System.out.println(n+ "Prime");
		break;
	}
	}
	}

}
