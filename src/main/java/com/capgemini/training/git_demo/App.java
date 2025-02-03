package com.capgemini.training.git_demo;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Logger log = Logger.getLogger(App.class.getName());
        log.info("Create Logger object and printing");
        log.info("writet the log to logfile" );
        log.info("Creted a new Branch called test");
    }
}
