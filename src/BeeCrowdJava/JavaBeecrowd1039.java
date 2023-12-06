package BeeCrowdJava;


import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaBeecrowd1039 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double mediaDoAuluno = (((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 + 1));

        System.out.println("Media: " + new DecimalFormat(".#").format(mediaDoAuluno));

        if (mediaDoAuluno > 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (mediaDoAuluno < 5.0) {
            System.out.println("Aluno reprovado.");
        } else if (mediaDoAuluno >= 5.0 && mediaDoAuluno <= 6.9) {
            System.out.println("Aluno em exame.");
            double notaDoExame = sc.nextDouble();
            System.out.println("Nota do exame: " + notaDoExame);
            double notaFinal = (notaDoExame + mediaDoAuluno) / 2;
            String sim = "Aluno aprovado.";
            String nao = "Aluno reprovado.";
            String resultado = notaFinal > 5.0 ? sim : nao;
            System.out.println(resultado);
            System.out.println("Media final: " + new DecimalFormat(".#").format(notaFinal));
        }
    }
}
