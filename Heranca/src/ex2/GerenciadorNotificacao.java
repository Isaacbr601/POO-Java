package ex2;

import java.util.ArrayList;

public class GerenciadorNotificacao {
    public static void main(String[] args) {
        ArrayList<CanalNotificacao> lista = new ArrayList<>();

        lista.add(new Email("email@email.com", "Mensagem Email", "Assunto ADS"));
        lista.add(new SMS("João", "Mensagem SMS", 16999999));
        lista.add(new WhatsApp("Maria", "Mensagem Zap", "visualizado"));

        for (CanalNotificacao c : lista) {
            c.enviar();
        }
    }
}
