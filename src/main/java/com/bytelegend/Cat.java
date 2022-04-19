package com.bytelegend;

public class Cat extends Pet {
    private final int age;
    private final String desc;

    public Cat(String name, int age) {
        super(name);
        this.desc = buildDescription(name, age);
        this.age = age;
    }

    private String buildDescription(String name, int age) {
        return "I am a cat named " + name + " and I am " + age + " years old";
    }

    @Override
    protected void describeMyself() {
        System.out.println(desc);
    }
}
