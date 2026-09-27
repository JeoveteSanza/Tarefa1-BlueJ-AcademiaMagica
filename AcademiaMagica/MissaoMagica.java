
/**
 * Escreva uma descrição da classe MissaoMagica aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class MissaoMagica
{
    private String titulo;
    private Treinador treinador;
    private CriaturaMagica adversario;
    private int nivelMinimo;

    /**
     * Construtor para objetos da classe MissaoMagica.
     * Guarda copias independentes do treinador e do adversario,
     * para que alteracoes feitas fora da missao nao a afetem.
     */
    public MissaoMagica(String titulo, Treinador treinador, CriaturaMagica adversario, int nivelMinimo)
    {
        this.titulo = titulo;
        this.treinador = treinador.clone();
        this.adversario = adversario.clone();
        this.nivelMinimo = nivelMinimo;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public Treinador getTreinador()
    {
        return treinador.clone();
    }

    public void setTreinador(Treinador treinador)
    {
        this.treinador = treinador.clone();
    }

    public CriaturaMagica getAdversario()
    {
        return adversario.clone();
    }

    public void setAdversario(CriaturaMagica adversario)
    {
        this.adversario = adversario.clone();
    }

    public int getNivelMinimo()
    {
        return nivelMinimo;
    }

    public void setNivelMinimo(int nivelMinimo)
    {
        this.nivelMinimo = nivelMinimo;
    }

    /**
     * A missao pode comecar quando existe uma companheira,
     * esta tem energia suficiente e o seu nivel atinge o minimo exigido.
     */
    public boolean podeIniciar()
    {
        CriaturaMagica companheira = treinador.getCompanheira();
        if(companheira == null)
        {
            return false;
        }
        
        boolean temEnergia = companheira.energia() >= 20;
        boolean temNivel = companheira.getNivel() >= nivelMinimo;
        
        return temEnergia && temNivel;
    }

    /**
     * Compara o nivel da companheira com o nivel do adversario
     * e preve o resultado da missao.
     */
    public String preverResultado()
    {
        CriaturaMagica companheira = treinador.getCompanheira();
        if(companheira == null)
        {
            return "Sem companheira, a missao nao pode ser avaliada";
        }
        
        int nivelCompanheira = companheira.getNivel();
        int nivelAdversario = adversario.getNivel();
        
        if(nivelCompanheira > nivelAdversario)
        {
            return "Vantagem para a companheira";
        }
        else if(nivelCompanheira < nivelAdversario)
        {
            return "Vantagem para o adversario";
        }
        else
        {
            return "Missao equilibrada";
        }
    }

    public String toString()
    {
        return "Missao: " + titulo + 
               "\nNivel minimo: " + nivelMinimo + 
               "\nTreinador: \n" + treinador + 
               "\nAdversario: \n" + adversario + 
               "\nPrevisao: " + preverResultado();
    }

    /**
     * Cria uma copia independente da missao, com um novo treinador
     * e novas criaturas, para que alteracoes a copia nao afetem
     * a missao original.
     */
    public MissaoMagica clone()
    {
        return new MissaoMagica(titulo, treinador, adversario, nivelMinimo);
    }
}
