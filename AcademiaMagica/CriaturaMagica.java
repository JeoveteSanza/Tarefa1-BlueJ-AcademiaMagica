
/**
 * Escreva uma descrição da classe CriaturaMagica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CriaturaMagica
{
    private String nome;
    private String especie;
    private int nivel;
    private int energia;

    /**
     * Construtor para objetos da classe CriaturaMagica
     */
    public CriaturaMagica()
    {
        nome = "Sem nome";
        especie = "Desconhecido";
        nivel = 1;
        energia = 100;
    }
    
    public CriaturaMagica(String nome, String especie, int nivel, int energia)
    {
        this.nome = nome;
        this.especie = especie;
        this.nivel = nivel;
        this.energia = energia;
    }

    
    public String getNome()
    {
        return nome;
    }
    
    public String getEspecie()
    {
        return especie;
    }
    
    public int getNivel()
    {
        return nivel;
    }
    
    public int energia()
    {
        return energia;
    }
    
    public void setNome(String novoNome)
    {
        this.nome = novoNome;
    }
    
    public void setEspecie(String novaEspecie)
    {
        this.especie = novaEspecie;
    }
    
    public void setNivel(int novoNivel)
    {
        if(novoNivel < 1 || novoNivel > 100)
        {
            System.out.println("Nivel invalido, por favor insira um nivel entre 1 e 100");
        }
        else{
            this.nivel = novoNivel;
        }
    }
    
    public void setEnergia(int novaEnergia)
    {
        if(novaEnergia < 1 || novaEnergia > 100)
        {
            System.out.println("Nivel invalido, por favor insira energia entre 1 e 100");
        }
        else{
        this.energia = novaEnergia;
    }
    }
    
    public String toString()
    {
        return "Nome: " + nome + 
               " \nEspecie: " + especie + 
               " \nNivel: " +  nivel + 
               " \nEnergia: " + energia;
    }
    
    public void Descansar(){
        if((energia + 20) > 100)
        {
            this.energia = energia + (100 - energia);
            
        }
        else{
            this.energia = energia + 20;
            
        }
    }
    
    public void Treinar(){
        if(energia < 20){
            System.out.println("Precisa de 20 de energia para poder treinar, descanse");
        }
        else if((nivel + 1) > 10){
            this.nivel = 10;
        }
        else{
            this.nivel = nivel +1;
            this.energia = energia - 20;
        }
    }
    
   public CriaturaMagica clone()
   {
       return new CriaturaMagica(nome, especie, nivel, energia);
   }
    
   
}