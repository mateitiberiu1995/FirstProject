import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HellorWorld {

	public static void main(String[] args) 
	{

		/*String firstSequence;
		String secondSequence;
		firstSequence= "dsafastjbdaascxa";
		secondSequence="dsafastgasfavaxvassfsatgsaknvasj";
		if(firstSequence.length()>=secondSequence.length())
			changeSequence(firstSequence,secondSequence);
		else
			changeSequence(secondSequence,firstSequence);*/
		car Bmw = new car(true,4,2200,"BMW","x5","abc567");
		motorcycle suzuki = new motorcycle(220,4,1500,"suzuki","i50","dsar42");
		garage myGarage = new garage();
		myGarage.Add(Bmw);
		myGarage.Add(suzuki);
		myGarage.Show();
		//myGarage.Remove("dsar42");
		//myGarage.Show();
		//System.out.println("ceva");
		//myGarage.emptyGarage();
		//myGarage.Show();
		System.out.println(myGarage.Repair(Bmw));
		
		
	}
	public static void changeSequence(String firstSequence,String secondSequence)
	{
		boolean check=false;
		String commonSequence=secondSequence;
		for(int i=0;i<secondSequence.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				commonSequence=secondSequence.substring(j,j+secondSequence.length()-i);
				if(searchSequence(commonSequence,firstSequence)!="no")
				
					if(check!=true)
					{
						check=true;
						break;
					}
				
			}
			if(check==true)
			{
				System.out.print(commonSequence);
				break;
			}
		}
	}
	public static String searchSequence(String search,String bigger)
	{
		Pattern word = Pattern.compile(search);
		Matcher match = word.matcher(bigger);

		while (match.find()) {
		     return search;
		}
		return "no";
	}
	public static boolean searchName(ArrayList<person> person, String name)
	{
		for(int i=0;i<person.size();i++)
		{
			
			if(name==person.get(i).getName())
			{
				return true;
			}
		}
		return false;
	}
	public static int HelloWorld(int variable1, int variable2, boolean sumMultiply)
	{
		if(variable1==0 || variable2==0)
		{
			if(variable1==0)
				return variable2;
			else
				return variable1;
		}
		else 
		{
			if(sumMultiply)
				return variable1+variable2;
			else
				return variable1*variable2;
		}
	}
	public static int Blackjack(int variable1, int variable2)
	{
		if(variable1<=21 && variable2<=21)
		{
			if(variable1<variable2)
				return variable2;
			else
				return variable1;
		}
		else
		{
			if(variable1<=21)
				return variable1;
			if(variable2<=21)
				return variable2;
			else
				return 0;
		}
	}
	public static boolean prime(long n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				return false;
			else
				if(i*i>n)
					break;
		}
		System.out.println(n);
		return true;
	}
	
	public static int UniqueSum(int variable1, int variable2, int variable3)
	{
		if(variable1!=variable2 && variable2!=variable3)
			return variable1+variable2+variable3;
		if(variable1==variable2 && variable1!=variable3)
			return variable3;
		else
			if(variable1==variable3 && variable1!=variable2)
				return variable2;
		if(variable2==variable3 && variable2!=variable1)
			return variable1;
		return 0;
	}
	public static boolean TooHot(int temperature, boolean isSummer)
	{
		if((temperature>=60 && temperature<=90) && isSummer==false)
			return true;
		else
			if((temperature>=60 && temperature<=100) && isSummer==true)
				return true;
			else
				return false;
	}

}
