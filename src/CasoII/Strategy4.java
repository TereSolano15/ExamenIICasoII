package CasoII;

public class Strategy4 implements ICobro {

    //mayor a 100
    @Override
    public double cobro(Cliente c) {

        double pago = 0;

        pago = c.getCantDispositivos() * 0.05;

        return pago;
    }

    public void total(Cliente c){


    }

}
