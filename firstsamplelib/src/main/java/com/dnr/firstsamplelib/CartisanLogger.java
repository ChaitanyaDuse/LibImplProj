/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dnr.firstsamplelib;

import android.util.Log;


public class CartisanLogger {

    public static boolean loggerSwitch = true;

    private static String LOGGER_TAG = "CARTISAN";

    public CartisanLogger() {
    }

    /**
     * @param status
     */
    public static void setSwitch(boolean status) {
        loggerSwitch = status;
    }

    /**
     * @param msg Log as a Debug
     */
    public static void msg(String msg) {
        if (loggerSwitch) {
            Log.d(LOGGER_TAG, msg);
        }
    }

    /**
     * @param error Log as a Error
     */
    public static void error(String error) {
        if (loggerSwitch) {
            Log.e(LOGGER_TAG, error);
        }
    }

}
