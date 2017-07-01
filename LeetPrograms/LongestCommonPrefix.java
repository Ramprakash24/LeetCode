package LeetPrograms;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) 
	{
	    if (strs.length == 0) return "";
	    String prefix = strs[0];
	    for (int i = 1; i < strs.length; i++)
	        while (strs[i].indexOf(prefix) != 0) {
	            prefix = prefix.substring(0, prefix.length() - 1);
	            if (prefix.isEmpty()) 
	            	return "";
	        }        
	    return prefix;
	}
	public static void main(String args[])
	{
		
		String[] str ={"geeksforgeeks","geeks","geeksfor","geek"};
		
		String prefix;
		prefix=longestCommonPrefix(str);
		System.out.println(prefix);
		/*
		String str = "geeksforgeeks";
		
		System.out.println(str[0]);
		System.out.print(str[0].length());
		*/
		System.out.println(str[1].indexOf("geeksf"));
		System.out.println(str[0].substring(3, str[1].length()-1));
		
	}
}
