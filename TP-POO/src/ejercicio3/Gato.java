package ejercicio3;

import java.util.Objects;

public class Gato extends Animal {

    private String colorPelaje;

    public Gato(String nombre, String sonido, String colorPelaje) {
        super(nombre, sonido);
        this.colorPelaje = colorPelaje;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void ronronear() {
        System.out.println(getNombre() + " (pelaje " + colorPelaje + ") está ronroneando: purrr...");
    }

    @Override
    public String toString() {
        return "Gato{nombre='" + getNombre() + "', sonido='" + getSonido()
                + "', colorPelaje='" + colorPelaje + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Gato otro = (Gato) o;
        return Objects.equals(colorPelaje, otro.colorPelaje);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), colorPelaje);
    }
}
