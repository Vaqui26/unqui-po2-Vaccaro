package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testFiltroLinkEnComun {
	
	private FiltroLinkEnComun filtro;
	private PaginaWikiPedia pagina1;
	private PaginaWikiPedia pagina2;
	private PaginaWikiPedia pagina3;
	private PaginaWikiPedia pagina4;
	private PaginaWikiPedia pagina5;
	private PaginaWikiPedia pagina6;
	private PaginaWikiPedia pagina7;
	private PaginaWikiPedia pagina8;
	private PaginaWikiPedia pagina9;
	private PaginaWikiPedia pagina10;
	
	
	@BeforeEach
	void setUp() {
		
		filtro = new FiltroLinkEnComun();
		pagina1 = mock(PaginaWikiPedia.class);
		pagina2 = mock(PaginaWikiPedia.class);
		pagina3 = mock(PaginaWikiPedia.class);
		pagina4 = mock(PaginaWikiPedia.class);
		pagina5 = mock(PaginaWikiPedia.class);
		pagina6 = mock(PaginaWikiPedia.class);
		pagina7 = mock(PaginaWikiPedia.class);
		pagina8 = mock(PaginaWikiPedia.class);
		pagina9 = mock(PaginaWikiPedia.class);
		pagina10 = mock(PaginaWikiPedia.class);
	}
	@Test
	void testFiltroLinkEnComun() {
		
		//Set Up
		List<WikipediaPage> listaAFiltrar = new ArrayList<WikipediaPage>();
		listaAFiltrar.add(pagina2);
		listaAFiltrar.add(pagina3);
		listaAFiltrar.add(pagina4);
		List<WikipediaPage> listaPaginas1 = new ArrayList<WikipediaPage>();
		List<WikipediaPage> listaPaginas2 = new ArrayList<WikipediaPage>();
		List<WikipediaPage> listaPaginas3 = new ArrayList<WikipediaPage>();
		List<WikipediaPage> listaPaginas4 = new ArrayList<WikipediaPage>();
		listaPaginas1.add(pagina5);
		listaPaginas1.add(pagina6);
		listaPaginas2.add(pagina5);
		listaPaginas2.add(pagina7);
		listaPaginas2.add(pagina5);
		listaPaginas1.add(pagina8);
		listaPaginas4.add(pagina9);
		listaPaginas4.add(pagina10);
		
		pagina1.when(getLinks()).thenReturn(listaPagina1,listaPagina1,listaPagina1);
		pagina2.when(getLinks()).thenReturn(listaPagina2);
		pagina3.when(getLinks()).thenReturn(listaPagina3);
		pagina4.when(getLinks()).thenReturn(listaPagina4);
		
		//Exercise
		
		//Verify
		assertEquals([pagina2,pagina3],filtro.getSimilarPages(pagina1,listaAFiltrar));
	}

}
