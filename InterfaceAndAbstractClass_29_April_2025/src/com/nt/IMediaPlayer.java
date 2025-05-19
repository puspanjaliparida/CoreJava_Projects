package com.nt;

public interface IMediaPlayer {

	public default void play() {
		System.out.println("VLCMediaPlayer.play():: "+"VLCMediaPlayer plays");
        System.out.println();
	}

	public default void pause() {
		System.out.println("VLCMediaPlayer.pause()::"+"VLCMediaPlayer pause");
		System.out.println();
	}

	public default void stop() {
		System.out.println("VLCMediaPlayer.stop()::"+"VLCMediaPlayer stop");
		System.out.println();
	}
}
