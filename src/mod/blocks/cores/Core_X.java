package mod.blocks.cores;

import arc.*;
import arc.graphics.*;
import arc.struct.*;
import arc.util.*;

import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;

import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.entities.units.*;

import mindustry.graphics.*;
import mindustry.type.*;

import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;

// import static mindustry.Vars.*;
import static mindustry.type.ItemStack.*;

import mindustry.game.Team;

import mindustry.world.blocks.storage.*;


public class Core_X extends CoreBlock {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public Core_X() {
		
		super("core-x");
		
		localizedName = "Core X (Core Stuff)";
		
		ItemStack[] zeroItems = new ItemStack[0];
		
		ItemStack[] zero = {};
		
		requirements( Category.effect, zeroItems );
		
		size = 5;
		
		unitType = UnitTypes.gamma;
		health = 6000;
		itemCapacity = 15000;
		thrusterLength = 40/4f;
		unitCapModifier = 24;
		researchCostMultiplier = 0.11f;
		
	} //Constructor
	
	
	@Override
	public boolean canPlaceOn(	Tile tile ,
								Team team ,
								int rotation ) {
		
		return true;
	} //canPlaceOn()
	
	
	
	@Override
	public boolean canBreak( Tile tile ) {
		return true;
	} //canBreak()
	
	
} //class
