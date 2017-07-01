package LeetPrograms;

public class atoiProblem {
	public static int atoi(String s)
	{
		if(s == null )
			return 0;
		s= s.trim();
		char flag='+';
		int i =0;
		if(s.charAt(0) =='-')
		{
			flag='-';
			i++;
		}
		else if (s.charAt(0) == '+')
			i++;
		double result = 0;
		while(s.length() > i && s.charAt(i)>='0' && s.charAt(i)<='9')
		{
			result=result*10+(s.charAt(i) - '0');
			i++;
		}
		if(flag == '-')
			result = -result;
		if(result >= Integer.MAX_VALUE)
			result = Integer.MAX_VALUE;
		else if(result <= Integer.MIN_VALUE)
			result = Integer.MIN_VALUE;
		return (int) result;
	}
	public static void main(String args[])
	{
		String str = "";
		int i = atoi(str);
		System.out.println(i);
	}
}
