package entidades;

/**
 * @author scandiani
 */
public class Guante extends Armadura {

    private String lado;
    private Repulsor repulsor;

    public Guante() {
    }

    public Guante(String lado, Repulsor repulsor, int nivelEnergia) {
        super(nivelEnergia);
        this.lado = lado;
        this.repulsor = repulsor;
    }
    
    

}//class
