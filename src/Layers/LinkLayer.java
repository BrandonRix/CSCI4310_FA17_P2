package Layers;

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
	
	
}
