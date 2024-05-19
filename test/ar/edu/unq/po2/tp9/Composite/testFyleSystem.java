package ar.edu.unq.po2.tp9.Composite;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testFyleSystem {

	private SistemaDeArchivos sistema;
	private Archivo archivo1;
	private Archivo archivo2;
	private Archivo archivo3;
	private Directorio directorio1;
	private Directorio directorio2;
	
	@BeforeEach
	void setUp() {
		
		List<TypeFyle> listaAuxiliar = new ArrayList<TypeFyle>();
		archivo1 = new Archivo("algo",64,new Date(1999,07,01));
		archivo2 = new Archivo("pepe",180, new Date(2021,07,19));
		archivo3 = new Archivo("six", 1084, new Date(2000,01,31));
		directorio1 = new Directorio("musica",new Date(2001,03,17));
		directorio2 = new Directorio("documentos", new Date(2013,06,24));
		
		listaAuxiliar.add(archivo1);
		listaAuxiliar.add(archivo2);
		listaAuxiliar.add(archivo3);
		listaAuxiliar.add(directorio1);
		listaAuxiliar.add(directorio2);
		
		sistema = new SistemaDeArchivos(listaAuxiliar);
		
	}
	
	@Test
	void testArchivosNombres() {
		
		//Set Up
		//Exercise
		//Verify
		assertEquals("algo",archivo1.getNombre());
		assertEquals("pepe",archivo2.getNombre());
		assertEquals("six",archivo3.getNombre());
	}
	@Test
	void testArchivosTamañoDelMismo() {
		
		//Set Up
		//Exercise
		//Verify
		assertEquals(64,archivo1.getTamaño());
		assertEquals(180,archivo2.getTamaño());
		assertEquals(1084,archivo3.getTamaño());
	}
	@Test
	void testArchivosFechaUltimaActualizacion() {
		
		//Set Up
		//Exercise
		//Verify
		assertEquals(new Date(1999,07,01),archivo1.getUltimaFecha());
		assertEquals(new Date(2021,07,19),archivo2.getUltimaFecha());
		assertEquals(new Date(2000,01,31),archivo3.getUltimaFecha());
	}
	@Test
	void testDirectorioNombre() {
		
		//Set Up
		//Exercise
		//Verify
		assertEquals("musica",directorio1.getNombre());
		assertEquals("documentos",directorio2.getNombre());
	}
	@Test
	void testDirectorioTamañoDelMismo() {
		
		//Set Up
		directorio1.agregarFyle(archivo1);
		directorio1.agregarFyle(archivo2);
		directorio1.agregarFyle(archivo3);
		
		directorio2.agregarFyle(archivo1);
		directorio2.agregarFyle(archivo2);
		directorio2.agregarFyle(directorio1);
		
		//Exercise
		//Verify
		assertEquals(1328,directorio1.getTamaño());
		assertEquals(1572,directorio2.getTamaño());
	}
	@Test
	void testDirectorioFechaUltimaActualizacion() {
		
		//Set Up
		//Exercise
		//Verify
		assertEquals(new Date(2001,03,17),directorio1.getUltimaFecha());
		assertEquals(new Date(2013,06,24),directorio2.getUltimaFecha());
	}
	@Test
	void testTamañoDelSistema() {
		
		//Set Up
		directorio1.agregarFyle(archivo1);
		directorio1.agregarFyle(archivo2);
		directorio1.agregarFyle(archivo3);
		
		directorio2.agregarFyle(archivo1);
		directorio2.agregarFyle(archivo2);
		directorio2.agregarFyle(directorio1);
		
		//Exercise
		
		//Verify
		assertEquals(4228,sistema.totalSize());
		
	}
	@Test
	void testSistemaUltimoArchivoModificado() {
		
		//Set Up
		directorio1.agregarFyle(archivo1);
		directorio1.agregarFyle(archivo2);
		directorio1.agregarFyle(archivo3);
		
		directorio2.agregarFyle(archivo1);
		directorio2.agregarFyle(archivo2);
		directorio2.agregarFyle(directorio1);
		
		//Exercise
		
		//Verify
		assertEquals(new Date(2021,07,19),sistema.lastModified().getUltimaFecha());
	}
	
}
