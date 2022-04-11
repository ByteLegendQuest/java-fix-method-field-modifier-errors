package com.bytelegend;

public abstract class Pet {
    private final String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected abstract String describeMyself();
}
