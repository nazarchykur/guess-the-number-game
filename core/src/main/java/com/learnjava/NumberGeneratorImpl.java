package com.learnjava;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
//we need to use ID if in main we specified it for this bean
//@Component("numberGenerator")
public class NumberGeneratorImpl implements NumberGenerator {
    // == fields ==
    private final Random random = new Random();
    private int maxNumber = 100;


    // == public methods ==
    @Override
    public int next() {
        return random.nextInt(maxNumber);
    }

    @Override
    public int getMaxNumber() {
        return maxNumber;
    }
}
