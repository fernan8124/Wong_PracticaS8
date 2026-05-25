import component.Reporte;
import concrete_component.ReporteBase;
import concrete_decorator.SeccionEnviosDecorator;
import concrete_decorator.SeccionGraficoDecorator;
import concrete_decorator.SeccionTotalesDecorator;

public class Main {
    public static void main(String[] args) {
        //Primer Reporte
        Reporte r1 = new ReporteBase();
        imprimir(r1);
        //Segundo Reporte con totales
        Reporte r2 = new SeccionTotalesDecorator(new ReporteBase());
        imprimir(r2);
        //Tercer Reporte con grafico y totales
        Reporte r3 = new SeccionGraficoDecorator(new SeccionTotalesDecorator(new ReporteBase()));
        imprimir(r3);
        //Cuarto Reporte con envios, graficos y totales
        Reporte r4 = new SeccionEnviosDecorator(new SeccionGraficoDecorator(new SeccionTotalesDecorator(new ReporteBase())));
        imprimir(r4);
    }

    //Imprimir
    static void imprimir(Reporte reporte){
        System.out.println("Tipo de reporte: " + reporte.getdescripcion());
        System.out.println(reporte.generar());
        System.out.println("======================");
    }
}
