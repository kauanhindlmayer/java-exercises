package br.com.catolicasc.exercises;

public class CarFactory {
    private static final CarFactory instance = new CarFactory();

    private CarFactory() {};

    public static CarFactory getInstance() {
        return instance;
    }
}
