package com.learnjava.console;

import com.learnjava.config.AppConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        LOGGER.info("...number game");

        // create context (container)
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);
//
//        // call method next() to get a random number
//        int number = numberGenerator.next();
//
//        // log generated number
//        LOGGER.info("number = {}", number);
//
//        // get msg generator bean from context (container)
//        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
//
//        LOGGER.info("getMainMessage = {}",messageGenerator.getMainMessage());
//        LOGGER.info("getResultMessage = {}",messageGenerator.getResultMessage());

        // close context
        context.close();

    }
}
