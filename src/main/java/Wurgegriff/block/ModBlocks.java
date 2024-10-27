package Wurgegriff.block;

import Wurgegriff.MinecraftMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block PINK_GARNET_BLOCK = registerBlock("pink_garnet_block", new Block(AbstractBlock.Settings.create()
            .strength(0.5f) // Härte so einstellen, dass die Abbauzeit 1,5 Sekunden beträgt
            .requiresTool()
            .sounds(BlockSoundGroup.AMETHYST_BLOCK)
    ));
    public static final Block PINK_GARNET_RAW_BLOCK = registerBlock("pink_garnet_raw_block", new Block(AbstractBlock.Settings.create()
            .strength(0.5f) // Härte so einstellen, dass die Abbauzeit 1,5 Sekunden beträgt
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
    ));
    public static final Block PINK_GARNET_ORE_STONE = registerBlock("pink_garnet_ore_stone", new Block(AbstractBlock.Settings.create()
            .strength(0.5f) // Härte so einstellen, dass die Abbauzeit 1,5 Sekunden beträgt
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
    ));
    public static final Block PINK_GARNET_ORE_DEEPSLATE = registerBlock("pink_garnet_ore_deepslate", new Block(AbstractBlock.Settings.create()
            .strength(0.7f) // Härte so einstellen, dass die Abbauzeit 1,5 Sekunden beträgt
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
    ));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(MinecraftMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(MinecraftMod.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        MinecraftMod.LOGGER.info("Registering ModBlocks for " + MinecraftMod.MOD_ID);

    }
}
