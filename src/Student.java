
@SuppressWarnings("rawtypes")
public class Student implements Comparable {
	
	public Student(int ID,String jmeno)
	{
		this.jmeno=jmeno;
		this.ID=ID;
	}
	
	public String getJmeno()
	{
		return jmeno;
	}
	
	public int getID()
	{
		return ID;
	}
	
	public float getStudijniPrumer() {
		return studijniPrumer;
	}

	public boolean setStudijniPrumer(float studijniPrumer) {
		if (studijniPrumer<1||studijniPrumer>5)
		{
			System.out.println("Chybny prumer");
			return false;
		}
		this.studijniPrumer = studijniPrumer;
		return true;
	}
	
	private int ID;
	private String jmeno;
	private float studijniPrumer;

	@Override
	public int compareTo(Object obj) {
		if (obj instanceof Student)
		{
			Student stud= (Student) obj; 
			if (ID > stud.ID)
				return 1;
			if (ID < stud.ID)
				return -1;
			return 0;
		}
		else  throw new IllegalArgumentException();
	}
	
}