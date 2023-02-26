import java.lang.*;
import java.util.Arrays;
class conv {
	String arrayToString(String[] currencies,String delimiter ) {
		String result="";
		if(currencies.length>0)
		{
			
			StringBuilder sb = new StringBuilder();
			for(String s:currencies ) {
				sb.append(s).append(delimiter);
			}
		result = sb.deleteCharAt(sb.length()-1).toString();
		
		}
		return result;
		
	}
	
	
	public class delimiter {
	public static void main(String[] args) {
		String currencies[]= {"USD","INR","GBP"};
		conv c = new conv();
		System.out.println("array is "+Arrays.toString(currencies));
		String output = c.arrayToString(currencies, ",");
		
		
		System.out.println("CSV string"+output);
		String output1=c.arrayToString(currencies, ":");
		System.out.println(output1);
		
		
	}
	

}}
