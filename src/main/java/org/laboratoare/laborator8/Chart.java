package org.laboratoare.laborator8;

public class Chart {

	int rank;
	static String artistName;
	int albumId;
	static String albumName;
	int releaseYear;

	Chart() {

	}

	Chart(int rank, String artistName, int albumId, String albumName, int releaseYear) {
		this.rank = rank;
		Chart.artistName = artistName;
		this.albumId = albumId;
		Chart.albumName = albumName;
		this.releaseYear = releaseYear;

	}

	public int getrank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;

	}

	public static String getArtistName() {
		return artistName;
	}

	public static void setArtistName(String artistName) {
		Chart.artistName = artistName;
	}

	public int getAlbumId() {
		return albumId;
	}

	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}

	public static String getAlbumName() {
		return albumName;
	}

	public static void setAlbumName(String albumName) {
		Chart.albumName = albumName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String toString() {
		return rank + " " + artistName + " " + albumId + " " + albumName + " " + releaseYear;
	}
}
