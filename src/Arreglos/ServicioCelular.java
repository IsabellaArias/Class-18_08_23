package Arreglos;

public class ServicioCelular {
    Cliente cliente; //agregacion de la clase Cliente
    private String phoneNumber;

    public ServicioCelular(Cliente cliente, String phoneNumber) {
        this.cliente = cliente;
        this.phoneNumber = phoneNumber;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "ServicioCelular{" +
                "cliente=" + cliente +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
