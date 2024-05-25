package name.silver.item;

import name.silver.Silver;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SILVER_INGOT = registerItem("silver_ingot",new Item(new FabricItemSettings()));
    private static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier(Silver.MOD_ID,name),item);
    }
    public static void registerModItems(){
    }
}
