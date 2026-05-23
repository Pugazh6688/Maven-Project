package com.testNGrunner;

import Com.baseclass.BaseClass;
import org.testng.annotations.Test;

public class CrossBrowserTesting extends BaseClass {
    @Test
    private void chrome(){
        launchBrowse("chrome");
        passingURL("https://www.google.com/");
        System.out.println("Browser ID: " + Thread.currentThread().getId());
    }

    private void edge(){
        launchBrowse("Edge");
        passingURL("https://www.google.com/");
        System.out.println("Browser ID: " + Thread.currentThread().getId());
    }

    private void firefox(){
        launchBrowse("Firefox");
        passingURL("https://www.google.com/");
        System.out.println("Browser ID: " + Thread.currentThread().getId());
    }


}
