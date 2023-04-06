package com.jad.dp_adapter.composite;

public interface ICompositeProduct extends IProduct {
    void addProduct(IProduct product);

    void removeProduct(IProduct product);
}
