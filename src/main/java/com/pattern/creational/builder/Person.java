package com.pattern.creational.builder;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/4/3
 * [email]    :     kingjavip@gmail.com
 */
public class Person {
    private int age;
    private String name;

    private int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
    }

     static class Builder {
        private int age;
        private String name;

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Person build() {
            return new Person(this);

        }
    }
}


