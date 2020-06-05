package modelo;

/**
 *
 * @author root
 */
public class Empleado {
    int id;
    String rut;
    String nom;
    String tel;
    String estado;
    String user;

    /**
     *
     */
    public Empleado() {
    }

    /**
     *
     * @param id
     * @param rut
     * @param nom
     * @param tel
     * @param estado
     * @param user
     */
    public Empleado(int id, String rut, String nom, String tel, String estado, String user) {
        this.id = id;
        this.rut = rut;
        this.nom = nom;
        this.tel = tel;
        this.estado = estado;
        this.user = user;
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     */
    public String getRut() {
        return rut;
    }

    /**
     *
     * @param rut
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getTel() {
        return tel;
    }

    /**
     *
     * @param tel
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     *
     * @return
     */
    public String getEstado() {
        return estado;
    }

    /**
     *
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     *
     * @return
     */
    public String getUser() {
        return user;
    }

    /**
     *
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }
    
    
}
