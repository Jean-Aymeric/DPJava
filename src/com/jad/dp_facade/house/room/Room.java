package com.jad.dp_facade.house.room;

import com.jad.dp_facade.house.heating.Heating;
import com.jad.dp_facade.house.heating.HeatingType;
import com.jad.dp_facade.house.hifi.Hifi;
import com.jad.dp_facade.house.homecinema.HomeCinema;
import com.jad.dp_facade.house.light.Light;

public class Room {
    private final String name;
    private final Light light = new Light();
    private final Heating heating;
    private Hifi hifi = null;
    private HomeCinema homeCinema = null;

    public Room(final String name, final HeatingType heatingType) {
        this.name = name;
        this.heating = new Heating(name, heatingType);
    }

    public String getName() {
        return this.name;
    }

    public Light getLight() {
        return this.light;
    }

    public Heating getHeating() {
        return this.heating;
    }

    public Hifi getHifi() {
        return hifi;
    }

    public void setHifi(final Hifi hifi) {
        this.hifi = hifi;
    }

    public HomeCinema getHomeCinema() {
        return homeCinema;
    }

    public void setHomeCinema(final HomeCinema homeCinema) {
        this.homeCinema = homeCinema;
    }
}
