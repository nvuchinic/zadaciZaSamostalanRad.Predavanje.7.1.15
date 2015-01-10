package zadatak3;
/**
 * class that implements Comparator interface. It implements(overrides)  method compare from that interface
 * @author Nermin
 *
 */
public class LastNameComparatorClass implements Comparator {


	/**
	 * method that compares two objects of  type Person, 
	 * @param left object of  type Person
	 * @param right object of  type Person
	 * @return -1 if value of lastName instance variable of left object is less than same value of right object, 0 if they are equal and 1 if left
	 *         is greater than right
	 */
	public int compare(Person left, Person right) {
		if (left.getLastName().compareTo(right.getLastName()) > 0) {
			return 1;
		} else if (left.getLastName().compareTo(right.getLastName()) < 0) {
			return -1;
		} else
			return 0;
	}

}
