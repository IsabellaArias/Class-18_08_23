package Arreglos;

public class Cliente {
    private String name;
    private int identification;

    public Cliente(String name, int identification) {
        this.name = name;
        this.identification = identification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdentification() {
        return identification;
    }

    public void setIdentification(int identification) {
        this.identification = identification;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "name='" + name + '\'' +
                ", identification=" + identification +
                '}';
    }
}
