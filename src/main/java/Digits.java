import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */
		digitList = new ArrayList<Integer>();
		
	    	String x = Integer.toString(num);
		int y = num;

		for(int i = 0; i x.length(); i){
			digitList.add(y%10);
			y = y/10;
		}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		if(num%10 = num){
			return true;
		}

		String x = Integer.toString(num);
		for(int i = 0; i < x.length()-1; i++){
			int a = num%10;
			int b = (num/10)%10;

			if(b >= a)
				return false;
		}

		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
