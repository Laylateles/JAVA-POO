package estudo_Java;

public class Exercicio2_cinema {
    public static void main(String[] args){
        // usando inferência de tipos -- var
        var nIngressoInt = 8;
        var nIngressoMeia = 5;

        var valorIngressoInt = 30;
        var valorIngressoMeia = 15;

        var totalArrecIngressoInt = nIngressoInt * valorIngressoInt; // valor arrecadado com os ingressos inteiros
        var totalArrecIngressoMeia = nIngressoMeia * valorIngressoMeia;

        var totalArrec = totalArrecIngressoInt + totalArrecIngressoMeia;
        var valMedioIngresso = totalArrec / (nIngressoInt + nIngressoMeia);

        System.out.println("Valor arrecadado com os ingressos inteiros: R$" + totalArrecIngressoInt);
        System.out.println("Valor arrecadado com os ingressos de meia entrada: R$" + totalArrecIngressoMeia);
        System.out.println("Valor total arrecadado na sessão: R$" + totalArrec);// não conseguir colocar para ter 2 casas decimais, acredito que seja por conta de o sistema não entender que é um numero flutuante
        System.out.println("Valor médio pago por ingresso: R$" + valMedioIngresso);
    }
}
