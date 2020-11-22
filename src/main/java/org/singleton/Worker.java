package org.singleton;
import org.beings.Person;

import java.util.HashSet;
import java.util.Set;

public class Worker {
	private static final Worker instance = new Worker();

	private Worker(){}

	public static Worker getInstance() {
		return instance;
	}

	public static void sayHelloFromAnybody(Person person) {
		person.sayHello();
	}

	public static void whatAmIFromAnybody(Person person) {
		person.whatAmI();
	}

	public String getAnyonesName(Person person) {
		return person.getName();
	}

	public int getAnyonesAge(Person person) {
		return person.getAge();
	}

	public String getAnyonesLocaiton(Person person) {
		return person.getLocation();
	}

	public static int getTotalAge(Person[] personList) {
		int sum = 0;
		for(Person person : personList) {
			sum += person.getAge();
		}
		return sum;
	}

	public static void printAllLocations(Person[] personList) {
		Set<String> set = new HashSet<>();
		for(Person person : personList) {
			set.add(person.getLocation());
		}
		System.out.println(java.util.Arrays.toString(set.toArray()));
	}
}
