package javadbCon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
	public static void main(String args[]) {
		try {
			int kemelne = 0;
			while (kemelne != 9) {
				Scanner sc = new Scanner(System.in);
				Class.forName("com.mysql.jdbc.Driver");
				Connection conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3307/test", "root", "root");

				Statement stmt = conn.createStatement();
				if (kemelne == 1) {
					System.out.println("Donner le nom de l'utilisateur");
					String nom = sc.nextLine();
					System.out.println("Donner le prenom de l'utilisateur");
					String prenom = sc.nextLine();

					String sql = "INSERT INTO test (nom,prenom) VALUES ('" + nom + "','" + prenom + "')";
					stmt.executeUpdate(sql);
					System.out.println("Utilisateur ajouté");

				} else if (kemelne == 2) {
					System.out.println("Donner l'id de l'utilisateur");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.println("Donner le nom de l'utilisateur");
					String nom = sc.nextLine();
					System.out.println("Donner le prenom de l'utilisateur");
					String prenom = sc.nextLine();

					String sql = "UPDATE test SET nom = '" + nom + "', prenom = '" + prenom + "' WHERE id = "+id+"";
					stmt.executeUpdate(sql);
					System.out.println("Utilisateur modifié");
				} else if (kemelne == 3) {
					System.out.println("Donner le nom de l'utilisateur");
					String nom = sc.nextLine();
					System.out.println("Donner le prenom de l'utilisateur");
					String prenom = sc.nextLine();

					String sql = "DELETE FROM test WHERE nom = '" + nom + "' AND prenom = '" + prenom + "'";
					stmt.executeUpdate(sql);
					System.out.println("Utilisateur supprimé");

				} else if (kemelne == 4) {

					ResultSet res = stmt.executeQuery("SELECT * FROM test");
					System.out.println("Resultat:");
					while (res.next())
						// parcourir le resultat
						System.out
								.println(res.getInt("id") + " " + res.getString("nom") + " " + res.getString("prenom"));
				}
				conn.close();
				kemelne = 0;

				System.out.println("----------------------------------------------------------------");
				System.out.println("select 1 for insert, 2 for update, 3 for delete, 4 for select,9 to exit");
				System.out.println("----------------------------------------------------------------");
				kemelne = sc.nextInt();

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
