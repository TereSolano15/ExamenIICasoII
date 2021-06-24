package CasoII;

public class Main {
    public static void main(String[] args) {

        ICobro strategy1 = new Strategy1();
        ICobro strategy2 = new Strategy2();
        ICobro strategy3 = new Strategy3();
        ICobro strategy4 = new Strategy4();

        Cliente cliente1 = new Cliente("Jazmin",15, "Enero");
        Cliente cliente2 = new Cliente("Antonio",40, "Octubre");
        Cliente cliente3= new Cliente("Andres",25,"Junio");



        System.out.println("Andre el mes de enero paga: " +  strategy2.cobro(cliente1) + "$");
     //   System.out.println("Andrea el mes de febrero paga: "); strategy2.result(cliente1,client1_2);
       // System.out.println("Andrea el mes de marzo paga: "); strategy3.result(client1_2,client1_2_3);


        System.out.println("segunda prueba");

        System.out.println("Pedro el mes de Enero paga: " + strategy1.cobro(cliente2));
     //   System.out.println("Pedro el mes de Febrero paga: "); strategy2.result(cliente2,client2_3);
       // System.out.println("Pedro el mes de Marzo paga: "); strategy4.result(client2_3,client2_3_4);

    }
  /*
   EXPLICACION
     */
}
