package Simulator;

import Common.Socket;

public class Application {
	private Socket localSocket;
	private Socket remoteSocket;

	public Application(Socket localSocket, Socket remoteSocket) {
		this.setLocalSocket(localSocket);
		this.remoteSocket = remoteSocket;
	}
	
	public Socket getLocalSocket() {
		return localSocket;
	}

	public void setLocalSocket(Socket localSocket) {
		this.localSocket = localSocket;
	}
}
