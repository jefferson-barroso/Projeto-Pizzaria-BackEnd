import java.util.ArrayList;
public class Ingrediente {
    private String nome;
    private double preco;
    public int contadorIngrediente;
    public double ingredientePrecototal;

    private static ArrayList<Ingrediente> listaIngrediente = new ArrayList<>();

    public Ingrediente(String nome, double preco, int contadorIngrediente){
        this.nome = nome;
        this.preco = preco;
        this.contadorIngrediente = 0;
    }

    public String getNome(){
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    static {
        Ingrediente calabresa = new Ingrediente("Calabresa", 3.50,0);
        Ingrediente frango = new Ingrediente("Frango", 2.50,0);
        Ingrediente azeitona = new Ingrediente("Azeintona", 1.50,0);
        listaIngrediente.add(calabresa);
        listaIngrediente.add(frango);
        listaIngrediente.add(azeitona);
    }

    public static ArrayList<Ingrediente> getListaIngrediente() {
        return listaIngrediente;
    }

    public static void adicionarIngrediente(Ingrediente ingrediente){
        listaIngrediente.add(ingrediente);
    }

    public static void tabelaPreco (){
        System.out.printf("*Lista de ingredientes*\n\n");
        int i = 0;
        for (Ingrediente ingrediente : Ingrediente.getListaIngrediente()) {
            i ++;
            System.out.printf("%d - [Nome: %s, Preço: R$%.2f]\n",i ,ingrediente.getNome(),ingrediente.getPreco());

        }
    }

    public void contadorDeIngredientes(){
        this.contadorIngrediente++;
    }

    public double getIngredientePrecoTotal(){
        return ingredientePrecototal;
    }

    public static void escolhaIngrediente(ArrayList<Ingrediente> lIngredientes, int escolha){
            Ingrediente ingredienteEscolhido = listaIngrediente.get(escolha - 1);
            ingredienteEscolhido.contadorDeIngredientes();
            System.out.println("Você escolheu o ingrediente número " + escolha + ": " + ingredienteEscolhido.getNome());
            System.out.println();
    }

    public void resultadoContador(){
        for(Ingrediente ingrediente: listaIngrediente){
            if (ingrediente.contadorIngrediente == 0) {
                
            }
            else{
                System.out.println("["+ingrediente.contadorIngrediente+"X "+ingrediente.getNome()+"]");
                double i = ingrediente.contadorIngrediente * ingrediente.getPreco();
                ingredientePrecototal += i;
            }
        }
    } 
}