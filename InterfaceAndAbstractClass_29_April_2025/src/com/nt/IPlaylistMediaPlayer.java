package com.nt;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public interface IPlaylistMediaPlayer extends IAdvancedMediaPlayer {

	@Override
	public default void play() {
		System.out.println("Playing songs...");
        System.out.println();
	}

	@Override
	public default void pause() {
		System.out.println("Pausing Current Song...");
		System.out.println();
	}

	@Override
	public default void stop() {
		System.out.println("Stopping Playback...");
		System.out.println();
	}

	@Override
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
    
	@Override
	public default void track() {
		System.out.println("VLCMediaPlayer.track()::"+"VLCMediaPlayer skipping track");
		System.out.println();
	}

	
	public default void createPlaylist(String playListName,Song[] songs) {
		System.out.println("playList:"+playListName+" created with the following songs:");
		for (Song s : songs) {
            if (s != null)
                System.out.println("- " + s.getSongName() + " by " + s.getSingerName() + " [" + s.getType() + "]");
        }
	}
 
	public default void mediaItems(String playListName,Song[] songs) {
		if (songs != null) {
            for (Song s : songs) {
                if (s != null)
                    System.out.println(s.getSongName() + " by " + s.getSingerName());
            }
        }
	}
}
