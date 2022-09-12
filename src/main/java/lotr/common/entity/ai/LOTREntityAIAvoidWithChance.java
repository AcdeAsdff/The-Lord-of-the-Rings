package lotr.common.entity.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAvoidEntity;

public class LOTREntityAIAvoidWithChance extends EntityAIAvoidEntity {
	public EntityCreature theEntity;
	public float chance;
	public String soundEffect;

	public LOTREntityAIAvoidWithChance(EntityCreature entity, Class avoidClass, float f, double d, double d1, float c) {
		this(entity, avoidClass, f, d, d1, c, null);
	}

	public LOTREntityAIAvoidWithChance(EntityCreature entity, Class avoidClass, float f, double d, double d1, float c, String s) {
		super(entity, avoidClass, f, d, d1);
		theEntity = entity;
		chance = c;
		soundEffect = s;
	}

	@Override
	public boolean shouldExecute() {
		return theEntity.getRNG().nextFloat() < chance && super.shouldExecute();
	}

	@Override
	public void startExecuting() {
		super.startExecuting();
		if (soundEffect != null) {
			theEntity.playSound(soundEffect, 0.5f, (theEntity.getRNG().nextFloat() - theEntity.getRNG().nextFloat()) * 0.2f + 1.0f);
		}
	}
}
