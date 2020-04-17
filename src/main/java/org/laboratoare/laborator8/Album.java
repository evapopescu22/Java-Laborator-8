package org.laboratoare.laborator8;

public class Album {

	int id;
	static String name;
	int artistId;
	int releaseYear;

	Album() {

	}

	
	Album(String name, int artistId, int releaseYear) {
		Album.name = name;
		this.artistId = artistId;
		this.releaseYear = releaseYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
	
	public  String getName() {
		return name;
	}

	public void setName(String name) {
		Album.name = name;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public int getAristId() {
		return artistId;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public String toString() {
		return id + " " + name + " " + artistId + " " + releaseYear

		;
	}

}
