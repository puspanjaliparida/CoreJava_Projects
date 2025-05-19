/*Q2)MediaPlayer - VLCMediaPlayer
WAP for the below requirement:
 Create a type Interface 'MediaPlayer'.
 It provides basic functionalities like play, pause, and stop.
 Create another type Interface 'AdvancedMediaPlayer' which
 is a type of MediaPlayer but adds some extra functionalities
 like adjusting volume and skipping track.
 Create another type Interface 'PlaylistMediaPlayer' which
 is a type of AdvancedMediaPlayer and adds functionalities for
 managing playlists like creating playlists and adding media items
 to playlists.
  Create a VLCMediaPlayer class which implements PlaylistMediaPlayer
  and provides implementations for all the methods defined
  in the interfaces.*/
package com.nt;


public class VLCMediaPlayer implements IPlaylistMediaPlayer {
   public static void main(String[] args) {
	  VLCMediaPlayer vl=new VLCMediaPlayer();
	  Song[] songsArray = new Song[5];
      songsArray[0] = new Song("Premalo", "Sameera Bhardwaj", "Love");
      songsArray[1] = new Song("Karige Loga", "Kunal Gunjanwala", "Sad");
      songsArray[2] = new Song("Teliseney na Nuvve", "Revanth", "Broken");
      songsArray[3] = new Song("Na Roja Nuvve", "Shiva Nirvana", "Love");
      songsArray[4] = new Song("Prema velluva", "Sid Sriram", "Love");

      vl.createPlaylist("My Fav Songs", songsArray);
      vl.play();
      vl.pause();
      vl.stop();
      vl.volume(8);
      vl.track();
      vl.mediaItems("My Fav Songs", songsArray);   }
}
