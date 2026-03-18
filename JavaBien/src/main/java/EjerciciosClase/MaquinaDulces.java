package EjerciciosClase;

public class MaquinaDulces {
    static void main(String[] args) {
        int[][] inventario = {{5, 0, 8},{2, 10, 0},{0, 4, 1}};
        MaquinaDulces referencia = new MaquinaDulces();
        int contadorCeros = 0;

        int contadordeCeros = referencia.detectarCeros(inventario, contadorCeros);
        referencia.contabilizaAgotados(inventario, contadordeCeros);

    }

    int detectarCeros(int[][] inventario, int contadorCeros){
        for (int i = 0; i < inventario.length; i++) {
            for (int j = 0; j < inventario[i].length; j++) {
                if (inventario[i][j] == 0){
                    System.out.println("¡Alerta! Producto agotado en la Fila " + i + ", Columna " + j);
                    contadorCeros = contadorCeros+1;
                }
            }
        }
        return contadorCeros;
    }

    void contabilizaAgotados(int[][] inventario, int contadordeCeros){
        System.out.println("Hay " + contadordeCeros + " huecos");
    }
}
