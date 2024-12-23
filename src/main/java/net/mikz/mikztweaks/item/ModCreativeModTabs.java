package net.mikz.mikztweaks.item;

import net.mikz.mikztweaks.Mikz_Mod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Mikz_Mod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MIKZ_TAB = CREATIVE_MODE_TABS.register("mikz_tweaks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HEADLAMP.get()))
                    .title(Component.translatable("creativetab.mikz_tweaks_tab"))
                    .displayItems((itemDisplayParameters, output) -> {

                        //Add items to creative tab here:
                        output.accept(ModItems.HEADLAMP.get());
                        output.accept(ModItems.INGR_LAMP.get());
                        output.accept(ModItems.INGR_BUCKLE.get());
                        output.accept(ModItems.INGR_STRAP.get());



































                    })
                    .build());

    public static void register(IEventBus eventBus){
    CREATIVE_MODE_TABS.register(eventBus);
    }
}