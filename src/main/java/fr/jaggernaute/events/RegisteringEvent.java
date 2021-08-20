package fr.jaggernaute.events;

import fr.jaggernaute.init.ModItems;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegisteringEvent {
    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> e){
        ModItems.Instance.init();
        e.getRegistry().registerAll(ModItems.Instance.getItems().toArray(new Item[0]));
    }
}
