package br.unipar.teste;

import br.unipar.interfaces.InterfaceAnimais;

public class Gato implements InterfaceAnimais {
    @Override
    public String emitirSom() {
        return "miaumiau";
    }

    @Override
    public void correr() {
        Integer velocidade = 20;
    }

    @Override
    public void alimentacao() {

    }
}
