package CasoII;

public class Strategy3 implements ICobro {

    //menor a 99 mayor a 50
    @Override
    public double cobro(Cliente c) {

        double pago =0;

        pago = c.getCantDispositivos() * 0.07;

        return pago;
    }

    public void total(Cliente c) {

    }

}
