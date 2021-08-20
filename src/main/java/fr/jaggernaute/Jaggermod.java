package fr.jaggernaute;

import fr.jaggernaute.events.RegisteringEvent;
import fr.jaggernaute.proxy.CommonProxy;
import fr.jaggernaute.utils.References;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.Mod;


@Mod(
        modid = References.MOD_ID,
        name = References.MOD_NAME,
        version = References.VERSION
)
public class Jaggermod {

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(References.MOD_ID)
    public static Jaggermod instance;

    /**
     * differentiate client side from server side
     */
    @SidedProxy(clientSide = References.ClientProxy, serverSide = References.ServerProxy)
    public static CommonProxy proxy;

    public Jaggermod() {
        MinecraftForge.EVENT_BUS.register(new RegisteringEvent());
    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        proxy.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
        proxy.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){
        proxy.postInit();
    }
}
