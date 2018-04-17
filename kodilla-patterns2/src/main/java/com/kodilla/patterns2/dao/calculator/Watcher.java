package com.kodilla.patterns2.dao.calculator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Watcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

    public void logEvent() {
        LOGGER.info("Logging the event");
    }
}
