import java.util.*;
class cc{
	double r;
	double pi=3.14159;
	int x;
	int y;
	int z;
	
	public void Cal_area(int n,int a,int b,int c) 
	{
		r=n;
		x=a;
		y=b;
		z=c;
	}

	public void show() 
	{
		System.out.println("�b�|="+10);
		System.out.println("�y����n="+Math.round((4*r*r*r*pi/3)*10.0)/10.0);
		System.out.println("��="+x+"�e="+y+"��="+z);
		System.out.println("�ߤ�����n="+2*(x*y+y*z+z*x));
	}

}
public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cc c1=new cc();
		c1.Cal_area(10,4,5,6);
		c1.show();
	}

}
