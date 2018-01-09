// To test:
// 1.) build the project 
//     $ mvn package
// 2.) Run the package
//     $ cd sqlserverjava
//     $ mvn -q exec:java "-Dexec.mainClass=com.<package_name>.App"

package com.sqlserverjava;

import java.sql.Connection;
import java.sql.DriverManager;

public class App {

	public static void main(String[] args) {

		// Build connection
        String hostname = "centos.localsandbox.com";
        String port = "1433";
        String databaseName = "master";
        String userName = "sa";
        String password = "pAssw0rd123$";
		String connectionUrl = "jdbc:sqlserver://" + hostname + ":" + port + ";databaseName=" + databaseName + ";user=" + userName + ";password=" + password;

		try {
			// Load SQL Server JDBC driver and establish connection.
			System.out.print("Connecting to SQL Server ... ");
			try (Connection connection = DriverManager.getConnection(connectionUrl)) {
				System.out.println("Done.");
			}
		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}
	}
}