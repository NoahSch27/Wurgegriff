package Wurgegriff.Item;

import Wurgegriff.MinecraftMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MinecraftMod.MOD_ID, name), item);
    }

    public static final Item MAGIC_WAND = registerItem("magic_wand", new Item(new Item.Settings()));

    public static void registerModItems() {
        MinecraftMod.LOGGER.info("Registering Mod Items for " + MinecraftMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(MAGIC_WAND);
        });

    }
}
