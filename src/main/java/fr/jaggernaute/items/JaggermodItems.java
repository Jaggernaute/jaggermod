package fr.jaggernaute.items;

import fr.jaggernaute.init.ModItems;
import net.minecraft.item.Item;

public class JaggermodItems extends Item {
    public JaggermodItems(String name) {
        setRegistryName(name);
        ModItems.Instance.getItems().add(this);
    }
}
