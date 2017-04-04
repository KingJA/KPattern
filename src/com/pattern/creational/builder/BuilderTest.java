package com.pattern.creational.builder;

/**
 * [Des]      :     TODO
 * [Author]   :     KingJA
 * [Date]     :     2017/4/3
 * [email]    :     kingjavip@gmail.com
 */
public class BuilderTest {
    public static void main(String[] args) {
        Person.Builder builder = new Person.Builder();
        Person jack = builder.setName("jack")
                .setAge(18)
                .build();
        System.out.println(jack.getName());
    }
}
