package net.knsh.chroma.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.knsh.chroma.Chroma;
import net.knsh.chroma.registry.items.Alcohol;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ChromaItems {
    public static final Item ALCOHOLIC_DRINK = new Alcohol(new FabricItemSettings().group(ChromaTab.CHROMA_GROUP));

    public static void register() {
        register("alcoholic_drink", ALCOHOLIC_DRINK);
    }

    private static void register(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier(Chroma.MOD_ID, name), item).;
    }
}
