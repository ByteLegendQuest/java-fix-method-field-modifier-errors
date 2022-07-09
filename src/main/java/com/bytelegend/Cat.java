package com.bytelegend;

public class Cat extends Pet {
    private final int age;
    private final String desc;

    public Cat(String name, int age) {
        super(name);
        this.desc = buildDescription();
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    protected String buildDescription() {
        return "I am a cat named " + getName() + " and I am " + getAge() + " years old";
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public void describeMyself() {
        System.out.println(getDesc());
    }
}
