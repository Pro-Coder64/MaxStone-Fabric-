package maxboi.max.stone;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MaxStone implements ModInitializer {
	
	public static final Item MAXSTONE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
	
	@Override
	public void onInitialize() {
		
		Registry.register(Registry.ITEM, new Identifier("maxstone", "maxstone"));

	}
}
