package CasoII;

public class Cliente {
    String nombre;
    int cantDis;
    String mes;
    int dispoAnteriores;

    public Cliente(String nombre, int cantDis, String mes) {
        this.nombre = nombre;
        this.cantDis = cantDis;
        this.mes = mes;
        this.dispoAnteriores=0;
    }

    public int getDispoAnteriores() {
        return dispoAnteriores;
    }

    public void setDispoAnteriores(int dispoAnteriores) {
        this.dispoAnteriores = dispoAnteriores;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantDis() {
        return cantDis;
    }

    public void setCantDis(int cantDis) {
        this.dispoAnteriores= getCantDis();
        this.cantDis = cantDis;
    }

}
