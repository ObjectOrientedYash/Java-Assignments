public class LibData
{
	static Student s[] = new Student[5];
	static Book b[] = new Book[5];

	public static void setLibData()
	{	
		s[0] = new Student(1,"abc1","ce",4);
		s[1] = new Student(2,"abc2","ce",4);
		s[2] = new Student(3,"abc3","ce",4);
		s[3] = new Student(4,"abc4","ce",4);
		s[4] = new Student(5,"abc5","ce",4);

		b[0] = new Book(1,"java","user","atul",175,1);
		b[1] = new Book(2,"dbms","abc","techno",225,2);
		b[2] = new Book(3,"coa","xyz","atul",150,3);
		b[3] = new Book(4,"os","pqr","techno",195,4);
		b[4] = new Book(5,"cpp","mno","atul",275,5);
	}
}