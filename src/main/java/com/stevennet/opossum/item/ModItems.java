package com.stevennet.opossum.item;

import com.stevennet.opossum.Opossum;
import net.minecraft.advancements.criterion.MobEffectsPredicate;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Opossum.MOD_ID);


    public static final RegistryObject<Item> FUD = ITEMS.register("fud",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(16)
                    .food(new Food.Builder().hunger(6).saturation(6F).meat().fastToEat().build())));

    public static final RegistryObject<Item> GOLDEN_FUD = ITEMS.register("golden_fud",
            () -> new Item(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(16)
                    .food(new Food.Builder().hunger(6).saturation(6F).meat().fastToEat().setAlwaysEdible()
                            .effect(() -> new EffectInstance(Effects.ABSORPTION, 120*20, 2), 1F).build())));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
