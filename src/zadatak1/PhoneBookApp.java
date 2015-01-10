package zadatak1;
public class PhoneBookApp {
 
public static void main(String[] args) {
Person[] phonebook = new Person[] {
new Person("Aja", "Goehring"),
new Person("Arvilla", "Hodžiæ"),
new Person("Lavette", "Viveiros"),
new Person("Mandi", "Arguello"),
new Person("Annett", "Mize"),
new Person("Shantell", "Dike"),
new Person("Daphine", "Dillman"),
new Person("Louella", "Hodžiæ"),
new Person("Amalia", "Brigman"),
new Person("Alphonse", "Varley"),
new Person("Phil", "Ewen"),
new Person("Olimpia", "Saenz"),
new Person("Erminia", "Mirando"),
new Person("Edythe", "Castenada"),
new Person("Robbi", "Maese"),
new Person("Kelley", "Printz"),
new Person("Dannie", "Ocasio"),
new Person("Charles", "Hodžiæ"),
new Person("Rubie", "Washer"),
new Person("Bryant", "Masker"),
new Person("Julius", "Stalzer"),
new Person("Clement", "Prager"),
new Person("Kathie", "Oquin"),
new Person("Shakira", "Hernandes"),
new Person("Armand", "Boler"),
new Person("Foster", "Tims"),
new Person("Hana", "Howson"),
new Person("Arletta", "Nastasi"),
new Person("Rebeca", "Mcnally"),
new Person("Hsiu", "Rosemond"),
new Person("Tyson", "Hodžiæ"),
new Person("Celina", "Gallego"),
new Person("Criselda", "Herrell"),
new Person("Kendall", "Bascombe"),
new Person("Nubia", "Deeter"),
new Person("Joannie", "Deshields"),
new Person("Sarai", "Criner"),
new Person("Joette", "Anderson"),
new Person("Alfonzo", "Rubinstein"),
new Person("Justin", "Capshaw"),
new Person("Elton", "Schnee"),
new Person("Sage", "Sherrer"),
new Person("Vita", "Neihoff"),
new Person("Nikia", "Moody"),
new Person("Linsey", "Profitt"),
new Person("Tanesha", "Hodžiæ"),
new Person("Billye", "Widman"),
new Person("Kareem", "Whalley"),
};
 
System.out.println("Nesortiran phonebook: \n_____________________________");
printPhonebook(phonebook);
System.out.println("PhoneBook sortiran po imenima:\n______________________________");
sortByFirstName(phonebook);
printPhonebook(phonebook);
System.out.println();
 
System.out.println("Phonebook sortiran po prezimenima: \n__________________________");
sortByLastName(phonebook);
printPhonebook(phonebook);
}
 
/**
 * method that sorts array of objects of  type Person using value of it's firstName variable
 * @param array array of objects of  type Person
 */
private static void sortByFirstName(Person[] array) {
	Person key;
	int i,j;
	for( j=1;j<array.length;j++){
		key=array[j];
		for(
				i=j-1;i>=0 && array[i].getFirstName().compareTo(key.getFirstName())>0;i--){
			array[i+1]=array[i];
		}
		array[i+1]=key;
	}
}
 
/**
 * method that sorts array of objects of  type Person using value of it's lastName variable
 * @param array array of objects of  type Person
 */
private static void sortByLastName(Person[] array) {
	Person key;
	int i,j;
	for( j=1;j<array.length;j++){
		key=array[j];
		for(
				i=j-1;i>=0 && array[i].getLastName().compareTo(key.getLastName())>0;i--){
			array[i+1]=array[i];
		}
		array[i+1]=key;
	}
}
 
/**
 * method for printing array of objects of type Person
 * @param phonebook array of objects of  type Person
 */
private static void printPhonebook(Person[] phonebook) {
for (Person person : phonebook) {
//System.out.println(person.getFirstName()+","+person.getLastName());
	System.out.println(person);

}
System.out.println("\n\n");
}
} 