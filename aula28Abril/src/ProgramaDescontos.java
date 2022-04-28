import java.util.Scanner;

public class ProgramaDescontos {


    public static double calculaSomatorioDescontos2(Produto[] produtos){

        double soma = 0;
        for(int k=0; k<produtos.length; k++){
            Produto p = produtos[k];
            double valorProduto = p.getPreco();
            if (valorProduto<50){
                soma+=0;
            } else if (valorProduto<100){
                soma+= valorProduto*0.05;
            } else {
                soma += valorProduto * 0.10;
            }
        }
        return soma;


    }

    public static double calculaSomatorioDescontos(Produto [] produtos){
        double soma = 0;
        for(int k=0; k<produtos.length; k++){
            Produto p = produtos[k];
            double desconto = calculaValorDoDesconto(p.getPreco());
            soma+= desconto;
        }
        return soma;
    }

    public static double calculaTotalDaCompraSemDescontos(Produto[] produtos){
        double soma = 0.0;
        for (int k=0; k< produtos.length; k++){
            soma+= produtos[k].getPreco();
        }
        return soma;
    }

    public static double calculaValorDoDesconto(double valorProduto){
        if (valorProduto<50){
            return 0.0;
        } else if (valorProduto<100){
            return valorProduto*0.05;
        } else {
            return  valorProduto*0.10;
        }
    }

    public static double calculaValorComDesconto(double valorProduto){
        if (valorProduto<50){
            return valorProduto;
        } else if (valorProduto<100){
            return valorProduto - valorProduto*0.05;
        } else {
            return valorProduto - valorProduto*0.10;
        }
    }

    public static String verificaProdutoComMaiorDesconto(Produto [] produtos){
        if (produtos.length==0){
            return "Sem produtos a verificar";
        } else {
            Produto produtoComMaiorDesconto = produtos[0];
            double maiorDesconto = calculaValorDoDesconto(produtoComMaiorDesconto.getPreco());

            for (int k=1; k< produtos.length; k++){
                Produto p = produtos[k];
                double desconto = calculaValorDoDesconto(p.getPreco());
                if (desconto>maiorDesconto){
                    produtoComMaiorDesconto = p;
                }
            }

            return produtoComMaiorDesconto.getNome();

        }

    }

    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quantos produtos você quer comprar?");
        int quant = Integer.parseInt(leitor.nextLine());
        Produto [] produtos = new Produto[quant];
        for (int k=0; k<quant; k++){
            Produto p = new Produto();
            System.out.println("Qual o nome do produto?");
            p.setNome(leitor.nextLine());
            System.out.println("Qual o preço original do produto?");
            p.setPreco(Double.parseDouble(leitor.nextLine()));
            produtos[k] = p;
            //System.out.println("O nome do produto adicionado foi "+ produtos[k].getNome());
            double valorComDesconto = calculaValorComDesconto(p.getPreco());
            System.out.printf("O valor a pagar pelo produto é R$ %.2f\n", valorComDesconto);
        }

        System.out.println("A feira sem descontos custou:"
                + calculaTotalDaCompraSemDescontos(produtos));
        System.out.println("O somatório de descontos foi de R$"
                + calculaSomatorioDescontos(produtos));
        leitor.close();
    }
}
