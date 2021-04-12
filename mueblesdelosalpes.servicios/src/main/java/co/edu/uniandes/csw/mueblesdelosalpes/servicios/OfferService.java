package co.edu.uniandes.csw.mueblesdelosalpes.servicios;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Offer;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockLocal;
import java.util.List;
import javax.ws.rs.POST;
import javax.ws.rs.GET;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Juan Pablo
 */
@Path("/Oferta")
@Stateless
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OfferService {

    /**
     * Referencia al Ejb de ofertas encargada de realizar las operaciones del
     * mismo.
     */
    @EJB
    private IServicioOfertaMockLocal offerEjb;
    
    @GET
    @Path("ofertas/")
    public List<Offer> getOffers() {
        return offerEjb.getOffers();
    }

    @POST
    @Path("ofertas/")
    public void postOffers(Offer offer) {
        offerEjb.addOffer(offer);
    }
}
