import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HoraExacta {
    public static void main(String[] args) {
        // Obtener la hora actual
        LocalTime horaActual = LocalTime.now();

        // Formatear la hora en formato de 12 horas con AM/PM
        DateTimeFormatter formato12Horas = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String horaFormateada12Horas = horaActual.format(formato12Horas);
        System.out.println("Hora actual (formato 12 horas): " + horaFormateada12Horas);

        // Formatear la hora en formato de 24 horas
        DateTimeFormatter formato24Horas = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormateada24Horas = horaActual.format(formato24Horas);
        System.out.println("Hora actual (formato 24 horas): " + horaFormateada24Horas);
    }
}
