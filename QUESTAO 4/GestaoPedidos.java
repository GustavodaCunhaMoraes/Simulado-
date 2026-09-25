import java.util.List;
import java.util.ArrayList;

public class GestaoPedidos {
    private List<String> pedidos;

    public GestaoPedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPedido(String item) {
        this.pedidos.add(item);
    }

    public String proximoPedido() {
        if (this.pedidos.isEmpty()) {
            return "Fila vazia";
        }
        return this.pedidos.remove(0);
    }

    public int quantidadePendentes() {
        return this.pedidos.size();
    }

    public void listarPedidos() {
        if (this.pedidos.isEmpty()) {
            System.out.println("Nenhum pedido cadastrado.");
        } else {
            for (int i = 0; i < this.pedidos.size(); i++) {
                System.out.println(this.pedidos.get(i));
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        GestaoPedidos sistema = new GestaoPedidos();

        sistema.adicionarPedido("Pizza");
        sistema.adicionarPedido("sanduiche");
        sistema.adicionarPedido("coca");

        System.out.println("Pedidos pendentes: " + sistema.quantidadePendentes());
        System.out.println("--- Lista de Pedidos ---");
        sistema.listarPedidos();

        System.out.println("\nAtendendo: " + sistema.proximoPedido());
        System.out.println("Pedidos restantes: " + sistema.quantidadePendentes());
    }
}
