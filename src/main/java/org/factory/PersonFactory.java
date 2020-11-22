package org.factory;
import org.beings.AsianPerson;
import org.beings.CanadianPerson;
import org.beings.Person;
import org.beings.SpanishPerson;

public class PersonFactory {
	public Person getPerson(String continent) {
		if (continent == null) {
			return null;
		}
		else if (continent.equals("Asia")) {
			return new AsianPerson();
		}
		else if (continent.equals("North America")) {
			return new CanadianPerson();
		}
		else if (continent.equals("South America")) {
			return new SpanishPerson();
		}
		return null;
	}
}
