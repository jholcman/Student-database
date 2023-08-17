
import java.util.Comparator;


public class srovnejPrumer implements Comparator<Student>{

	@Override
	public int compare(Student obj1, Student obj2) {
		if (obj1.getStudijniPrumer()<obj2.getStudijniPrumer())
			return -1;
		if (obj1.getStudijniPrumer()>obj2.getStudijniPrumer())
			return 1;
		return 0;
	}

}
