package CasoII;

public class Strategy1 implements ICobro {

    @Override
    public float cobro(Cliente cliente) {
        return 0;
    }

    public void total(Cliente cliente) {
        System.out.println("gratis por tener menos de 5 dispositivos");
        System.out.println("Cantidad de dispositivos: " + cliente.getCantDis());
        System.out.println("\t\t\t\tTotal a pagar: $0");

    }
}
