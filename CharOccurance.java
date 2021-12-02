package week1.assignment3;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count = 0;
		char[] ch=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
			if(ch[i]=='e')
				count++;
		}
		System.out.println("No. of times the character e occured is: "+ count);
	}

}
