package com.nt;
class Song{
	private String songName;
	private String singerName;
	private String type;
	 
	public Song(String songName, String singerName, String type) {
			super();
			this.songName = songName;
			this.singerName = singerName;
			this.type = type;
    }
	@Override
	public String toString() {
		 return "Song Name:" +songName+"\nSinger Name:"+singerName+"\ntype:"+type;
    }
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSingerName() {
		return singerName;
	}
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}