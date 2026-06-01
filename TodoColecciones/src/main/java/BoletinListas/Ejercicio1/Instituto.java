package BoletinListas.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<Grupo> grupos;

    public Instituto() {
        this.grupos = new ArrayList<>();
    }

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    public List<Grupo> agregarGrupo(Grupo grupo){
        if (grupo != null && !grupos.contains(grupo)){
            grupos.add(grupo);
        }
        else {
            System.out.println("No se ha podido agregar porque o es nulo, o ya está en la lista");
        }
        return grupos;
    }

    @Override
    public String toString() {
        return "Instituto{" +
                "grupos=" + grupos +
                '}';
    }
}
