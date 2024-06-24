public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String message) {
        super(message);
    }

    public char[] getMessage(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Saldo insuficiente para transferência.");
    }
}
