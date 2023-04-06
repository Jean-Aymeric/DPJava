package com.jad.dp_facade;

import com.jad.dp_facade.house.HouseFacade;
import com.jad.dp_facade.house.heating.HeatingType;
import com.jad.dp_facade.house.hifi.Hifi;
import com.jad.dp_facade.house.homecinema.HomeCinema;
import com.jad.dp_facade.house.room.Room;

public class Main {

    public static void main(String[] args) {
        HouseFacade myHouse = new HouseFacade();
        myHouse.addRoom(new Room("Cuisine", HeatingType.ELECTRIC));
        myHouse.addRoom(new Room("Chambre à coucher", HeatingType.ELECTRIC));
        myHouse.addRoom(new Room("Salon", HeatingType.ELECTRIC));
        myHouse.addRoom(new Room("Salle à manger", HeatingType.ELECTRIC));
        myHouse.addRoom(new Room("Salle de bain", HeatingType.ELECTRIC));
        myHouse.addRoom(new Room("Toilettes", HeatingType.ELECTRIC));

        myHouse.getRoom("Salon").setHomeCinema(new HomeCinema("Méga écran géant"));
        myHouse.getRoom("Salon").setHifi(new Hifi("Méga son HiFi"));
        myHouse.getRoom("Cuisine").setHifi(new Hifi("Petite radio FM"));
        myHouse.getRoom("Salle de bain").setHifi(new Hifi("Enceinte bluetooth"));

        myHouse.turnOnAllLights();
    }
}
