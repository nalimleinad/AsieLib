package pl.asie.lib.block;

import net.minecraft.tileentity.TileEntity;

public class TileEntityBase extends TileEntity {
	public void onWorldUnload() {
		
	}
	
	public void onBlockDestroy() {
		
	}
	
	public void onRedstoneSignal(int signal) {
		
	}
	
	private int oldRedstoneSignal = -1;
	
	protected void onRedstoneSignal_internal(int redstoneSignal) {
		if(redstoneSignal == oldRedstoneSignal) return;
		oldRedstoneSignal = redstoneSignal;
		this.onRedstoneSignal(redstoneSignal);
	}

	public int requestCurrentRedstoneValue(int side) {
		return 0;
	}
}
