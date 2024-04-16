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
		if(digitList.size() == 1){
			return true;
		}

		String x = Integer.toString(y);
		for(int i = 1; i < digitList.size(); i++){
			int a = digitList.get(i);
			int b = digitList.get(i-1);
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
