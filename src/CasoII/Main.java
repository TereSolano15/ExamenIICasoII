package CasoII;

public class Main {
    public static void main(String[] args) {

        CobroManager manager = new CobroManager();
        Cliente cliente1 = new Cliente("Peter",1, "enero");

        System.out.println("---------------------------------------------------------------");
        System.out.print("El pago de "+ cliente1.getNombre() + " en "+ cliente1.getMes() + " es de ");
        manager.returnTotal(cliente1);
        cliente1.setCantDis(20);
       cliente1.setMes("febrero");
       System.out.println("---------------------------------------------------------------");
       System.out.print("El pago de "+ cliente1.getNombre() + " en "+ cliente1.getMes() + " es de ");
        manager.returnTotal(cliente1);
        cliente1.setCantDis(55);
        cliente1.setMes("marzo");
        System.out.println("---------------------------------------------------------------");
        System.out.print("El pago de "+ cliente1.getNombre() + " en "+ cliente1.getMes() + " es de ");
        manager.returnTotal(cliente1);
        cliente1.setCantDis(125);
        cliente1.setMes("abril");
        System.out.println("---------------------------------------------------------------");
        System.out.print("El pago de "+ cliente1.getNombre() + " en "+ cliente1.getMes() + " es de ");
        manager.returnTotal(cliente1);





    }
  /*
   EXPLICACION
     */
}
