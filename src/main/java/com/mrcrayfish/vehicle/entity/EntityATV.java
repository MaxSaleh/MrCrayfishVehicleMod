package com.mrcrayfish.vehicle.entity;

import com.mrcrayfish.vehicle.init.ModSounds;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.MoverType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Author: MrCrayfish
 */
public class EntityATV extends EntityVehicle
{
    //TODO make it so vehicle base can set properties
    public EntityATV(World worldIn)
    {
        super(worldIn);
        this.setMaxSpeed(15);
        this.setSize(1.5F, 1.5F);
    }
}
