package fr.jaggernaute.init;

import fr.jaggernaute.utils.References;
import com.google.common.collect.Lists;
import fr.jaggernaute.items.JaggermodItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.List;
import java.util.Objects;

@Mod.EventBusSubscriber(modid = References.MOD_ID)
public class ModItems {

    public static final ModItems Instance =new ModItems();
    public static Item sigmou;
    private List<Item> items;

    public void init(){
        items =  Lists.newArrayList();
        sigmou = new JaggermodItems("sigmou");
    }

    @SubscribeEvent
    public void registerModels(ModelRegistryEvent e){
        for(Item item : items){
	        registerModel(item);
        }
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

    public List<Item> getItems() {
        return items;
    }
}
