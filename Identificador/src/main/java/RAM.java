import java.util.Scanner;

public class RAM {
    private String marca;
    private int capacidad;
    private int frecuencia;

    public RAM(String marca, int capacidad, int frecuencia) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.frecuencia = frecuencia;
    }

    public String getMarca() {
        Scanner tec = new Scanner(System.in);
        marca = tec.next();
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        Scanner tec = new Scanner(System.in);
        capacidad = tec.nextInt();
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getFrecuencia() {
        Scanner tec = new Scanner(System.in);
        frecuencia = tec.nextInt();
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }
}
