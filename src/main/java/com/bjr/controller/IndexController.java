package com.bjr.controller;

import com.bjr.exceptions.DataNotFoundException;

/**
 * @author bkings
 * @version 1.0.0
 * @since 2022-04-12 07:47
 */

public class IndexController {

    public String home() {
        return "home";
    }

    public String dashboard() {
        return "dashboard";
    }

    public void handler() {
        throw new DataNotFoundException("Some exception occurrence");
    }
}
