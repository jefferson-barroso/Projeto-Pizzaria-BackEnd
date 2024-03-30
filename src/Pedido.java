import java.util.ArrayList;
public class Pedido {
    private static int proximoNumPedido = 1;
    private int numPedido;
    private Massa massa;
    private Ingrediente ingrediente;

    private static ArrayList<Pedido> listaPedido = new ArrayList<>();

    public Pedido( Massa massa, Ingrediente ingrediente){
        this.numPedido = proximoNumPedido++;
        this.massa = massa;
        this.ingrediente = ingrediente;
    }

    public static void adicionarPedido (Pedido pedido){
        listaPedido.add(pedido);
    }

    public void mostrarPedido(){
        System.out.printf("*Pedido*\n\n");
        System.out.printf("[Número do pedido: %s]\n", numPedido);
        System.out.printf("[Massa: %s]\n", massa.getTipo());
        ingrediente.resultadoContador();
    }

    public void totalDoPedido(){
        System.out.printf("\n*Total do pedido*\n");
        double total = ingrediente.ingredientePrecototal + massa.getPreco();
        System.out.printf("\nR$%.2f\n",total);
    }
}