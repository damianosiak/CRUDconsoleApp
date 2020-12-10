package com.damianosiak;

import com.damianosiak.Controller.Controller;
import com.damianosiak.View.View;

/**
 * This is starting place for this application
 *
 * @author Damian Osiak
 * @version 1.0
 */

public class Main {
    /**
     * This variable is responsible for collect all runtime arguments
     */
    public static String[] savedArgs;

    public static void main(String[] args) {
        savedArgs = args;
        /**
         * This called method is responsible for start application
         */
        Controller.startup();
    }
}
