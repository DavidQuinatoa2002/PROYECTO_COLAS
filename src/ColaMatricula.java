import java.util.LinkedList;
import java.util.Queue;

public class ColaMatricula {

    private Queue <Vehiculo> carros;
    public ColaMatricula(){
        carros = new LinkedList<Vehiculo>();
    }

    public void encolar (String propietario, String marca, int anio){
        carros.add(new Vehiculo(propietario,marca,anio));
    }

    public Vehiculo desencolar() throws Exception {
        if (carros.isEmpty())
            throw new Exception("No hay vehiculos en la Cola");
        return carros.poll();
    }

    public String listarVehiculos(){
        String mensaje = "";
        for (Vehiculo v:carros){
            mensaje += v.toString();
        }
        return mensaje;
    }



}
