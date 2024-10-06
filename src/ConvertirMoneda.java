import java.util.Scanner;

public class ConvertirMoneda {
    public static void convertir(String monedaBase,
                                 String monedaTarget,
                                 ConsultarMoneda consulta,
                                 Scanner lectura) {
        double cantidad;
        double cantidadConvertida;

        Monedas moneda = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("Hoy la tasa de conversión es \n" + monedaBase + "=" + moneda.convertirRate() + " " + monedaTarget);
        System.out.println("Ingrese la cantidad de " + monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad + moneda.convertirRate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertida + " " + moneda.targetCode());

    }
}
