package entities;

public class Quarto {
    private int numberQuarto;
    private String nameClient;
    private String emailClient;

    public Quarto(int numberQuarto, String nameClient, String emailClient) {
        this.numberQuarto = numberQuarto;
        this.nameClient = nameClient;
        this.emailClient = emailClient;
    }

    public String toString() {
        return this.numberQuarto + ": " + this.nameClient + ", " + this.emailClient;
    }
}
