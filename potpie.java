package test;

public class potpie {
	private  String firstName;
	private  String lastName;
	public static int members=0;
	public potpie(String fn,String ln)
	{
		firstName=fn;
		lastName=ln;
		members++;
		System.out.printf("name of person is %s %s and no of members are %d\n ",fn,ln,members);
		
	}
}
