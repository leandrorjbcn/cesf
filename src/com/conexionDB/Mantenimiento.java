package com.conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Mantenimiento {

	public void insertar(String dni, String nombre, int edad) {
		Connection conn = getConnection();
		// Aquí viene el código que falta
				
		//crea un alias para comandos SQL
		Statement statement;
		
		try {
			statement = conn.createStatement();
			statement.executeUpdate("INSERT INTO prueba(dni, nombre, edad) VALUES ('"+dni+"' , '"+nombre+"'  , "+edad+"  )");
			statement.close();
			//Encerra la conección del BBDD		
			conn.close();
			// Aquí viene el código que falta
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// databaseConnection.createStatement();
		
	}
	
	public void eliminar() {
		Connection conn = getConnection();
		// Aquí viene el código que falta
		//crea un alias para comandos SQL
		Statement statement;
		
		try {
			statement = conn.createStatement();
			statement.executeUpdate	("DELETE FROM prueba WHERE dni='null'");
			statement.close();
			//Encerra la conección del BBDD		
			conn.close();
			// Aquí viene el código que falta
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// databaseConnection.createStatement();
		
	}
	
	public void modificarRegistro(String dni, String nombre, int edad) {

		Connection conn = getConnection();
		// Aquí viene el código que falta
				
		//crea un alias para comandos SQL
		Statement statement;
		
		try {
			statement = conn.createStatement();
			statement.executeUpdate("UPDATE prueba SET nombre='"+nombre+"', edad = "+edad+" WHERE dni = '"+dni+"'");
			statement.close();
			//Encerra la conección del BBDD		
			conn.close();
			// Aquí viene el código que falta
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// databaseConnection.createStatement();
		
	}
	
	public ArrayList <String> consulta() {
		Connection conn = getConnection();
		// Aquí viene el código que falta
		//crea un alias para comandos SQL
		Statement statement;
		
		ArrayList <String>lista = new ArrayList<String>();
		
		try {
			statement = conn.createStatement();
			ResultSet personas = statement.executeQuery("SELECT * FROM prueba");
			while (personas.next()){
//				System.out.println(personas.getString("nombre"));
				lista.add(personas.getString("nombre"));				
			}
			statement.close();
			//Encerra la conección del BBDD		
			conn.close();
			// Aquí viene el código que falta
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// databaseConnection.createStatement();
		
		return lista;
		
	}
	
	

	public Connection getConnection() {
		// Aquí viene el código que falta
		try {			
			
			//carga el Drive
			Class.forName("com.mysql.jdbc.Driver");
			//Dice donde está la base de dados
			String sourceURL = "jdbc:mysql://localhost/personas";
			//Dice el usuario e contraseña del BBDD
			Connection databaseConnection = DriverManager.getConnection(sourceURL, "root", "");
			
			return databaseConnection;
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
	}
}
