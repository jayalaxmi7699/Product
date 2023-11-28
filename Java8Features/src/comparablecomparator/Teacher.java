package comparablecomparator;

public class Teacher implements Comparable<Teacher> {

	public String name;
	public String subject;
	public int subjPeriod;

	// comparable sorting only one element
	// will modify orginal class
	@Override
	public int compareTo(Teacher o) {
//		if (this.subjPeriod == o.subjPeriod) {
//			return 0;
//		} else if (this.subjPeriod > o.subjPeriod) {
//			return 1;
//		} else {
//			return -1;
//		}

//		return this.subjPeriod - o.subjPeriod;
		return this.name.compareTo(o.name);
	}

}
