package CasoII;

public class Strategy1 implements ICobro {

    @Override
    public float cobro(Cliente cliente) {
        return 0;
    }

    public void total(Cliente cliente){
        System.out.println("$0");
    }
}
