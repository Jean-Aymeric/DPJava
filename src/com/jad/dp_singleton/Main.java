package com.jad.dp_singleton;

public class Main {
    public static void main(String[] args) {
        Client clientA = new Client();
        Client clientB = new Client();
        clientA.work();
        clientB.work();
    }
}
