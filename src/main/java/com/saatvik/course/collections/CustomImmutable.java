package com.saatvik.course.collections;

import lombok.Getter;

@Getter
final public class CustomImmutable {

    private final String name;

    public CustomImmutable(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return STR."CustomImmutable{name='\{name}'}";
    }
}
