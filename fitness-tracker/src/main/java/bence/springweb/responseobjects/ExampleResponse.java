package bence.springweb.responseobjects;

public class ExampleResponse {
	
	 
	private int age = 3;
	
	private String name = "Bence";
	
	public int getAge()
	{
		return age;
	}
	public String getName()
	{
		return name;
	}
	
	public ExampleResponse(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
	}

}
