package net.apixelmelon.firstmod.datagen;

import net.apixelmelon.firstmod.FirstMod;
import net.apixelmelon.firstmod.block.ModBlocks;
import net.apixelmelon.firstmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                               CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, FirstMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.SAPPHIRE_HELMET.get(),
                        ModItems.SAPPHIRE_CHESTPLATE.get(),
                        ModItems.SAPPHIRE_LEGGINGS.get(),
                        ModItems.SAPPHIRE_BOOTS.get());

        this.tag(ItemTags.MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL_MUSIC_DISC.get());
        // Adds this Mod Item as a music disc

        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.BAR_BRAWL_MUSIC_DISC.get());
        // Allows the disc to be dropped by creepers

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.PINE_LOG.get().asItem())
                .add(ModBlocks.PINE_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_PINE_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_PINE_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.PINE_PLANKS.get().asItem());
    }
}
