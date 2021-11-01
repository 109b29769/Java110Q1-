

class Data
{
	private String name;
	private Test score;
	
	class Test
	{
		private int english;
		private int math;
		public Test(int eng,int m) 
		{
			english=eng;
			math=m;
		}
		public double avg() 
		{
			return ((english+math)/2.0);
		}
	}
	public Data(String na,int eng,int ma) 
	{
		name=na;
		score=new Test(eng,ma);
	}
	public void show () 
	{
	      System.out.print("name:"+name);
	      System.out.print(" english="+score.english);
	      System.out.print(" math="+score.math);
	      System.out.println(" avg="+score.avg());
	}
}

public class Class03 {

	public static void main(String[] args) {
		// TODO 自動產生的方法 Stub
		Data stu=new Data("Annie",85,92);
		stu.show();
		Data stu2=new Data("Brian",77,56);
		stu2.show();
	}

}