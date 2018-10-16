package com.example.androiddev.workout;

/**
 * Created by androiddev on 2018-10-16.
 */

public class Workout {
    private String name;
    private String description;

    public static final Workout [] workouts = {
            new Workout("The Limb Loosener", "5 Handstands and whatnot"),
            new Workout("Core Agony", "100 Push-ups"),
            new Workout("The Wimp Special","5 Pull-ups")
    };

    public Workout(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return this.name;
    }
}
