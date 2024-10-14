public class perro {

    private String anombre;
    private String araza;
    private int aedad;

    public perro() {
    }

    public String getNombre() {
        return this.anombre;
    }

    public void setNombre(String nombre) {
        this.anombre = nombre;
    }

    public String getRaza() {
        return this.araza;
    }

    public void setRaza(String raza) {
        this.araza = raza;
    }

    public int getEdad() {
        return this.aedad;
    }

    public void setEdad(int edad) {
        this.aedad = edad;
    }

    public void comer(String tipoComida, double cantidad) {
        System.out.println(this.anombre + " está comiendo " + cantidad + " gramos de " + tipoComida + ".");
    }

    public String ladrar() {
        return "guau guau";
    }
}
