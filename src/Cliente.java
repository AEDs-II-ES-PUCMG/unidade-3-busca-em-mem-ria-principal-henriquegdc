public class Cliente {

	private static int ultimoID = 10_000;
    private String nome;
    private int documento;


    /**
     * Construtor do cliente. Cria um novo cliente a partir do nome informado.
     * TODO: utilize obrigatoriamente o método setNome para atribuir o nome ao cliente.
     * TODO: atribua ao cliente um número de documento gerado sequencialmente a partir
     * do contador estático ultimoID (e incremente o contador).
     */
    public Cliente (String nome) {
    	this.setNome(nome);
        this.documento = ++ultimoID;
    }

    public String getNome() {
    	return this.nome;
    }

    /**
     * Atribui ao cliente o nome informado como parâmetro.
     * TODO: esse nome deve conter, pelo menos, duas palavras; caso contrário,
     * lance a exceção adequada (IllegalArgumentException).
     */
    public void setNome(String nome) {
        if(nome.split(" ").length < 2)
            throw new IllegalArgumentException("O nome deve conter pelo menos duas palavras.");
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Cliente [nome=" + nome + ", documento=" + documento + "]";
    }

    @Override
    public int hashCode(){
    	return this.documento;
    }
}
