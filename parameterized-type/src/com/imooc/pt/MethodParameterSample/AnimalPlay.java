package com.imooc.pt.MethodParameterSample;

import java.util.List;

public class AnimalPlay {
    public void play(List<? extends Animal> list) {
        for (Animal animal : list) {
            animal.play();
        }
    }
}
