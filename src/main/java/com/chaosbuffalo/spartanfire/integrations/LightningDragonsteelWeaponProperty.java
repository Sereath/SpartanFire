package com.chaosbuffalo.spartanfire.integrations;

import com.github.alexthe666.iceandfire.IceAndFire;
import com.github.alexthe666.iceandfire.entity.EntityDragonLightningBolt;
import com.github.alexthe666.iceandfire.util.IsImmune;
import com.oblivioussp.spartanweaponry.api.ToolMaterialEx;
import com.oblivioussp.spartanweaponry.api.weaponproperty.WeaponPropertyWithCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class LightningDragonsteelWeaponProperty extends WeaponPropertyWithCallback {
    public LightningDragonsteelWeaponProperty(String propType, String propModId) {
        super(propType, propModId);
    }

    @Override
    public void onHitEntity(ToolMaterialEx material, ItemStack stack, EntityLivingBase target, EntityLivingBase attacker, Entity projectile) {
        target.world.spawnEntity(new EntityDragonLightningBolt(target.world, target.posX, target.posY, target.posZ, attacker, target));
        target.knockBack(target, 1F, attacker.posX - target.posX, attacker.posZ - target.posZ);
    }


}
