package concrete_decorator;

import component.Reporte;
import decorator.ReporteDecorator;

public class SeccionGraficoDecorator extends ReporteDecorator {

    public SeccionGraficoDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String getdescripcion() {
        return super.getdescripcion() + " + Grafico";
    }

    @Override
    public String generar() {
        return super.generar() + "\nGrafico: grafico de barras tuneado";
    }
}
