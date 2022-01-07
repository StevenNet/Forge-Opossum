package com.stevennet.opossum.init;

import com.stevennet.opossum.Opossum;
import com.stevennet.opossum.entities.OpossumEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MobEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, Opossum.MOD_ID);
    // entity types
    public static final RegistryObject<EntityType<OpossumEntity>> OPOSSUM = ENTITY_TYPES.register("opossum",
            () -> EntityType.Builder.create(OpossumEntity::new, EntityClassification.CREATURE )
                    .size(0.6f, 0.4f)
                    .build(new ResourceLocation(Opossum.MOD_ID, "opossum").toString()));

}
