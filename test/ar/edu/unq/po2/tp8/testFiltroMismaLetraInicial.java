package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testFiltroMismaLetraInicial {
	
	private FiltroMismaLetraInicial filtro;
	private PaginaWikiPedia pagina1;
	private PaginaWikiPedia pagina2;
	private PaginaWikiPedia pagina3;
	private PaginaWikiPedia pagina4;
	
	@BeforeEach
	void setUp() {
		
		filtro = new FiltroMismaLetraInicial();
		pagina1 = mock(PaginaWikiPedia.class);
		pagina2 = mock(PaginaWikiPedia.class);
		pagina3 = mock(PaginaWikiPedia.class);
		pagina4 = mock(PaginaWikiPedia.class);
		
		
	}
	
	@Test
	void testVerificarFiltro() {

		//Set Up
		List<WikipediaPage> listaAFiltrar = new ArrayList<WikipediaPage>();
		when(pagina1.getTitle()).thenReturn("Bernal");
		when(pagina2.getTitle()).thenReturn("Beriso");
		when(pagina3.getTitle()).thenReturn("Baby");
		when(pagina4.getTitle()).thenReturn("Bitacoria11");
		listaAFiltrar.add(pagina2);
		listaAFiltrar.add(pagina3);
		listaAFiltrar.add(pagina4);
		List<WikipediaPage> listaEsperada = new ArrayList<WikipediaPage>();
		listaEsperada.add(pagina2);
		listaEsperada.add(pagina3);
		listaEsperada.add(pagina4);
		
		//Exercise
		
		//Verify
		assertTrue(listaEsperada.equals(filtro.getSimilarPages(pagina1,listaAFiltrar)));
	}

}
