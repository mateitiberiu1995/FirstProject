public class person{
	private int age;
	private String name;
	private String job;
	public person(int age, String name, String job)
	{
		this.age = age;
		this.name = name;
		this.job = job;
	}
	public String toString()
	{
		return "Name : " + name + " , Age : " + age + " , Job : " + job;
	}
	public String getName()
	{
		return name;
	}
	
}
/*ArrayList<person> personList = new ArrayList<person>();
person Dave = new person(25,"dave","consultant");
person Karen = new person(36,"karen","bitch");
personList.add(Dave);
personList.add(Karen);
for(int i=0;i<personList.size();i++)
{
	System.out.println(personList.get(i).toString());
}
if(searchName(personList,"dave")==true)
{
	System.out.println("found it");
}*/