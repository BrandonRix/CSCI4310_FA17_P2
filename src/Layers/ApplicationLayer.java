package Layers;

import Enums.LayerType;
import Common.PacketData;
public class ApplicationLayer extends Layer {
	public ApplicationLayer() {
		super(LayerType.L5);
	}
	
	public static PacketData encapsulate(PacketData packetData) {
		return packetData != null ? new PacketData(packetData) : null;
	}
}
