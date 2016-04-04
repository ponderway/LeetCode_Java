import java.util.Arrays;

public class Solution 
{
	public int[] countBits(int num)
	{
		if(num < 0)
			return null;
		
		int[] res = new int[num + 1];
		for(int i = 0; i <= num; ++i)
		{
			res[i] = getBits(i);
		}
		return res;
	}
	
	public int getBits(int num)
	{
		int cnt = 0;
		while(num != 0)
		{
			int bit = num % 2;
			if(bit == 1)
				++cnt;
			num /= 2;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] res = new Solution().countBits(5);
		//System.out.println(Arrays.asList(res));
		for(int x : res)
			System.out.println(x);
	}

}
