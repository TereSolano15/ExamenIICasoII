package CasoII;

public class Strategy1 implements ICobro {

    @Override
    public double cobro(Cliente cliente) {
        return 0;
    }

    public void total(Cliente cliente){
        double aux = cobro(cliente);
        double total = 0;

        if(cliente.getCantDispositivos() < cliente.getDispoAnteriores()){

            total= aux + (metodoDeCobro(b) * 0.05);

            System.out.println("cantidad total a pagar: " + total + "$");

        }else if(c.getCantDispositivos() > b.getCantDispositivos()){

            total = aux - (metodoDeCobro(b) * 0.25);

            System.out.println("cantidad total a pagar: " + total + "$");

        }else if(c.getCantDispositivos() == b.getCantDispositivos()){

            System.out.println("cantidad total a pagar: " + aux + "$");

        }

    }

}
