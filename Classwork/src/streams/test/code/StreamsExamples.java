package streams.test.code;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//parent class is Person, indicates inheritance
public class StreamsExamples extends Person {
	public static void main(String[] args) {

		//List declares a collection like an array, a dynamic array
		List<Person> people= Arrays.asList(
				new Person("Mike","luke",25),
				new Person("Ben","tom",34));
		
		//list has a pre defined function that has an iterator
		//'it' is the name of an iterator, people is the name of the list
		//type of var you used to iterate/go through a collection
		Iterator<Person> it = people.iterator();
		
		while(it.hasNext()) { //if slot is not empty, iterate
			System.out.println(it.next().Fname); 
		} //end while
		
		System.out.println("\n");
		people.stream()
		.filter(p->p.Fname.startsWith("M"))
		.forEach(p->System.out.println(p.Fname));
	};//end main
}
