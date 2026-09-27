import java.util.ArrayList;

public class GuildaMagica {

    private String nome;
    private ArrayList<CriaturaMagica> criaturas;

    public GuildaMagica(String nome) {
        this.nome = nome;
        this.criaturas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionarCriatura(CriaturaMagica criatura) {
        if (criatura != null) {
            criaturas.add(criatura.clone());
        }
    }

    public boolean removerCriatura(String nome) {
        for (int i = 0; i < criaturas.size(); i++) {
            if (criaturas.get(i).getNome().equalsIgnoreCase(nome)) {
                criaturas.remove(i);
                return true;
            }
        }
        return false;
    }

    public int quantidade() {
        return criaturas.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Guilda: ").append(nome).append(" (").append(quantidade()).append(" criaturas)\n");
        for (CriaturaMagica c : criaturas) {
            sb.append(" - ").append(c).append("\n");
        }
        return sb.toString();
    }

    public boolean existeCriatura(String nome) {
        for (CriaturaMagica c : criaturas) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public CriaturaMagica procurarCriatura(String nome) {
        for (CriaturaMagica c : criaturas) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c.clone();
            }
        }
        return null;
    }

    public CriaturaMagica criaturaMaisForte() {
        if (criaturas.isEmpty()) {
            return null;
        }
        CriaturaMagica maisForte = criaturas.get(0);
        for (CriaturaMagica c : criaturas) {
            if (c.getNivel() > maisForte.getNivel()) {
                maisForte = c;
            }
        }
        return maisForte.clone();
    }

    public GuildaMagica clone() {
        GuildaMagica copia = new GuildaMagica(this.nome);
        for (CriaturaMagica c : this.criaturas) {
            copia.adicionarCriatura(c);
        }
        return copia;
    }
}