package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

public class NonEmptyStringTest extends AndroidTestCase {

    private static final String LOG_TAG = "test";

    @SuppressWarnings("unchecked")
    public void test() {

        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(getContext(), null);
        endpointsAsyncTask.execute();

        try {
            result = endpointsAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }

}
