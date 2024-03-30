import java.util.Scanner;
public class PizzaV4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador;
        int escolha;
        int escolha2;
        Massa massa = new Massa(null, 0, 0);
        Ingrediente ingrediente = new Ingrediente(null, 0, 0);

        System.out.printf("Escolha o tamanho da massa, digite: \n");
        Massa.tabelaPreco();

        while (true) {
            if (scanner.hasNextInt()) {
                escolha = scanner.nextInt();
                massa = Massa.tamanhoDaMassa(escolha);
                if (massa != null) {
                    break;
                } else {
                    System.out.printf("Escolha uma opção válida, digite:\n");
                    Massa.tabelaPreco();
                }
            } else {
                System.out.printf("Escolha uma opção válida, digite:\n");
                Massa.tabelaPreco();
                scanner.next();
            }
        }
        contador = massa.getFatias();

        for (int i = 1; i <= contador; i++) {
            System.out.printf("Escolha o ingrediente para a (%d/%d) fatia, digite:\n", i, contador);
            System.out.println();
            Ingrediente.tabelaPreco();
        
            while (true) {
                if (scanner.hasNextInt()) {
                    escolha2 = scanner.nextInt();
                    if (escolha2 >= 1 && escolha2 <= Ingrediente.getListaIngrediente().size()) {
                        Ingrediente.escolhaIngrediente(Ingrediente.getListaIngrediente(),escolha2);
                        break; 
                    }
                    else{
                        System.out.printf("Escolha inválida, digite novamente:\n");
                        System.out.println();
                        Ingrediente.tabelaPreco();
                    }    
                }
                else {
                    System.out.printf("Escolha inválida, digite novamente:\n");
                    System.out.println();
                    Ingrediente.tabelaPreco();
                    scanner.next();
                }
            }
        }

        System.out.println();
        Pedido pedido = new Pedido(massa, ingrediente);
        Pedido.adicionarPedido(pedido);
        System.out.println();
        pedido.mostrarPedido();
        pedido.totalDoPedido();
        scanner.close();
    }
}