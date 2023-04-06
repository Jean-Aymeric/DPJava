package com.jad.dp_facade.house;

import com.jad.dp_facade.house.room.Room;

import java.util.ArrayList;

public interface IHouse {
    void addRoom(Room room);

    ArrayList<Room> getRooms();

    Room getRoom(String name);

    void removeRoom(Room room);

    void removeRoom(String name);
}
