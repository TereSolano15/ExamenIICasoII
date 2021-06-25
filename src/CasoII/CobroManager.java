package CasoII;

public class CobroManager {

    public void returnTotal(Cliente cliente) {
        int cant = cliente.getCantDis();
        if (cant > 0 && cant < 6) {
            ICobro dis0to5 = new Strategy1();
            dis0to5.total(cliente);
        } else if (cant > 5 && cant < 50) {
            ICobro dis6to49 = new Strategy2();
            dis6to49.total(cliente);
        } else if (cant > 49 && cant < 100) {
            ICobro dis50to99 = new Strategy3();
            dis50to99.total(cliente);
        } else if (cant > 100) {
            ICobro dis100 = new Strategy4();
            dis100.total(cliente);
        } else
            System.out.println("No tiene dispositivos");
    }
}
