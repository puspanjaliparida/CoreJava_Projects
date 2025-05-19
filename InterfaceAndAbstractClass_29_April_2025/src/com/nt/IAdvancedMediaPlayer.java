package com.nt;

import java.util.ArrayList;

public interface IAdvancedMediaPlayer extends IMediaPlayer {

	@Override
	public default void play() {
		System.out.println("VLCMediaPlayer.play():: "+"VLCMediaPlayer plays");
        System.out.println();
	}

	@Override
	public default void pause() {
		System.out.println("VLCMediaPlayer.pause()::"+"VLCMediaPlayer pause");
		System.out.println();
	}

	@Override
	public default void stop() {
		System.out.println("VLCMediaPlayer.stop()::"+"VLCMediaPlayer stop");
		System.out.println();
	}

	
	public default void volume(int volumeLevel) {
		if(volumeLevel<1) {
			System.out.println("mute");
		}
		else if(volumeLevel>=1 && volumeLevel<=20) {
			System.out.println("Low Voume");
		}
		else if(volumeLevel>=21 && volumeLevel<=30) {
			System.out.println("Medium");
		}
		System.out.println("VLCMediaPlayer.volume()::"+"volume");

	}

	public default void track() {
		System.out.println("VLCMediaPlayer.track()::"+"VLCMediaPlayer skipping track");
		System.out.println();
	}
}
