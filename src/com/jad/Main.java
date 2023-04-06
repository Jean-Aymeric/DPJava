package com.jad;

public class Main {
    public static void main(String[] args) {
        switch (DP.ChainOfResponsibility) {
            case AbstractFactory:
                com.jad.dp_abstractfactory.Main.main(args);
                break;
            case Adapter:
                com.jad.dp_adapter.Main.main(args);
                break;
            case ChainOfResponsibility:
                com.jad.dp_chainofresponsibility.Main.main(args);
                break;
            case Composite:
                com.jad.dp_composite.Main.main(args);
                break;
            case Decorator:
                com.jad.dp_decorator.Main.main(args);
                break;
            case Facade:
                com.jad.dp_facade.Main.main(args);
                break;
            case FactoryMethod:
                com.jad.dp_factorymethod.Main.main(args);
                break;
            case Interpreter:
                com.jad.dp_interpreter.Main.main(args);
                break;
            case Iterator:
                com.jad.dp_iterator.Main.main(args);
                break;
            case Observer:
                com.jad.dp_observer.Main.main(args);
                break;
            case Proxy:
                com.jad.dp_proxy.Main.main(args);
                break;
            case Singleton:
                com.jad.dp_singleton.Main.main(args);
                break;
            case Strategy:
                com.jad.dp_strategy.Main.main(args);
                break;
            case CompositeSpecification:
                com.jad.dp_compositespecification.Main.main(args);
                break;
            default:
                break;
        }
    }
}
