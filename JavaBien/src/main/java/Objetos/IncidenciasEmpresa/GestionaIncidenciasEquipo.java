package Objetos.IncidenciasEmpresa;

public class GestionaIncidenciasEquipo {

    private static Incidente[] incidencias = new Incidente[5];
    private static int contador = 0;

    public static void main(String[] args) {

        Usuario u1 = new Usuario("123A", "Pablo", "Informatica");
        Usuario u2 = new Usuario("456B", "Isidro", "Informatica");
        Usuario u3 = new Usuario("789C", "Pepe", "Informatica");
        Usuario u4 = new Usuario("321D", "Jose", "Informatica");

        Equipo equipo1 = new Equipo("AB1234", "PcPablo", 0, "Windows 11", u1);
        Equipo equipo2 = new Equipo("CD1234", "PcIsidro", 1, "Mac OS", u2);
        Equipo equipo3 = new Equipo("EF1234", "PcPepe", 1, "Linux", u3);
        Equipo equipo4 = new Equipo("GH1234", "PcJose", 2, "Windows 10", u4);

        Incidente i1 = new Incidente("GRAVE", "Falla RAM", equipo4, "REGISTRADA","", "1-1-2025", 1, "FalloRAM");
        Incidente i2 = new Incidente("LEVE", "Falla HDMI", equipo2, "ANALIZADA","", "2-2-2025", 2, "FalloHDMI");
        Incidente i3 = new Incidente("MEDIA", "Falla VGA", equipo3, "EN RESOLUCIÓN","", "3-3-2025", 3, "FalloVGA");
        Incidente i4 = new Incidente("CRITICA", "Falla CPU", equipo4, "CERRADA","30-4-2025", "4-4-2025", 4, "FalloCPU");

        agregarIncidencia(i1);
        agregarIncidencia(i2);
        agregarIncidencia(i3);
        agregarIncidencia(i4);

        imprimirTodas();
        imprimirUrgentes();
    }

    public static void agregarIncidencia(Incidente i) {
        if (contador < incidencias.length) {
            incidencias[contador] = i;
            contador++;
        }
    }

    public static void imprimirTodas() {
        System.out.println("--- TODAS LAS INCIDENCIAS ---");
        for (int i = 0; i < contador; i++) {
            System.out.println(incidencias[i]);
        }
    }

    public static void imprimirUrgentes() {
        System.out.println("--- INCIDENCIAS URGENTES ---");
        for (int i = 0; i < contador; i++) {
            if (incidencias[i].esUrgente()) {
                System.out.println(incidencias[i]);
            }
        }
    }
}