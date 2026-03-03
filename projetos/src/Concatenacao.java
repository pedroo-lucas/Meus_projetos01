public class Concatenacao {
    public static void main(String[] args){
        System.out.println();

        /*char letra = 'A';

        String palavra = "A";
        System.out.println(palavra);

        double precoProduto = 3.50;
        int quantidade = 4;

        int multiplicado = (int) (precoProduto * quantidade);
        System.out.println(multiplicado);

        double valorEmDolares = 50;
        double valorEmReais = (valorEmDolares * 4.94);
        System.out.println(String.format("O valor é %.2f",valorEmReais));

         */

        double precoOriginal = 100.00;
        double percentualDesconto = 0.12;

        double precofinal = precoOriginal - (precoOriginal * percentualDesconto);
        System.out.println("O preço com desconto:" + precofinal);

    }
}
