package com.conexionDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args)  {		
		
		Scanner scanner = new Scanner(System.in);
		Main main = new Main();
/*		
		System.out.println("Introduzca dni:");
		String dni = scanner.next();
		System.out.println("Introduzca nombre:");
		String nombre = scanner.next();
		System.out.println("Introduzca edad:");
		int edad = scanner.nextInt();
		scanner.close();
*/		
/*
		System.out.println("Introduzca dni:");
		String dni = scanner.next();
		System.out.println("Introduzca nombre nuevo:");
		String nombre = scanner.next();
		System.out.println("Introduzca edad nueva:");
		int edad = scanner.nextInt();
		scanner.close();		
*/		
		Mantenimiento mantenimiento = new Mantenimiento();
//		mantenimiento.insertar(dni, nombre, edad);
//		mantenimiento.eliminar();
//		mantenimiento.modificarRegistro(dni, nombre, edad);
		
		
//crio este ArrayList para receber el ArrayList que retorna el método consulta 		
		ArrayList<String>lista = mantenimiento.consulta();

		Iterator<String> it = lista.iterator();
		while(it.hasNext()) {
			String nombre = it.next();
			System.out.println(nombre);
		}		
	
	}
}

