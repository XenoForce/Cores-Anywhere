package mod;

import java.util.*;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.type.ammo.*;
import mindustry.type.unit.*;

import mod.blocks.cores.*;


public class CoreStuffMod extends Mod {
	
	//---------------------------------------------------------------//
	//  Constructor                                                  //
	//---------------------------------------------------------------//
	public CoreStuffMod() {
		
		Log.info("Loaded Core-Stuff (CoreStuffMod class) constructor.");
		
		//listen for game load event
		Events.on( ClientLoadEvent.class, e -> {
			
			//Show dialog upon startup:
			Time.runTask(10f, () -> {
				// BaseDialog dialog = new BaseDialog("abc");
				// Note: Mod sprites are prefixed with the mod name.
			});
		});
	} //constructor
	
	
	//---------------------------------------------------------------//
	//  loadContent()                                                //
	//---------------------------------------------------------------//
	@Override
	public void loadContent() {
		
		Log.info("Loading content - (Core-Stuff mod).");
		
		List<UnlockableContent> arrContent = new ArrayList<>();
		
		// "Advance Content" Units:
		
		// arrContent.add( X_Unit_Types.war_x );
		
		
		// Unit Factory:
		
		// arrContent.add( new Unit_Factory_X() );
		
		
		// "Diamond Ore Mod" Units:
		
		// arrContent.add( X_Unit_Types.spriite_x );
		// arrContent.add( X_Unit_Types.gnome_x   );
		// arrContent.add( X_Unit_Types.pixie_x   );
		// arrContent.add( X_Unit_Types.nymph_x   );
		// arrContent.add( X_Unit_Types.goblin_x  );
		
		
		
		// New Core:
		
		arrContent.add( new Core_X() );
		
		
		// - - - - - - - - - - - - - - - - - - - - - -
		
		for (UnlockableContent uc : arrContent) {
			uc.alwaysUnlocked = true;
			uc.load();
			// uc.unlock();
		} //for
		
	} //loadContent()
	
	
} //class
