package com.jad.dp_observer.observer.mouse;

public enum MouseState {
    Hidden("<:OOO--"), Dancing("<:OOO~~");
    private final String look;

    MouseState(final String look) {
        this.look = look;
    }

    public String getLook() {
        return look;
    }
}
