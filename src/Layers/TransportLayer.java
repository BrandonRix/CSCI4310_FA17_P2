package Layers;

import Enums.LayerType;
import Common.PacketData;

import java.util.ArrayList;

public class TransportLayer extends Layer {
	private ArrayList<Integer> portsInUse;
	
	public boolean portIsTaken(int port) {
		for(int i = 0; i < portsInUse.size(); i++)
		{
			if(portsInUse.get(i) == port){
				return true;
			}
		}
		return false;
	}

	public TransportLayer() {
		super(LayerType.L4);
		setPortsInUse(new ArrayList<>());
	}
	/**
	* Gets and returns the ports that are in use.
	*/
	public ArrayList<Integer> getPortsInUse() {
		return portsInUse;
	}

	public void setPortsInUse(ArrayList<Integer> portsInUse) {
		this.portsInUse = portsInUse;
	}

	public static PacketData encapsulate(PacketData packetData) {
		return packetData != null ? new PacketData(packetData) : null;
	}
	
	public static PacketData decapsulate(PacketData packetData) {
		return packetData != null ? new PacketData(packetData) : null;
	}
}
