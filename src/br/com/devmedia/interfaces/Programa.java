package br.com.devmedia.interfaces;

public class Programa {

	private PlayerVideo video;

	void videos() {
		video = new WMV();
		video.play();
		video.pause();
		video.volume(5);
		video.taxaDeBits();
		video.taxaDeQuadros();
		video.NomeArquivo("video_aula.wmv");

		System.out.println();

		video = new RMV();
		video = new WMV();
		video.play();
		video.pause();
		video.volume(7);
		video.taxaDeBits();
		video.taxaDeQuadros();
		video.NomeArquivo("video_aula.rmv");
	}

	public static void main(String[] args) {
		
		new Programa().videos();

		// MP3 mp3 = new MP3();
		// mp3.play();
		// mp3.pause();
		// mp3.volume(2);
		// mp3.taxaDeBits();
		// mp3.stop();
		//
		// System.out.println();
		//
		// AVI avi = new AVI();
		// avi.play();
		// avi.pause();
		// avi.volume(8);
		// avi.taxaDeBits();
		// avi.taxaDeQuadros();
		// avi.stop();

	}

}
