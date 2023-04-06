package com.jad.dp_chainofresponsibility;

import com.jad.dp_chainofresponsibility.product.Product;

public class Main {

    public static void main(String[] args) {
        Product ttt = new Product("Morpion en manuel",
                    "StickTopToBottom(StickLeftToRight(CrossSquare, WhiteSquare, CircleSquare)," +
                            "StickLeftToRight(WhiteSquare, CrossSquare, CircleSquare)," +
                            "StickLeftToRight(WhiteSquare, BlackSquare, CrossSquare))");
        ttt.draw();
    }
}
