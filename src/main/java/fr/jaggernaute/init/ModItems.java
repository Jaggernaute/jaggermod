package fr.jaggernaute.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Objects;

public class ModItems {
    public void init(){

    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent e){

    }

    private void registerModel(Item item){
        ModelLoader.setCustomModelResourceLocation(
                item,
                0,
                new ModelResourceLocation(
                        Objects.requireNonNull(
                            item.getRegistryName()
                        ),
                        "inventory"
                )
        );
    }
}
