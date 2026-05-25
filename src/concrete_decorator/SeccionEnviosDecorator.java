package concrete_decorator;

import component.Reporte;
import decorator.ReporteDecorator;

public class SeccionEnviosDecorator extends ReporteDecorator {
    public SeccionEnviosDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String getdescripcion() {
        return reporte.getdescripcion() + " + Descripcion";
    }

    @Override
    public String generar() {
        return reporte.generar() + "\nDestino de los envios: \nVenta A: Lima \nVenta B: Lambayeque \nVenta C: Piura";
    }
}
