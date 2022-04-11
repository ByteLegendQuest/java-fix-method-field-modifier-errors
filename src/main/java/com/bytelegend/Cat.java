package com.bytelegend;

public class Cat extends Pet {
    private final int age;

    public Cat(String name, int age) {
        super(name);
        verifyAge();
        this.age = age;
    }

    private void verifyAge() {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    @Override
    private String describeMyself() {
        return "I am a cat named " + name + " and I am " + age + " years old";
    }
}
