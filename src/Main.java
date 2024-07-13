import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

            BuscarDivisa consulta = new BuscarDivisa();

            System.out.println("Ingrese divisa base ");
            var divisaSeleccionada = lectura.nextLine();
            System.out.println("Ingrese la divisa a convertir");
            var divisaSeleccionada1 = lectura.nextLine();
            TasaDeCambio tasaDeCambio = consulta.buscaDivisa(divisaSeleccionada, divisaSeleccionada1);
            System.out.println("Ingrese cantidad a convertir");
            int cantidad = lectura.nextInt();
            double cantidadTotal= cantidad * tasaDeCambio.conversion_rate();

            System.out.println("La cantidad convertida de : " + divisaSeleccionada + " a " + divisaSeleccionada1 + " es " + cantidadTotal);



    }
}
