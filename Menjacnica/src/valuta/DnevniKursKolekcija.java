package valuta;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;

import valuta.interfejs.IMenjacnica;

public class DnevniKursKolekcija implements IMenjacnica{

	List<DnevniKurs> listaKurseva;

	public DnevniKursKolekcija() {
		listaKurseva = new LinkedList<>();
	}

	@Override
	public void dodajDnevniKurs(Valuta valuta, GregorianCalendar datum, double prodajniKurs, double kupovniKurs, double srednjiKurs) {
		DnevniKurs dk = new DnevniKurs();
		dk.setDatum(datum);
		dk.setValuta(valuta);
		dk.setProdajniKurs(prodajniKurs);
		dk.setSrednjiKurs(srednjiKurs);
		dk.setKupovniKurs(kupovniKurs);
		listaKurseva.add(dk);
	}

	@Override
	public void obrisiDnevniKurs(GregorianCalendar datum) {
		for (int i = 0; i < listaKurseva.size(); i++) {
			DnevniKurs dkr = listaKurseva.get(i);
			if (dkr.getDatum().equals(datum)) {
				listaKurseva.remove(i);
				return;
			}
		}		
	}

	@Override
	public DnevniKurs pronadjiKurs(GregorianCalendar datum) {
		for (int i = 0; i < listaKurseva.size(); i++) {
			DnevniKurs dkr = listaKurseva.get(i);
			if (dkr.getDatum().equals(datum)) {
				return dkr;
			}
		}
		return null;
	}
	
}
