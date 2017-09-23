package Layers;

import Common.PacketData;
import Enums.LayerType;

public class NetworkLayer extends Layer {
	private int address;
	private int mask;
	public NetworkLayer(int address, int mask) {
		super(LayerType.L3);
		this.address = address;
		this.mask = mask;
	}
	public int GetMask() {
		return mask;
	}
	public int GetAddress() {
		return address;
	}
	public static PacketData encapsulate(PacketData packetData) {
		return packetData != null ? new PacketData(packetData) : null;
	}
	public static PacketData decapsulate(PacketData packetData) {
		return packetData != null ? new PacketData(packetData) : null;
	}
}
