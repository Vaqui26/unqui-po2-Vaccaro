package ar.edu.unq.po2.tp8;

import java.util.List;

public abstract class FiltroWikipediaPage {

	public abstract List<WikipediaPage> getSimilarPages(WikipediaPage pagina, 
			List<WikipediaPage> listaDePaginas);
}
