package com.pattern.factorymethod;

import com.pattern.factorymethod.method.HpCreator;
import com.pattern.factorymethod.method.Item;
import com.pattern.factorymethod.method.ItemCreator;
import com.pattern.factorymethod.method.MpCreator;

/**
 *
 * */
public class Main {

    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        item =creator.create();
        item.use();

    }
}
