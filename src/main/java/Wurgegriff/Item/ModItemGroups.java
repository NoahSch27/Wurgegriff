package Wurgegriff.Item;

import Wurgegriff.MinecraftMod;
import Wurgegriff.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SPELLCRAFT = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MinecraftMod.MOD_ID, "spellcraft"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemGroup.wurgegriff.spellcraft_items"))

                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET_RAW);
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.MAGIC_WAND);

                        entries.add(ModBlocks.PINK_GARNET_RAW_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.PINK_GARNET_ORE_STONE);
                        entries.add(ModBlocks.PINK_GARNET_ORE_DEEPSLATE);
                    })
                    .build());

    public static void registerItemGroups(){
        MinecraftMod.LOGGER.info("Registering Item Groups for " + MinecraftMod.MOD_ID);
    }
}
