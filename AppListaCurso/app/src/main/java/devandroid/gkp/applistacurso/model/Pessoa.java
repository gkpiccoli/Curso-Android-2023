package devandroid.gkp.applistacurso.model;

public class Pessoa {

    //Construtor
    //Atributos - Objetos - Molde - Modelo - Template - letraMinuscula
    //Métodos de Acesso - Getters n Setters
    //

    private String primeiroNome;
    private String sobrenome;
    private String cursoDesejado;
    private String telefoneContato;

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCursoDesejado() {
        return cursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        this.cursoDesejado = cursoDesejado;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }
}
