package org.laboratoare.laborator8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ArtistController {

	Connection conn = null;

	public static Artist findByName(String name) {

		try {
			String query = "select * from artists  where name like '%" + name + "%'";
			Artist a = new Artist();
			Connection conn = DatabaseConnection.getDatabaseConnection();
			Statement stmt = conn.createStatement();
			stmt.executeQuery(query);
			ResultSet rs = stmt.executeQuery(query);
			rs.next();
			a.setId(rs.getInt(1));
			a.setName(rs.getString(2));
			a.setCountry(rs.getString(3));
			return a;
		} catch (Exception e)

		{
			System.out.println("Connection error");
		}
		return null;
	}
	
	public static Artist showRank(String name) {

		try {
			String query = "select a.name, c.rank from artists a join albums b on a.id=b.artist_id join charts c on b.id=c.album_id where a.name like '%" + name + "%'";
			
			Connection conn = DatabaseConnection.getDatabaseConnection();
			Statement stmt = conn.createStatement();
			stmt.executeQuery(query);
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next())  
			System.out.println(rs.getString(1)+"  "+rs.getInt(2));  
		} catch (Exception ex)

		{
			System.out.println("Connection error");
		}
		return null;
	}

	@SuppressWarnings("static-access")
	public static void create(Artist a) {

		String query = "insert into artists values (?,?,?)";
		Connection conn = DatabaseConnection.getDatabaseConnection();
		try {
			PreparedStatement pst = conn.prepareStatement(query);
			pst.setInt(1, a.id);
			pst.setString(2, a.name);
			pst.setString(3, a.country);
			pst.executeUpdate();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}

}
