package comparablecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Comparableclass {

	public static void main(String[] args) {
		Teacher t1= new Teacher();
		t1.name="Jaya";
		t1.subject="Hindi";
		t1.subjPeriod=1;
		
		Teacher t2= new Teacher();
		t2.name="Ananya";
		t2.subject="Maths";
		t2.subjPeriod=2;
		
		Teacher t3= new Teacher();
		t3.name="Tanvi";
		t3.subject="English";
		t3.subjPeriod=4;
		
		Teacher t4= new Teacher();
		t4.name="Sruthi";
		t4.subject="Science";
		t4.subjPeriod=3;
		
		List<Teacher> li = new ArrayList<>();
		li.add(t1);
		li.add(t2);
		li.add(t3);
		li.add(t4);
		ComparatorPeriod comp = new ComparatorPeriod();
		Collections.sort(li, comp);
		
//		t1.compareTo(t4);
		Collections.sort(li);
		
		li.forEach(s->{System.out.println(s.name+" "+s.subject+" "+s.subjPeriod);});
		;
		
	
		
		
		
		}
		
	}

