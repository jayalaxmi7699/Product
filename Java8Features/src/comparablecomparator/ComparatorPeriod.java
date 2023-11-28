package comparablecomparator;

import java.util.Comparator;

public class ComparatorPeriod implements Comparator<Teacher>{

	@Override
	public int compare(Teacher o1, Teacher o2) {
		
		return o1.subjPeriod-o2.subjPeriod;
	}

}
