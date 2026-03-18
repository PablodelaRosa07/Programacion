public class Fechas {
    /* import java.time.LocalDate;
public class CreacionFechas {
    public static void main(String[] args) {
        // 1. Fecha actual (now)
        LocalDate hoy = LocalDate.now();
              // 2. Fecha específica (of) -> Año, Mes, Día
    // Nota: ¡Aquí Enero es 1! Mucho más intuitivo.
        LocalDate finDeCurso = LocalDate.of(2024, 6, 21);
            }}




    import java.time.LocalDate;
public class CreacionFechas {
    public static void main(String[] args) {
        // Creación de un String  Desde un texto (parse)
        // Formato estándar ISO-8601 (Año-Mes-Día)
        LocalDate diaProgramador = LocalDate.parse("2024-09-13");
        System.out.println("Día del programador: " + diaProgramador);
            }}




    import java.time.LocalDate;
public class CreacionFechas {
    public static void main(String[] args) {
      LocalDate fechaExamen = LocalDate.of(2024, 5, 15);
        // Extraer partes de la fecha
        int anio = fechaExamen.getYear();
        Month mes = fechaExamen.getMonth(); // Devuelve un objeto Enum (MAY)
int mesInt = fechaExamen.getMonthValue();
        int diaMes = fechaExamen.getDayOfMonth();
        // Día de la semana (Lunes, Martes...)
        String diaSemana = fechaExamen.getDayOfWeek().toString();
            }}




    LocalDate entregaProyecto = LocalDate.of(2024, 6, 1);
LocalDate hoy = LocalDate.now();
if (hoy.isAfter(entregaProyecto)) {
System.out.println("¡Alerta! Has entregado tarde el proyecto."); }
else if (hoy.isBefore(entregaProyecto)) {
System.out.println("Tranquilo, aún tienes tiempo."); }
else {
 	System.out.println("¡Hoy es el día de entrega! Corre."); }




       // Sumar 2 semanas
    LocalDate enDosSemanas = hoy.plusWeeks(2);
    // Restar 3 días
    LocalDate haceTresDias = hoy.minusDays(3);
    // "Setter" inmutable: Mantener mes y día, cambiar año
    LocalDate mismoDiaAnioPasado = hoy.withYear(2023);




        LocalDate fecha = LocalDate.now();
    // 1. De Fecha a Texto (Formatear)
    DateTimeFormatter formatoEsp = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     String textoBonito = fecha.format(formatoEsp);
    System.out.println("Fecha para el usuario: " + textoBonito);

    // 2. De Texto a Fecha (Parsear con formato específico)
    String inputUsuario = "25/12/2024";
    LocalDate navidad = LocalDate.parse(inputUsuario, formatoEsp);
    System.out.println("Objeto fecha recuperado: " + navidad);




    // 1. Momento actual (Fecha + Hora + Nanosegundos)
 LocalDateTime ahora = LocalDateTime.now();

    // 2. Momento específico
    // Año, Mes, Día, Hora, Minuto (y opcionalmente segundos)
     LocalDateTime inicioClase = LocalDateTime.of(2024, Month.SEPTEMBER, 15, 8, 30);

    // 3. Parseo (Ojo al formato con la 'T')
    LocalDateTime fichaje = LocalDateTime.parse("2024-11-02T08:00:00");




    LocalDateTime citaMedico = LocalDateTime.of(2024, 10, 10, 10, 00);
        // La cita se retrasa 45 minutos
        LocalDateTime nuevaHora = citaMedico.plusMinutes(45);

        // O me la cambian al día siguiente a la misma hora
        LocalDateTime diaSiguiente = citaMedico.plusDays(1);

        // Restar horas
        LocalDateTime recordatorio = citaMedico.minusHours(2); // Avisar 2h antes







     */
}
