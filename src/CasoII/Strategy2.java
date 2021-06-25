package CasoII;

public class Strategy2 implements ICobro {

    @Override
    public float cobro(Cliente c) {
        return (float) (c.getCantDis() * 0.10);
    }

    public void total(Cliente cliente) {
        float total = 0;
        float aux = cobro(cliente);
        if (cliente.getCantDis() < cliente.getDispoAnteriores()) {
            total = (float) (aux + (aux * 0.05));
            System.out.println("$" +cobro(cliente));
            System.out.println("Se ha aplicado un 5% de recargo por disminucion de los dispotivos");
            System.out.println("\t\t\tTotal a pagar: $"+total);

        } else if (cliente.getCantDis() > cliente.dispoAnteriores) {
            total = (float) (aux - (aux * 0.25));
            System.out.println(" $" +cobro(cliente));
            System.out.println("Cantidad de dispositivos: " + cliente.getCantDis());
            System.out.println("Se ha aplicado un descuento de 25% por aumento de dispositivos");
            System.out.println("\t\t\t\tTotal a pagar: $"+total);

        } else if (cliente.getCantDis() == cliente.getCantDis()) {
            System.out.println(aux);
            System.out.println("No tiene recargos o descuentos aplicados");
        }
    }
}
