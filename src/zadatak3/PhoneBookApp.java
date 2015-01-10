package zadatak3;

public class PhoneBookApp {

	public static void main(String[] args) {
		Person[] phonebook = new Person[] { new Person("Aja", "Goehring"),
				new Person("Arvilla", "Hodžiæ"),
				new Person("Lavette", "Viveiros"),
				new Person("Mandi", "Arguello"), new Person("Annett", "Mize"),
				new Person("Shantell", "Dike"),
				new Person("Daphine", "Dillman"),
				new Person("Louella", "Hodžiæ"),
				new Person("Amalia", "Brigman"),
				new Person("Alphonse", "Varley"), new Person("Phil", "Ewen"),
				new Person("Olimpia", "Saenz"),
				new Person("Erminia", "Mirando"),
				new Person("Edythe", "Castenada"),
				new Person("Robbi", "Maese"), new Person("Kelley", "Printz"),
				new Person("Dannie", "Ocasio"),
				new Person("Charles", "Hodžiæ"), new Person("Rubie", "Washer"),
				new Person("Bryant", "Masker"),
				new Person("Julius", "Stalzer"),
				new Person("Clement", "Prager"), new Person("Kathie", "Oquin"),
				new Person("Shakira", "Hernandes"),
				new Person("Armand", "Boler"), new Person("Foster", "Tims"),
				new Person("Hana", "Howson"), new Person("Arletta", "Nastasi"),
				new Person("Rebeca", "Mcnally"),
				new Person("Hsiu", "Rosemond"), new Person("Tyson", "Hodžiæ"),
				new Person("Celina", "Gallego"),
				new Person("Criselda", "Herrell"),
				new Person("Kendall", "Bascombe"),
				new Person("Nubia", "Deeter"),
				new Person("Joannie", "Deshields"),
				new Person("Sarai", "Criner"),
				new Person("Joette", "Anderson"),
				new Person("Alfonzo", "Rubinstein"),
				new Person("Justin", "Capshaw"), new Person("Elton", "Schnee"),
				new Person("Sage", "Sherrer"), new Person("Vita", "Neihoff"),
				new Person("Nikia", "Moody"), new Person("Linsey", "Profitt"),
				new Person("Tanesha", "Hodžiæ"),
				new Person("Billye", "Widman"),
				new Person("Kareem", "Whalley"), };

		System.out
				.println("Nesortiran phonebook: \n_____________________________");
		printPhonebook(phonebook);

		Comparator fncc = new FirstNameComparatorClass();
		sortWithComparator(phonebook, fncc);
		System.out
				.println("PhoneBook sortiran po imenima:\n______________________________");
		printPhonebook(phonebook);

		Comparator lncc = new LastNameComparatorClass();
		sortWithComparator(phonebook, lncc);
		System.out
				.println("PhoneBook sortiran po prezimenima:\n______________________________");
		printPhonebook(phonebook);
	}
	/**
	 * Method for sorting array of objects of type Person
	 * @param array array of  type Person
	 * @param c object of type Comparator
	 */
	public static void sortWithComparator(Person[] array, Comparator c) {
		Person key;
		int i, j;
		for (j = 1; j < array.length; j++) {
			key = array[j];
			for (i = j - 1; i >= 0 && c.compare(array[i], key) > 0; i--) {
				array[i + 1] = array[i];
			}
			array[i + 1] = key;
		}
	}

	/**
	 * method for printing array of objects of type Person
	 * @param phonebook array of objects of  type Person
	 */
	private static void printPhonebook(Person[] phonebook) {
		for (Person person : phonebook) {
			System.out.println(person);

		}
		System.out.println("\n\n");
	}
}