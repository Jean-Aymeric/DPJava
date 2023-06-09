package com.jad.dp_observer.observer.cat;

import com.jad.dp_observer.observer.AnimalThread;
import com.jad.dp_observer.observer.House;
import com.jad.dp_observer.observer.Observable;
import com.jad.dp_observer.observer.Observer;
import com.jad.dp_observer.observer.mouse.Mouse;


public class Cat extends AnimalThread {
    private final static int WaitingTime = 5000;
    private CatState state;
    private final House house;
    private Observable observable = new Observable();

    public Cat(House house) {
        super(Cat.WaitingTime);
        this.house = house;
        this.state = CatState.Asleep;
    }
    @Override
    public String toString() {
        return this.state.getLook();
    }

    @Override
    protected void runExtended() {
        this.setState(CatState.GetRandomState());
        if (this.isAwake()) {
            for (Mouse mouse : this.house.getMice()) {
                if (! mouse.isHidden()) {
                    mouse.die();
                }
            }
        }
    }

    public boolean isAwake() {
        return this.state == CatState.Awake;
    }

    public void addObserver(Observer observer) {
        this.observable.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observable.remove(observer);
    }

    public void setState(final CatState state) {
        if (state != this.state) {
            this.state = state;
            this.observable.notifyObservers();
        }
    }
}
