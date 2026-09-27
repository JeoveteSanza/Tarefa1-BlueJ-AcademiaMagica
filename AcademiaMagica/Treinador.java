
/**
 * Escreva uma descrição da classe Treinador aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Treinador
{
    private String nome;
    private int medalhas;
    private CriaturaMagica companheira;

    /**
     * Construtor para objetos da classe Treinador
     */
    public Treinador(String nome, int medalhas, CriaturaMagica companheira)
    {
        this.nome = nome;
        this.medalhas = medalhas;
        this.companheira = companheira.clone();
    }
    
    public Treinador(String nomeTreinador){
        this.nome = nomeTreinador;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getMedalhas(){
        return medalhas;
    }
    
    public void setMedalhas(int medalhas){
        this.medalhas = medalhas;
    }
    
    public CriaturaMagica getCompanheira(){
        return companheira.clone();
    }
    
    public void setCompanheira(CriaturaMagica companheira)
    {
        this.companheira = companheira.clone();
    }
}