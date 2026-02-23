package exercicio2;

public class ex2_aula_introducao {
    public static void main(String[] args){
        int ingressosInteiros = 8; // posso usar var enves de int para não precisar especificar o tipo
        int ingressosMeia = 5;
        double valorIngressoInteiro = 30.00;
        double valorIngressoMeia = 15.00;
        int quantidadeTotalIngressosVendidos = 13;
        double ingressoInteiroVendido = ingressosInteiros * valorIngressoInteiro; // retorna o valor dos ingressos inteiros vendidos
        double ingressoMeiaVendido = ingressosMeia * valorIngressoMeia;// valor do ingresso de meia-entrada
        double valorTotalArrecadado = ingressoInteiroVendido + ingressoMeiaVendido; // retorna o valor total vendido na sessão
        double mediaValorPagoIngressos = (ingressoInteiroVendido + ingressoMeiaVendido)/quantidadeTotalIngressosVendidos;

        System.out.println("Total arrecadado com ingressos inteiros: " + ingressoInteiroVendido);
        System.out.println("Total arrecadado com meia-entrada: " + ingressoMeiaVendido);
        System.out.println("Total arrecado na sessão: " + valorTotalArrecadado);
        System.out.println("Valor médio pago por ingresso: " + mediaValorPagoIngressos);
    }
}
