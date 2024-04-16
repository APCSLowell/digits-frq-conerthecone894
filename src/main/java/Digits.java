import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */
		digitList = new ArrayList<Integer>();
		
	    	String x = Integer.toString(num);
		int y = num;

		for(int i = 0; i < x.length(); i++){
			digitList.add(y%10);
			y = y/10;
		}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		if(y%10 == y){
			return true;
		}

		String x = Integer.toString(y);
		for(int i = 0; i < x.length(); i++){
			int a = y%10;
			int b = (y/10)%10;

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
