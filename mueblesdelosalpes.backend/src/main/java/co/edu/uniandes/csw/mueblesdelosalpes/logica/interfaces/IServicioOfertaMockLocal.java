package co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Offer;
import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author Juan Pablo
 */
@Local
public interface IServicioOfertaMockLocal {

    /**
     * Devuelve historial de ofertas registradas.
     *
     * @return listado de ofertas registradas.
     */
    public ArrayList<Offer> getOffers();

    /**
     * Agrega una nueva oferta de un mueble
     *
     * @param oferta Referencia a una nuevva oferta
     */
    public void addOffer(Offer oferta);

}
