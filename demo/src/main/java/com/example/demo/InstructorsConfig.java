package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class InstructorsConfig {
    
    @Bean
    public Instructors tcUsaInstructors(){
        Instructors tcUsa = new Instructors();
        tcUsa.add(new Instructor("null", 0));
        tcUsa.add(new Instructor("Bolgo", 2));
        tcUsa.add(new Instructor("Hot and Sour Soup", 3));
        return tcUsa;
    }

    @Bean
    public Instructors tcUkInstructors(){
        Instructors tcUk = new Instructors();
        tcUk.add(new Instructor("Eustice", 0));
        tcUk.add(new Instructor("Mary", 2));
        tcUk.add(new Instructor("Killregard Cashmillions", 3));
        return tcUk;
    }

    @Bean
    @Primary
    public Instructors instructors(){
        Instructors tcZcw = new Instructors();
        tcZcw.add(new Instructor("Kris", 0));
        tcZcw.add(new Instructor("Dan", 0));
        tcZcw.add(new Instructor("Dolio", 2));
        tcZcw.add(new Instructor("Razz", 3));
        return tcZcw;
    }
}
