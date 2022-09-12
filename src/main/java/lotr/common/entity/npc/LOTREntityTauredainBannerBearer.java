package lotr.common.entity.npc;

import lotr.common.item.LOTRItemBanner;
import net.minecraft.world.World;

public class LOTREntityTauredainBannerBearer extends LOTREntityTauredainWarrior implements LOTRBannerBearer {
	public LOTREntityTauredainBannerBearer(World world) {
		super(world);
	}

	@Override
	public LOTRItemBanner.BannerType getBannerType() {
		return LOTRItemBanner.BannerType.TAUREDAIN;
	}
}
