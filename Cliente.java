import java.util.List;
import java.util.ArrayList;

public class Cliente extends Usuario {
    private int puntosFidelidad;
    private List<String> juegosFavoritos;
    private List<String> historialCompras;
    
    public Cliente(int id, String username, String email, String password){
        super(id, username, email, password);
        this.puntosFidelidad = 0;
        this.juegosFavoritos = new ArrayList<>();
        this.historialCompras = new ArrayList<>();
    }

    public int getPuntos(){
        return puntosFidelidad;
    }

    public List<String> getJuegosFavoritos(){
        return juegosFavoritos;
    }

    public List<String> getHistorialDeCompras(){
        return historialCompras;
    }

    public void setJuegosFavoritos(Juego juego){
        juegosFavoritos.add(juego);
    }

    public void reservarMesa(Mesa mesa, int numPersonas, boolean hayMenores, int numNinios, int numJovenes){
        if(mesa == null){
            System.out.println("No se ha recibido ninguna mesa.");
        } else if (numPersonas > mesa.getCapacidad()) {
            System.out.println("La capacidad de las personas supera la capacidad de la mesa");
        } else{
            // ACA HABRAN MAS SETS?
            mesa.setNumPersonas(numPersonas); 
            // XXXXX
            mesa.setHayMenores(hayMenores);
            mesa.setNumNinios(numNinios);
            mesa.setNumJovenes(numJovenes);
            mesa.setOcupada(true);
        }    
    }

    public void reservarJuegos(String juego1, String juego2, Boolean mesareservada){
        if (mesareservada == true) {
            System.out.println("Se han reservado los juegos " + juego1 + " y " + juego2 + " para la mesa " + mesareservada);
        } else {
            System.out.println("La mesa no es válida para reservar juegos.");
        }
        //Revisar igual
    }

    public List<String> juegoDisponibles(String JuegosDisponibles){
        for (Juego juego : Juego.JuegosDisponibles()) {
            System.out.println(juego.getNombre());
            List<String> Lista = new ArrayList<>();
                for (int i = 0; i < Juego.JuegosDisponibles().length; i++) {
            Lista.add(Juego.JuegosDisponibles()[i].getNombre());
            }
        return new ArrayList<>();
    }

    public void regresarJuego(int mesaproviene, String juego){
        //REVISAR MAS ADELANTE
    }

    public void comprarJuego(){
        //REVISAR MASA ADELANTE
    }

    public void comprarProducto(){
        //REVISAR MAS ADELANTE
    }
}