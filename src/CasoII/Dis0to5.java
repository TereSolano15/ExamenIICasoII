package CasoII;

public class Dis0to5 implements ICobro {

    @Override
    public float cobro(Cliente cliente) {
        return 0;
    }

    public void total(Cliente cliente){
        if(cliente.getCantDis() < cliente.getDispoAnteriores()) {
            System.out.println("Total a pagar: $0");
        }

    }
}
