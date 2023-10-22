package application;

import service.AparelhoTelefonico;
import service.NavegadorInternet;
import service.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico , ReprodutorMusical, NavegadorInternet {
    @Override
    public void ligar() {
        System.out.println("\n Fazendo ligacão! \n");
    }

    @Override
    public void atender() {
        System.out.println("\n Atendendo ligação! \n");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("\n Iniciando correio de voz! \n");
    }

    @Override
    public void exibirPagina() {
        System.out.println("\n Exibindo página! \n");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("\n Adicionando nova aba! \n");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("\n Atualizando página! \n");
    }

    @Override
    public void tocar() {
        System.out.println("\n Tocando música! \n");
    }

    @Override
    public void pausar() {
        System.out.println("\n Música pausada! \n");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("\n Música selecionada! \n");
    }
}
