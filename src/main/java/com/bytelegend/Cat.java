package com.bytelegend;

public class Cat extends Pet {
    private final int age;

    public Cat(String name, int age) {
        super(name);
        verifyAge(age);
        this.age = age;
    }

    private void verifyAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    @Override
    protected String describeMyself() {
        return "I am a cat named " + getName() + " and I am " + age + " years old";
    }
}
