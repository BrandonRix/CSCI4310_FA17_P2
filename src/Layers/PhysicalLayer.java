package Layers;

import Enums.LayerType;

public class PhysicalLayer extends Layer {
	public PhysicalLayer() {
		super(LayerType.L1);
	}
	
	public static PacketData decapsulate(PacketData packetData) {
		return packetData != null ? new PacketData(packetData) : null;
	}
}
