package com.Dark2932.teputils.items;

import com.Dark2932.teputils.Main;
import com.Dark2932.teputils.init.ModItems;
import com.Dark2932.teputils.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setRegistryName(name);
        setTranslationKey("teputils." + name);
        setCreativeTab(CreativeTabs.MISC);
        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
