package helloServlet;

import helloServlet.Greeting;

public class PoliceGreeting implements Greeting {

	@Override
	public String sayHello() {
		return "Greetings chief inspector!";
	}
}
