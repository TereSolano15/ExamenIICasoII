package CasoII;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String name;
    int cantDispositivos;
    String mes;
    int dispoAnteriores;

    public Cliente(String name, int cantDispositivos, String mes) {
        this.name = name;
        this.cantDispositivos = cantDispositivos;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCantDispositivos() {
        return cantDispositivos;
    }

    public void setCantDispositivos(int cantDispositivos) {
        this.dispoAnteriores= getCantDispositivos();
        this.cantDispositivos = cantDispositivos;
    }

}
