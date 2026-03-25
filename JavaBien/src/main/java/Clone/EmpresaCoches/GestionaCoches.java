package Clone.EmpresaCoches;

public class GestionaCoches implements Cloneable{
    static void main(String[] args) {
        Motor motor1 = new Motor(Combustible.GASOLINA, 100, true);
        Motor motor2 = motor1.clone();

        motor2.setCombustible(Combustible.DIESEL);

        System.out.println(motor1);
        System.out.println(motor2);


        Coche coche1 = new Coche(1200, "1234ABC", "Toyota", motor1);
        Coche coche2 = coche1.clone();

        coche2.setMotor(motor2);
        coche2.getMotor().setCv(300);


        System.out.println(coche1);
        System.out.println(coche2);

    }
}
