package sakthi;

	import java.util.Arrays;
	import java.util.Comparator;
	import java.util.List;

	class Person {
	    private String name;
	    private int age;

	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public String toString() {
	        return "Person{name='" + name + "', age=" + age + '}';
	    }
	}

	public class Personsort {

	    public static void main(String[] args) {
	        
	        List<Person> personList = Arrays.asList(
	                new Person("Tony Stark", 30),
	                new Person("Steve Rogers", 28),
	                new Person("Natasha", 25),
	                new Person("Peter Parker", 21)
	        );

	        personList.sort(Comparator.comparingInt(Person::getAge));
	        System.out.println("Original List: " + Arrays.toString(personList.toArray()));
	    }
	}


