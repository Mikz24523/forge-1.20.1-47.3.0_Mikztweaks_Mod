package net.mikz.mikztweaks.item;

import net.mikz.mikztweaks.Mikz_Mod;
import net.mikz.mikztweaks.item.custom.ModArmorMaterials;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Mikz_Mod.MOD_ID);

    public static final RegistryObject<Item> HEADLAMP = ITEMS.register("headlamp",
            () -> new ArmorItem(ModArmorMaterials.HEADLAMP, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> INGR_LAMP = ITEMS.register("lamp",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGR_BUCKLE = ITEMS.register("buckle",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INGR_STRAP = ITEMS.register("leatherstrap",
            () -> new Item(new Item.Properties()));






    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
