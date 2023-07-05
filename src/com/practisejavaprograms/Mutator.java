package com.practisejavaprograms;
// setter method
public class Mutator {
	private int roll;
    private String name;
    
    public int getRoll() {
        return this.roll;
    }
    
    public void setRoll(final int roll) {
        this.roll = roll;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public void display() {
        System.out.println("Roll no.: " + this.roll);
        System.out.println("Student name: " + this.name);
    }

}
