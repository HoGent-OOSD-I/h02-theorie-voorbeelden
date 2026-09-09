void main() {

    double amount;                    // saldo op het einde van elk jaar
    double principal = 1000.0;        // beginkapitaal
    double rate = 0.05;               // rente

    IO.println(String.format("%4s%20s","Year","Amount on deposit"));

    for (int year = 1; year <= 10; year++) {
        amount = principal * Math.pow(1.0 + rate, year);

        IO.println(String.format("%4d%,20.2f",year, amount));
    }
}