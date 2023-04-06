package com.jad.dp_iterator.composite;

public interface IProduct extends Iterable<IProduct> {
    String getName();

    @Override
    String toString();
    ProductsIterable getProductsIterable();
}
