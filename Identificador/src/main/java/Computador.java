import java.util.ArrayList;
import java.util.Scanner;

public class Computador {
    private String marca;
    private String modelo;
    ArrayList<RAM> ram;

    public Computador(String marca, String modelo, ArrayList<RAM> ram) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ArrayList<RAM> getRam() {
        return ram;
    }

    public void setRam(ArrayList<RAM> ram) {
        this.ram = ram;
    }
}
