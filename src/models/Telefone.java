package models;

public class Telefone {

    private String numero;
    private TelefoneTipo tipo;

    public Telefone(String numero, TelefoneTipo tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TelefoneTipo getTipo() {
        return tipo;
    }

    public void setTipo(TelefoneTipo tipo) {
        this.tipo = tipo;
    }

    public static boolean validate(Telefone t) {
        if(t == null || t.getNumero() == "" || t.getNumero().length() > 12 || !t.getNumero().matches("[0-9]+"))
            return false;

        return true;
    }
}
