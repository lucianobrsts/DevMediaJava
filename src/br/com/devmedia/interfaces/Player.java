package br.com.devmedia.interfaces;

public interface Player {
	
	public abstract void play();
	
	abstract void stop();
	
	void pause();
	
	void volume(int volume);

}
