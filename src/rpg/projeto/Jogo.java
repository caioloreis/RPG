package rpg.projeto;

import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Heroi guerreiro = new Heroi(
                "Guerreiro",
                100,
                20,
                5,
                "Guerreiro",
                1,
                1,
                "Finalizador"
                );
        Heroi mago = new Heroi(
                "Mago",
                80,
                20,
                5,
                "Feiticeiro",
                1,
                2,
                "Bola de Fogo"
                );
        Heroi arqueiro = new Heroi(
                "Arqueiro",
                90,
                18,
                8,
                "Atirador",
                1,
                1,
                "Flechas Congelantes"
        );
        mostrarApresentacoes(guerreiro, mago, arqueiro);

        int menuOpcaoEscolhida = sc.nextInt();
        Heroi heroiSelecionado = selecionarHeroi(menuOpcaoEscolhida, guerreiro, mago, arqueiro);


        Monstro dragao = new Monstro(
                "Dragao",
                100,
                15,
                5,
                2,
                "Cuspir fogo",
                0.2
        );
        dragao.mostrarApresentacao();

        boolean jogoAcabou = false;
        do {
            realizarTurnoDoHeroi(sc, heroiSelecionado, dragao);

            jogoAcabou = vereficarFimJogo(dragao, jogoAcabou);
            System.out.println("");

            heroiSelecionado.mostrarVida();
            dragao.mostrarVida();

            System.out.println("");

            relizarTurnoDragao(dragao, heroiSelecionado);

            System.out.println("");

            heroiSelecionado.mostrarVida();
            dragao.mostrarVida();





        }while (!jogoAcabou);

    }

    private static boolean vereficarFimJogo(Monstro dragao, boolean jogoAcabou) {
        if (dragao.estarMorto()){
            jogoAcabou = true;
            System.out.println("Você eliminou o Dragão !");
        }

        return jogoAcabou;
    }

    private static void relizarTurnoDragao(Monstro dragao, Heroi heroiSelecionado) {
        System.out.println("## TURNO DO DRAGÃO ##");
        dragao.regenerarVida();
        dragao.atacar(heroiSelecionado);
    }

    private static void realizarTurnoDoHeroi(Scanner sc, Heroi heroiSelecionado, Monstro dragao) {
        System.out.println("\n## SEU TURNO ##");
        System.out.println("1 Atacar/ 2. Usar habilidade especial / 3. Beber poçãp de vida");
        int opcaoJogada = sc.nextInt();

        switch (opcaoJogada){
            case 1:
                heroiSelecionado.atacar(dragao);
                break;
            case 2:
                heroiSelecionado.usarAtaqueEspecial(dragao);
                break;
            case 3:
                heroiSelecionado.usarPocaoVida();
                break;

        }
    }

    private static Heroi selecionarHeroi(int menuOpcaoEscolhida,
                                         Heroi guerreiro,
                                         Heroi mago,
                                         Heroi arqueiro) {
        return switch (menuOpcaoEscolhida) {
            case 1 -> guerreiro;
            case 2 -> mago;
            case 3 -> arqueiro;
            default -> null;
        };
    }

    private static void mostrarApresentacoes(Heroi guerreiro, Heroi mago, Heroi arqueiro) {
        System.out.println("Heróis Disponiveis");

        System.out.print("1 - ");
        guerreiro.mostrarApresentacao();

        System.out.print("2 - ");
        mago.mostrarApresentacao();

        System.out.print("3 - ");
        arqueiro.mostrarApresentacao();

        System.out.println("Escolha seu Heroi");
    }
}
