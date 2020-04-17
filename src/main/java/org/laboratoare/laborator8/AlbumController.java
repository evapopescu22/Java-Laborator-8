package org.laboratoare.laborator8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AlbumController {

	Connection conn = null;

	public static Album findByArtist(int artistId) {

		try {
			String query = "select * from albums where artist_id=" + artistId;
			Album a = new Album();
			Connection conn = DatabaseConnection.getDatabaseConnection();
			Statement stmt = conn.createStatement();
			stmt.executeQuery(query);
			ResultSet rs = stmt.executeQuery(query);
			rs.next();
			a.setId(rs.getInt(1));
			a.setName(rs.getString(2));
			a.setArtistId(rs.getInt(3));
			a.setReleaseYear(rs.getInt(4));
			return a;
		} catch (Exception e)

		{
			System.out.println("Connection error");
		}
		return null;
	}

	@SuppressWarnings("static-access")
	public static void create(Album a) {

		Connection conn = DatabaseConnection.getDatabaseConnection();
		try {
			String query = "insert into albums values (?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1, a.id);
			pst.setString(2, a.name);
			pst.setInt(3, a.artistId);
			pst.setInt(4, a.releaseYear);
			pst.executeUpdate();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
