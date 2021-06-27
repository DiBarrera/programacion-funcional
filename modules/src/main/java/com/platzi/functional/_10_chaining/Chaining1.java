package com.platzi.functional._10_chaining;

public class Chaining1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hola")
                .append("Mundo")
                .append("esto esta")
                .append("encadenado");

        Chainer chainer = new Chainer();

        Chainer chainer1 = chainer.sayHi();
        Chainer chainer2 = chainer.sayBye();
        chainer.sayHi().sayBye();
    }

    static class Chainer {
        public Chainer sayHi() {
            System.out.println("Hola");
            return this;
        }

        public Chainer sayBye() {
            System.out.println("Bye");
            return this;
        }
    }
}
