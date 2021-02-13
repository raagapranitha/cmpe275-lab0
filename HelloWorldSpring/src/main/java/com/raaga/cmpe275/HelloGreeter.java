package com.raaga.cmpe275;

public class HelloGreeter implements Greeter{
	public String name;
	public void setName(String name) {
		this.name=name;
	}
	public String getGreeting() {
		return "Hello World from "+this.name;
	}

}
