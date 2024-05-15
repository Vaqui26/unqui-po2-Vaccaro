package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testFiltroPropiedadEnComun {
	
	private FiltroPropiedadEnComun filtro;
	private PaginaWikiPedia pagina1;
	private PaginaWikiPedia pagina2;
	private PaginaWikiPedia pagina3;
	private PaginaWikiPedia pagina4;
	
	@BeforeEach
	void setUp() {
		
		filtro = new FiltroPropiedadEnComun();
		pagina1 = mock(PaginaWikiPedia.class);
		pagina2 = mock(PaginaWikiPedia.class);
		pagina3 = mock(PaginaWikiPedia.class);
		pagina4 = mock(PaginaWikiPedia.class);
	}
	
	@Test
	void tesFriltroPropiedadEnComunt() {
		
		//Set Up
		List<WikipediaPage> listaAFiltrar = new ArrayList<WikipediaPage>();
		listaAFiltrar.add(pagina2);
		listaAFiltrar.add(pagina3);
		listaAFiltrar.add(pagina4);
		when(pagina1.getInfobox()).thenReturn(map<"birth_place",pagina2>,map<"birth_place",pagina2>,
				map<"birth_place",pagina2>);
		when(pagina2.getInfobox()).thenReturn(map<"birth_place",pagina4>);
		when(pagina3.getInfobox()).thenReturn(map<"fall_sleeping",pagina1>);
		when(pagina4.getInfobox()).thenReturn(map<"birth_place",pagina2>);
		
		List<WikipediaPage> listaEsperada = new ArrayList<WikipediaPage>();
		listaEsperada.add(pagina2);
		listaEsperada.add(pagina4);	
		
		//Exercise
		
		//Verify
		assertEquals([pagina2,pagina4],filtro.getSimilarPages(pagina1,listaAFiltrar));
		
	}

}
