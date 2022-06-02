import java.util.ArrayList;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Persona> pesonas = new ArrayList<Persona>();
        pesonas.add(new Persona("Persona1",23,"22222222","ixtlan"));
        pesonas.add(new Persona("Persona2",23,"22222222","ixtlan"));
        pesonas.add(new Persona("Persona3",23,"22222222","ixtlan"));
        pesonas.add(new Persona("Persona4",23,"22222222","ixtlan"));
        pesonas.add(new Persona("Persona5",23,"22222222","ixtlan"));


        for (Persona pesona: pesonas) {
            System.out.println("Elemento del ArrayList: " + pesona.toString());
        }
    }
}
