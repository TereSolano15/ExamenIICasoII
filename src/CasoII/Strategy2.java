package CasoII;

public class Strategy2 implements ICobro {

    //menor a 49 mayor a 6
    @Override
    public double cobro(Cliente c) {
        double pago = 0;

        pago = c.getCantDispositivos() * 0.10;


        return pago;

    }

    public void total(Cliente c){



    }

}
