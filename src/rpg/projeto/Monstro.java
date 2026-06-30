package rpg.projeto;

public class Monstro extends Personagem {

    private int qtdRegeneracao;
    private String nomePoderEspecial;
    private double multiplciadorDanoEspecial;


    public Monstro(String nome, int vida, int ataque, int defesa, int qtdRegeneracao, String nomePoderEspecial, double multiplciadorDanoEspecial) {
        super(nome, vida, ataque, defesa);
        this.qtdRegeneracao = qtdRegeneracao;
        this.nomePoderEspecial = nomePoderEspecial;
        this.multiplciadorDanoEspecial = multiplciadorDanoEspecial;
    }

    public void regenerarVida(){

        this.vida += qtdRegeneracao;
    }

    @Override
    public void atacar(Personagem alvo) {
       boolean viraAtaqueEspecial = this.executarJogadaEspecial();
       if (viraAtaqueEspecial){
           this.usarAtaqueEspecial(alvo);
       }else{
           super.atacar(alvo);
       }
    }

    @Override
    public void mostrarApresentacao() {
        System.out.println(this.nome +" " +
                "(Vida: "+ this.vida+", " +
                "Ataque: "+ this.ataque +", " +
                "Defesa: "+this.defesa +"  , " +
                "Regeração de vida: "+this.qtdRegeneracao +"  , " +
                "Poder Especial: "+this.nomePoderEspecial +"  , ");

    }

    @Override
    public void usarAtaqueEspecial(Personagem alvo) {
        boolean executarJogadaEspecial = this.executarJogadaEspecial();

        if(executarJogadaEspecial){
            int danoEspecial = this.ataque + (int) (this.ataque * this.multiplciadorDanoEspecial);
            alvo.receberDano(danoEspecial);

            System.out.println(this.nome + ": Ataque especial [" + this.nomePoderEspecial + "] realizado !");

        }else {
            System.out.println(this.nome + ": GRRAAAHHHHH !!!! Você deu sorte ! ");
        }

    }
}
