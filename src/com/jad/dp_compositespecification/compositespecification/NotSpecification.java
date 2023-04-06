package com.jad.dp_compositespecification.compositespecification;

public class NotSpecification<E> extends UnarySpecification<E> {

    public NotSpecification(Specification<E> specification) {
        super(specification);
    }

    public boolean isSatisfiedBy(E e) {
        return ! getSpecification().isSatisfiedBy(e);
    }

}