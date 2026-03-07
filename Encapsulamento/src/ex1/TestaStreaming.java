package ex1;
public class TestaStreaming {
    public static void main(String[] args) {
    Streaming s1 = new Streaming("Isaac", "Premium");
        System.out.println(s1);

        s1.assistirFilme("Fight Club");
        System.out.println("\nDepois de assistir: ");
        System.out.println(s1);

        s1.cancelarAssinatura();

        s1.assistirFilme("Drive");
        System.out.println("\nDepois de cancelar:");
        System.out.println(s1);

    }
}
