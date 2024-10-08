package com.ayrton.projects.springbootprofiles;

public class DataSource {
	
	private String server;
	private int port;
	
	public DataSource(String server, int port) {
		super();
		this.server = server;
		this.port = port;
	}
	
	public String getServer() {
		return server;
	}
	
	public void setServer(String server) {
		this.server = server;
	}
	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	@Override
	public String toString() {
		return "DataSource [server=" + server + ", port=" + port + "]";
	}
	
	

}
