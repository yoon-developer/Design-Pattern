package com.pattern.templatemethod;

import com.pattern.templatemethod.method.DefaultGameConnectHelper;
import com.pattern.templatemethod.method.GameConnectHelper;
import com.pattern.templatemethod.method.StrengthenedGameConnectHelper;

/**
 *
 * */
public class Main {

    public static void main(String[] args) {
        GameConnectHelper defaultGameConnectHelper = new DefaultGameConnectHelper();
        defaultGameConnectHelper.requestConnection("");

        GameConnectHelper strengthenedGameConnectHelper = new StrengthenedGameConnectHelper();
        strengthenedGameConnectHelper.requestConnection("");
    }
}
