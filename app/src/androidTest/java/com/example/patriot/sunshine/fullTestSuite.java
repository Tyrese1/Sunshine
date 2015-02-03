package com.example.patriot.sunshine;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.Test;

/**
 * Created by Patriot on 1/30/2015.
 */
public class fullTestSuite  {

    public static Test suite()  {
        return new TestSuiteBuilder(fullTestSuite.class)
                .includeAllPackagesUnderHere().build();


    }


    public fullTestSuite()  {

        super();

    }

}




