import java.util.Scanner;
class is_prime 
{
	int num;
	boolean flag = true;
	public is_prime(int n) 
	{
		num=n;
	}
	public void show()
	{
		for(int i=2;i<=Math.sqrt(num);i++) 
		{
			if(num%i==0) 
			{
				flag=false;
				break;
			} 
		}
	
	if (flag) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
	}
}
public class Class02 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		is_prime ipe=new is_prime(num);
		ipe.show();
	}

}
