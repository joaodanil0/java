import java.util.Scanner;

public class FolhaPagamento{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    double valorHora = scanner.nextDouble();
    int quantidadeHoras = scanner.nextInt();

    double salarioBruto = valorHora * quantidadeHoras;
    double impostoRenda = salarioBruto * 0.11;
    double inss = salarioBruto * 0.08;
    double desconto = impostoRenda + inss;
    double salarioLiquido = salarioBruto - desconto;

    System.out.format("Salario bruto: R$%.2f\nIR: R$%.2f\nINSS: R$%.2f\nTotal de descontos: R$%.2f\nSalario liquido: R$%.2f\n", salarioBruto, impostoRenda, inss, desconto, salarioLiquido);

    //System.out.print(str);

  }
}
