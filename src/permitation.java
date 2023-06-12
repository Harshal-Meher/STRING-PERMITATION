
public class permitation {
	public static void perm(String str,String permi)
	{
		if(str.length()==0)
		{
			System.out.println(permi);
		}
		for(int i=0;i<str.length();i++)
		{
			char nchar=str.charAt(i);
			String nsString=str.substring(0,i)+str.substring(i+1);
			perm(nsString, permi+nchar);
		}
	}

	public static void main(String[] args) {

		String str="ABC";
		perm(str, "");
		
	}

}
