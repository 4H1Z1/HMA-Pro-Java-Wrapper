package me.jgop.com.hma;

import java.io.IOException;

public class HMA {
	public static void main(String[] args){
		HMA hma = new HMA(OSVersion.BIT_64);
		try {
			hma.connect();
			hma.changeIP();
			hma.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private String path;
	public HMA(OSVersion osVersion){
		this.path = osVersion.getPath();
	}
	public HMA(String path){
		this.path = path;
	}
	public void changeIP() throws IOException{
		Runtime.getRuntime().exec("\""+path+"\" -changeip");
	}
	public void connect() throws IOException{
		Runtime.getRuntime().exec("\""+path+"\" -connect");
	}
	public void disconnect() throws IOException{
		Runtime.getRuntime().exec("\""+path+"\" -disconnect");
	}
	public enum OSVersion{
		//32 and 86 are the same but added both incase people dont know this fact
		BIT_32("C:\\Program Files\\HMA! Pro VPN\\bin\\HMA! Pro VPN.exe"),
		BIT_64("C:\\Program Files (x86)\\HMA! Pro VPN\\bin\\HMA! Pro VPN.exe"),
		BIT_86("C:\\Program Files\\HMA! Pro VPN\\bin\\HMA! Pro VPN.exe");
		private String path;
		OSVersion(String path){
			this.path = path;
		}
		public String getPath(){
			return path;
		}
	}
}
