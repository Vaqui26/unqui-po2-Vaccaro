package ar.edu.unq.po2.tp8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaginaWikiPedia implements WikipediaPage{

	//Instancia de variables
	private String titulo;
	private String contenido;
	private List<WikipediaPage> paginasConectadas;
	private WikipediaPage paginaInfobox;	
	
	//Constructores
	public PaginaWikiPedia(String titulo, List<WikipediaPage> listaPaginasConectadas, String contenido
			, WikipediaPage paginaInfobox) {
		
		this.titulo = titulo;
		this.paginasConectadas = listaPaginasConectadas;
		this.contenido = contenido;
		this.paginaInfobox = paginaInfobox;
	}
	//Metodos
	
	public String getTitle() {
		
		return this.titulo;
	}
	
	public List<WikipediaPage> getLinks(){
		
		return this.paginasConectadas;
		
	}
	public Map<String, WikipediaPage> getInfobox(){
		
		Map<String, WikipediaPage> map = new HashMap<String, WikipediaPage>();
		map.put(contenido, paginaInfobox);
		
		return map;
	}
}
