
/**
 * AppAcademia - programa de teste da Academia de Criaturas Magicas.
 * Constroi e testa todo o modelo (CriaturaMagica, Treinador, GuildaMagica,
 * MissaoMagica) sem pedir dados ao utilizador.
 * 
 * @author (seu nome)
 * @version (um numero da versao ou uma data)
 */
public class AppAcademia
{
    public static void main(String[] args)
    {
        // ---------- 50. Criar pelo menos quatro criaturas diferentes ----------
        System.out.println("=== Criaturas criadas ===");
        CriaturaMagica flama = new CriaturaMagica("Flama", "Dragao", 5, 80);
        CriaturaMagica aqua = new CriaturaMagica("Aqua", "Serpente", 3, 90);
        CriaturaMagica pedra = new CriaturaMagica("Pedra", "Golem", 7, 60);
        CriaturaMagica sombra = new CriaturaMagica("Sombra", "Fantasma", 4, 100);

        System.out.println(flama);
        System.out.println(aqua);
        System.out.println(pedra);
        System.out.println(sombra);

        // ---------- 51. Criar dois treinadores e atribuir-lhes companheiras ----------
        System.out.println("\n=== Treinadores criados ===");
        Treinador ana = new Treinador("Ana", 2, flama);
        Treinador bruno = new Treinador("Bruno", 5, aqua);

        System.out.println(ana);
        System.out.println(bruno);

        // ---------- 52. Criar uma guilda e adicionar pelo menos tres criaturas ----------
        System.out.println("\n=== Guilda criada ===");
        GuildaMagica guilda = new GuildaMagica("Guilda dos Bravos");
        guilda.adicionarCriatura(flama);
        guilda.adicionarCriatura(aqua);
        guilda.adicionarCriatura(pedra);

        System.out.println(guilda);

        // ---------- 53. Pesquisar uma criatura existente e outra inexistente ----------
        System.out.println("=== Pesquisas na guilda ===");
        CriaturaMagica encontrada = guilda.procurarCriatura("Flama");
        CriaturaMagica naoEncontrada = guilda.procurarCriatura("Fenix");

        System.out.println("Pesquisa por 'Flama' (existe): " + guilda.existeCriatura("Flama"));
        System.out.println(encontrada);
        System.out.println("Pesquisa por 'Fenix' (existe): " + guilda.existeCriatura("Fenix"));
        System.out.println("Resultado da pesquisa por 'Fenix': " + naoEncontrada);

        // ---------- 54. Criar uma missao com treinador, adversario e nivel minimo ----------
        System.out.println("\n=== Missao criada ===");
        MissaoMagica missao = new MissaoMagica("Resgate na Floresta Negra", ana, sombra, 4);
        System.out.println(missao);

        // ---------- 55. Apresentar o resultado previsto da missao ----------
        System.out.println("\n=== Resultado previsto ===");
        System.out.println("A missao pode iniciar? " + missao.podeIniciar());
        System.out.println("Previsao: " + missao.preverResultado());

        // ---------- 56. Clonar uma criatura, um treinador, uma guilda e uma missao ----------
        CriaturaMagica clonePedra = pedra.clone();
        Treinador cloneAna = ana.clone();
        GuildaMagica cloneGuilda = guilda.clone();
        MissaoMagica cloneMissao = missao.clone();

        // ---------- 57. Alterar os clones e provar que os originais nao mudaram ----------
        System.out.println("\n=== Antes de alterar os clones ===");
        System.out.println("Pedra (original): \n" + pedra);
        System.out.println("Ana (original): \n" + ana);
        System.out.println("Guilda (original), quantidade: " + guilda.quantidade());
        System.out.println("Missao (original), titulo: " + missao.getTitulo());

        // Alterar o clone da criatura
        clonePedra.setNome("Pedra-Clone");
        clonePedra.setNivel(10);

        // Alterar o clone do treinador (incluindo a sua companheira)
        cloneAna.setNome("Ana-Clone");
        CriaturaMagica companheiraDoClone = cloneAna.getCompanheira();
        companheiraDoClone.setNome("Flama-Clone");
        cloneAna.setCompanheira(companheiraDoClone);

        // Alterar o clone da guilda
        cloneGuilda.setNome("Guilda-Clone");
        cloneGuilda.adicionarCriatura(sombra);

        // Alterar o clone da missao
        cloneMissao.setTitulo("Missao-Clone");
        cloneMissao.setNivelMinimo(9);

        System.out.println("\n=== Depois de alterar os clones ===");
        System.out.println("Pedra (clone): \n" + clonePedra);
        System.out.println("Ana (clone): \n" + cloneAna);
        System.out.println("Guilda (clone), quantidade: " + cloneGuilda.quantidade());
        System.out.println("Missao (clone), titulo: " + cloneMissao.getTitulo());

        System.out.println("\n=== Prova de que os originais nao mudaram ===");
        System.out.println("Pedra (original continua igual): \n" + pedra);
        System.out.println("Ana (original continua igual): \n" + ana);
        System.out.println("Guilda (original continua com " + guilda.quantidade() + " criaturas): \n" + guilda);
        System.out.println("Missao (original mantem o titulo): " + missao.getTitulo()
                            + " e nivel minimo: " + missao.getNivelMinimo());

        // ---------- 58. Usar toString para apresentar os objetos ----------
        System.out.println("\n=== Apresentacao final com toString ===");
        System.out.println(missao);
    }
}
