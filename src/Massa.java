import java.util.ArrayList;
public class Massa {
    private String tipo;
    private int fatias;
    private double precoMassa;

    private static ArrayList<Massa> listaMassa = new ArrayList<>();

    static{
        Massa massaPequena = new Massa("Massa Pequena", 4, 3.50);
        Massa massaMedia = new Massa("Massa Média", 6, 4.50);
        Massa massaGrande = new Massa("Massa Grande", 8, 5.50);
        listaMassa.add(massaPequena);
        listaMassa.add(massaMedia);
        listaMassa.add(massaGrande);
    }

    public static ArrayList<Massa> getListaMassa(){
        return listaMassa;
    }

    public Massa(String tipo, int fatias, double precoMassa){
        this.tipo = tipo;
        this.fatias = fatias;
        this.precoMassa = precoMassa;
    }

    public String getTipo(){
        return tipo;
    }

    public int getFatias(){
        return fatias;
    }

    public double getPreco(){
        return precoMassa;
    }

    public static void tabelaPreco (){
        System.out.printf("\n*Lista de massas*\n\n");
        int i = 0;
        for (Massa massa : Massa.getListaMassa()) {
            i ++;
            System.out.printf("%d - [Nome: %s, Fatias:%d Preço: R$%.2f]\n",i ,massa.getTipo(),massa.getFatias(),massa.getPreco());
        }
    }

    public static Massa tamanhoDaMassa(int tamanhoSelecionado) {
        if (tamanhoSelecionado >= 1 && tamanhoSelecionado <= listaMassa.size()) {
            return listaMassa.get(tamanhoSelecionado - 1);
        } else {
            return null;
        }
    }
}