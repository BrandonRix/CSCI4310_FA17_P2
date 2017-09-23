package Layers;

import Common.PacketData;
import Enums.LayerType;

public class LinkLayer extends Layer {
	private int address;
	public LinkLayer(int address) {
		super(LayerType.L2);
		this.setAddress(address);
	}
	
	public int getAddress() {
		return address;
	}
	public void setAddress(int address) {
		this.address = address;
	}
	
	public static PacketData encapsulate(PacketData packetData) {
		return packetData != null ? new PacketData(packetData) : null;
	}
	public static PacketData decapsulate(PacketData packetData) {
		return packetData != null ? new PacketData(packetData) : null;
	}
	
	
}
