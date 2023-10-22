package application;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        Iphone iphone = new Iphone();

        int opcao;

        do {
            System.out.println("""


                    Selecione uma opção no menu:\s

                    1: Efetuar ligação\s
                    2: Atender ligação\s
                    3: Iniciar correio de voz\s
                    4: Exibir página\s
                    5: Adicionar nova aba\s
                    6: Atualizar página\s
                    7: Tocar música\s
                    8: Música pausada\s
                    9: Música selecionada\s
                    0: Desligar""");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    iphone.ligar();
                    Thread.sleep(1000);
                    break;

                case 2:
                    iphone.atender();
                    Thread.sleep(1000);
                    break;

                case 3:
                    iphone.iniciarCorreioVoz();
                    Thread.sleep(1000);
                    break;
                case 4:
                    iphone.exibirPagina();
                    Thread.sleep(1000);
                    break;
                case 5:
                    iphone.adicionarNovaAba();
                    Thread.sleep(1000);
                    break;
                case 6:
                    iphone.atualizarPagina();
                    Thread.sleep(1000);
                    break;
                case 7:
                    iphone.tocar();
                    Thread.sleep(1000);
                    break;
                case 8:
                    iphone.pausar();
                    Thread.sleep(1000);
                    break;
                case 9:
                    iphone.selecionarMusica();
                    Thread.sleep(1000);
                    break;
                case 0:
                    System.out.println("Desligando o aparelho");
                    Thread.sleep(1000);
                    break;
                default:
                    System.out.println("Opção inválida! Insira um número de 0 a 9.");
                    Thread.sleep(1000);
            }
        } while (opcao != 0);

        scanner.close();
    }
}

