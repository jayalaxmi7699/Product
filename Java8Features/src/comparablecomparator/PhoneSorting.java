package comparablecomparator;
import java.util.TreeSet;
public class PhoneSorting {

	    public static void main(String[] args) {
	        TreeSet<PhoneNumber> phoneNumbers = new TreeSet<>();

	        phoneNumbers.add(new PhoneNumber(1234567890L));
	        phoneNumbers.add(new PhoneNumber(9876543210L));
	        phoneNumbers.add(new PhoneNumber(5555555555L));
	        phoneNumbers.add(new PhoneNumber(9999999999L));

	        // Displaying sorted phone numbers
	        System.out.println("Sorted Phone Numbers:");
	        for (PhoneNumber phoneNumber : phoneNumbers) {
	            System.out.println(phoneNumber);
	        }
	    }
	}
class PhoneNumber implements Comparable<PhoneNumber> {
    private Long number;

    public PhoneNumber(Long number) {
        this.number = number;
    }

    public Long getNumber() {
        return number;
    } 
    
    @Override
	public String toString() {
		return "PhoneNumber [number=" + number + "]";
	}

	@Override
    public int compareTo(PhoneNumber other) {
        // Compare phone numbers based on their natural ordering
//        return Long.compare(this.number, other.getNumber());
        return Long.compare(other.getNumber(), this.number);
    }
}

