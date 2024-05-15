package ar.edu.unq.po2.tp9.Composite;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testRegion {

	private SistemaParcela sistemaParcela;
	private List<Region> listaCosechas;
	private RegionCultivada cosecha1;
	private RegionCultivada cosecha2;
	private RegionCultivada cosecha3;
	private RegionCultivada cosecha4;
	private RegionDividida subdivision1;
	private RegionDividida subdivision2;
	private RegionDividida subdivision3;

	@BeforeEach
	void setUp() {

		listaCosechas = new ArrayList<Region>();
		cosecha1 = new RegionCultivada("Soja");
		cosecha2 = new RegionCultivada("Trigo");
		cosecha3 = new RegionCultivada("Soja");
		cosecha4 = new RegionCultivada("Trigo");
		subdivision1 = new RegionDividida();
		subdivision2 = new RegionDividida();
		subdivision3 = new RegionDividida();

		subdivision1.agregarRegion(cosecha1);
		subdivision1.agregarRegion(cosecha2);
		subdivision1.agregarRegion(cosecha3);
		subdivision1.agregarRegion(cosecha4);

		subdivision2.agregarRegion(cosecha1);
		subdivision2.agregarRegion(cosecha2);
		subdivision2.agregarRegion(cosecha3);
		subdivision2.agregarRegion(cosecha3);

		subdivision3.agregarRegion(cosecha1);
		subdivision3.agregarRegion(cosecha2);
		subdivision3.agregarRegion(cosecha2);
		subdivision3.agregarRegion(cosecha4);

	}

	@Test
	void testGanaciasCosechaSimple() {

		assertEquals(500, cosecha1.ganancias());
		assertEquals(300, cosecha2.ganancias());
		assertEquals(500, cosecha3.ganancias());
		assertEquals(300, cosecha4.ganancias());
	}

	@Test
	void testGananciasCosechaDividida() {

		assertEquals(400, subdivision1.ganancias());
		assertEquals(450, subdivision2.ganancias());
		assertEquals(350, subdivision3.ganancias());
	}

	@Test
	void testSistemaParcelaSoloSoja() {

		// Set Up
		listaCosechas.add(cosecha1);
		listaCosechas.add(cosecha3);
		listaCosechas.add(cosecha1);
		listaCosechas.add(cosecha3);

		sistemaParcela = new SistemaParcela(listaCosechas);

		// Verify
		assertEquals(2000, sistemaParcela.gananciaDeLaParcela());
	}

	@Test
	void testSistemaParcelaSoloTrigo() {

		// Set Up
		listaCosechas.add(cosecha2);
		listaCosechas.add(cosecha4);
		listaCosechas.add(cosecha2);
		listaCosechas.add(cosecha4);

		sistemaParcela = new SistemaParcela(listaCosechas);

		// Verify
		assertEquals(1200, sistemaParcela.gananciaDeLaParcela());
	}
	@Test
	void testSistemaParcelaConUnaRegionMixta() {
		
		//Set Up
		listaCosechas.add(cosecha1);
		listaCosechas.add(cosecha2);
		listaCosechas.add(cosecha3);
		listaCosechas.add(subdivision1);
		
		sistemaParcela = new SistemaParcela(listaCosechas);
		
		// Verify
		
		assertEquals(1700,sistemaParcela.gananciaDeLaParcela());
		
	}
	@Test
	void testSistemaParcelaConDosRegionMixta() {
		
		//Set Up
		listaCosechas.add(cosecha1);
		listaCosechas.add(cosecha2);
		listaCosechas.add(subdivision1);
		listaCosechas.add(subdivision2);
		
		sistemaParcela = new SistemaParcela(listaCosechas);
		
		// Verify
		
		assertEquals(1650,sistemaParcela.gananciaDeLaParcela());
		
	}
	@Test
	void testSistemaParcelaConTresRegionMixta() {
		
		//Set Up
		listaCosechas.add(cosecha1);
		listaCosechas.add(subdivision2);
		listaCosechas.add(subdivision3);
		listaCosechas.add(subdivision1);
		
		sistemaParcela = new SistemaParcela(listaCosechas);
		
		// Verify
		
		assertEquals(1700,sistemaParcela.gananciaDeLaParcela());
		
	}
}
