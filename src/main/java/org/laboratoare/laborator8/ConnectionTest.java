package org.laboratoare.laborator8;

public class ConnectionTest {

	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) {

		ArtistController art1 = new ArtistController();
		Artist artist = art1.findByName("Led Zeppelin");
		ArtistController art2 = new ArtistController();
		Artist artist2 = art1.showRank("Led Zeppelin");
		System.out.println(artist);
		AlbumController album1 = new AlbumController();
		Album album = album1.findByArtist(1);
		System.out.println(album);
		// ArtistController art2 = new ArtistController();
		// Artist newArtist = new Artist();
		// newArtist.name = "Led Zeppelin";
		// newArtist.country = "England";
		// art2.create(newArtist);
		// System.out.println("Arist added");
		// AlbumController album2 = new AlbumController();
		// Album newAlbum = new Album();
		// newAlbum.name = "Led Zeppelin IV";
		// newAlbum.artistId = 1;
		// newAlbum.releaseYear = 1971;
		// album2.create(newAlbum);
		// System.out.println("Album added");

	}

}
