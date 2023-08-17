import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;



public class Databaze {
	Databaze()
	{
		prvkyDatabaze=new ArrayList<Student>();
	}
		
	public boolean setStudent(int ID,String jmeno)
	{
		return prvkyDatabaze.add(new Student(ID,jmeno));
	}
	
	public Student getStudent(int ID) 
	{
		for (Student studenti:prvkyDatabaze)
			if (studenti.getID() == ID)
				return studenti;
		return null;
	}
	
	public boolean setPrumer(int ID, float prumer)
	{
		for (Student studenti:prvkyDatabaze)
			if (studenti.getID() == ID)
				return studenti.setStudijniPrumer(prumer);
		return false;
	}
	
	public boolean vymazStudenta(int ID)
	{
		Iterator<Student> iter=prvkyDatabaze.iterator();
		while(iter.hasNext())
		{
			Student studenti=iter.next();
			if (studenti.getID() == ID)
			{
				iter.remove();
				return true;
			}
		}
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void setridDatabazi() {
		Collections.sort(prvkyDatabaze);
	}
	public float zjistiNejhorsiPrumer()
	{
		Student studenti=Collections.max(prvkyDatabaze, new srovnejPrumer());
		if (studenti != null)
			return studenti.getStudijniPrumer();
		return -1;
	}
	public void vypisDatabaze()
	{
		for (Student mujStudent:prvkyDatabaze)
			System.out.println("ID: " + mujStudent.getID() + " jmeno: " + mujStudent.getJmeno() + " studijni prumer: " + mujStudent.getStudijniPrumer());
	}
	private List<Student>  prvkyDatabaze;
}