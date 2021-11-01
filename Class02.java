import java.util.*;

class is_prime{
	
	public is_prime(int n) 
	{
		if(n%2==0) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}
}
public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		is_prime t=new is_prime(23);
		is_prime t1=new is_prime(37);
		is_prime t2=new is_prime(39);
	}

}
