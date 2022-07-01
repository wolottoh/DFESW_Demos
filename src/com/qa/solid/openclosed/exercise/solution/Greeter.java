package com.qa.solid.openclosed.exercise.solution;

public class Greeter {
	
    private Greeting greeting;

    public Greeter(Greeting greeting) {
        this.greeting = greeting;
    }

    public String greet() {
        return this.greeting.greet();
    }

    public Greeting getGreeting() {
        return greeting;
    }

    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }
    
}