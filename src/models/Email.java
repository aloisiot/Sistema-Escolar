package models;

public class Email {

    private String email;
    private EmailTipo tipo;

    public Email(String email, EmailTipo tipo) {
        this.email = email;
        this.tipo = tipo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EmailTipo getTipo() {
        return tipo;
    }

    public void setTipo(EmailTipo tipo) {
        this.tipo = tipo;
    }
}
