package ar.edu.unq.po2.tp8;

import java.util.List;
import java.util.Map;

/*
 * Metodos que toda pagina de wikipedia debe saber responder
 */
public interface WikipediaPage {

	// Retorna el titulo de la pagina.
	public String getTitle();
	
	// Retorn una lista de paginas de wikipedia con las que se conecta.
	public List<WikipediaPage> getLinks();
	
	// retorna un Map con un valor en 	texto y la pagina que describe ese valor que aparecen 
	// en los infobox de la página de Wikipedia.
	public Map<String, WikipediaPage> getInfobox();
}
