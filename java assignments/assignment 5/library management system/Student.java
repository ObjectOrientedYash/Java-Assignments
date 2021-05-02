public class Student
{
	private int id, sem, bid;
	private int limit = 1;
	private String name, dept;

	Student(){}

	Student(int id, String name, String dept, int sem)
	{
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.sem = sem;
	}

	public int getid()
	{	
		return id;	
	}

	public String getname()
	{	
		return name;	
	}

	public String getdept()
	{	
		return dept;	
	}

	public int getsem()
	{	
		return sem;	
	}

	public int getlimit()
	{	
		return limit;	
	}

	public void setlimit(int lim)
	{	
		limit = lim;	
	}
}