package entities;

public class ContaCorrente {
    int numberConta;
    String clientConta;
    double saldo;

    public ContaCorrente(int numberConta, String clientConta) {
        this.numberConta = numberConta;
        this.clientConta = clientConta;
    }

    public String toString() {
		return "Account "
                + this.numberConta
                + ", Holder: "
                + this.clientConta
                + ", Balance: $ " + String.format("%.2f\n\n", this.saldo);
	}

	public void deposit(double deposito) {
        this.saldo += deposito;
    }

    public void withdraw(double saque) {
        this.saldo = (this.saldo - saque) - 5.00;
    }

}
