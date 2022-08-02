package net.zeroxlevel.modzero;

import net.fabricmc.api.ModInitializer;
import net.zeroxlevel.modzero.block.ModBlocks;
import net.zeroxlevel.modzero.item.ModItems;
import net.zeroxlevel.modzero.painting.ModPaintings;
import net.zeroxlevel.modzero.villager.ModVillagers;
import net.zeroxlevel.modzero.world.feature.ModConfiguredFeatures;
import net.zeroxlevel.modzero.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModZero implements ModInitializer {
	public static final String MOD_ID = "modzero";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModVillagers.registerVillager();
		ModVillagers.registerTrades();

		ModPaintings.registerPaintings();
		ModOreGeneration.generateOres();
	}
}
