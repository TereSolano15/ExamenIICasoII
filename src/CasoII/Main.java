package CasoII;

public class Main {
    public static void main(String[] args) {

        ICobro dis0to5 = new Dis0to5();
        ICobro dis6to49 = new Dis6to49();
        ICobro dis50to99 = new Dis50to99();
        ICobro dis100 = new Dis100();

        Cliente cliente1 = new Cliente("Jazmin",15, "enero");
        Cliente cliente2 = new Cliente("Antonio",40, "octubre");
        Cliente cliente3= new Cliente("Andres",25,"junio");

        System.out.println("---------------------------------------------------------------");
        System.out.print("El cobro de" + cliente1.getCantDis()+" Dispositos "+ cliente1.getNombre() + " en "+ cliente1.getMes() + " es de" );
        dis6to49.total(cliente1);
       cliente1.setCantDis(20);
       cliente1.setMes("Febrero");
       System.out.println("---------------------------------------------------------------");
       System.out.print("El pago de "+ cliente1.getNombre() + " en "+ cliente1.getMes() + " es de ");
        dis6to49.total(cliente1);
        cliente1.setCantDis(55);
        cliente1.setMes("Marzo");
        System.out.println("---------------------------------------------------------------");
        System.out.print("El pago de "+ cliente1.getNombre() + " en "+ cliente1.getMes() + " es de ");
        dis50to99.total(cliente1);





    }
  /*
   EXPLICACION
     */
}
