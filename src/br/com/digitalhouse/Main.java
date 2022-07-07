package br.com.digitalhouse;

import br.com.digitalhouse.models.Seguidor;
import br.com.digitalhouse.models.Usuario;

public class Main {

    public static void main(String[] args) {
        Usuario usario = new Usuario("Eddie", "Munson");

        Seguidor seguidor1 = new Seguidor("Dustin", "Henderson");
        Seguidor seguidor2 = new Seguidor("Mike", "Wheeler");

        usario.adicionar(seguidor1);
        usario.adicionar(seguidor2);

        usario.subirFoto();
        System.out.println(seguidor1.getContadorNotificacao());
    }
}
