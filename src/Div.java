
public class Div {
	private int num1,num2;
	public Div(int num1,int num2) {
		this.num1 = num1;
		this.num2  =num2;
	}
	public int getRatio() {
		if(this.num2 == 0)
		{
			System.out.println("Division cannot be possible as denominator is zero");
			return -1;
		}
		return this.num1/this.num2;
	}
}
