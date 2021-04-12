package co.edu.uniandes.csw.mueblesdelosalpes.dto;

/**
 *
 * @author Juan Pablo
 */
public class Offer {

    private long id;
    private String loginUser;
    private long idMueble;
    private double offer;

    public Offer() {
    }

    public Offer(long id, String loginUser, long idMueble, double offer) {
        this.id = id;
        this.loginUser = loginUser;
        this.idMueble = idMueble;
        this.offer = offer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    public long getIdMueble() {
        return idMueble;
    }

    public void setIdMueble(long idMueble) {
        this.idMueble = idMueble;
    }

    public double getOffer() {
        return offer;
    }

    public void setOffer(double offer) {
        this.offer = offer;
    }

}
