package com.learnjava.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ConsoleNumberGuess  {

    // == const ==
    public static final Logger LOGGER = LoggerFactory.getLogger(ConsoleNumberGuess.class);


    @EventListener(ContextRefreshedEvent.class)
    public void start() {
        LOGGER.info(" start() --> Container ready for use.");
    }
}
//
//@Component
//public class ConsoleNumberGuess implements ApplicationListener<ContextRefreshedEvent>{
//
//    // == const ==
//    public static final Logger LOGGER = LoggerFactory.getLogger(ConsoleNumberGuess.class);
//
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        LOGGER.info("Container ready for use.");
//
//    }
//}