package com.learnjava;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    private static final String CONFIG_LOCATION = "beans.xml";

    public static void main(String[] args) {
        LOGGER.info("...number game");
        // create context (container)
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        // get number generator bean from context (container)
        NumberGenerator numberGenerator = context.getBean("numberGenerator", NumberGenerator.class);

        // call method next() to get a random number
        int number = numberGenerator.next();

        // log generated number
        LOGGER.info("number = {}", number);

        // get number generator bean from context (container)
        Game game = context.getBean(Game.class);

        // or we can use init-method for bean id="game" in xml file
        game.reset();

        // close context
        context.close();

    }
}
