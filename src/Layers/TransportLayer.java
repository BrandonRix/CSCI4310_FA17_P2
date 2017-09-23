package Layers;

import Enums.LayerType;

import java.util.ArrayList;

public class TransportLayer extends Layer {
	private ArrayList<Integer> portsInUse;
	public boolean portIsTaken(int port) {
		//-- TODO: check if "port" passed as the parameter is listed in "portsInUse"
		return false;
	}
	public TransportLayer() {
		super(LayerType.L4);
		setPortsInUse(new ArrayList<>());
	}
	public ArrayList<Integer> getPortsInUse() {
		return portsInUse;
	}
	public void setPortsInUse(ArrayList<Integer> portsInUse) {
		this.portsInUse = portsInUse;
	}
}
