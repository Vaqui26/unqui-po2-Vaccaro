package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.List;

public class FiltroMismaLetraInicial extends FiltroWikipediaPage{

	public List<WikipediaPage> getSimilarPages(WikipediaPage pagina,
			List<WikipediaPage> listaDePaginas){
		
		String primerLetra = pagina.getTitle().substring(0,1);
		List<WikipediaPage> listaFiltrada = new ArrayList<WikipediaPage>();
		
		for (WikipediaPage paginaWiki : listaDePaginas) {
			
			String primerLetraPaginaWiki = paginaWiki.getTitle().substring(0,1);
			if(primerLetra.equals(primerLetraPaginaWiki))
				listaFiltrada.add(paginaWiki);				
		}
		
		return listaFiltrada;
	}
}
