package co.edu.uniandes.csw.mueblesdelosalpes.logica.ejb;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Offer;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockLocal;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockRemote;
import java.util.ArrayList;

/**
 *
 * @author Juan Pablo
 */
public class ServicioOfertaMock implements IServicioOfertaMockLocal, IServicioOfertaMockRemote {

    private ArrayList<Offer> offers = new ArrayList<Offer>();

    @Override
    public ArrayList<Offer> getOffers() {
        return offers;
    }

    @Override
    public void addOffer(Offer oferta) {
        offers.add(oferta);
    }

}
