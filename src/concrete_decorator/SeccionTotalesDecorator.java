package concrete_decorator;

import component.Reporte;
import decorator.ReporteDecorator;

public class SeccionTotalesDecorator extends ReporteDecorator {
    public SeccionTotalesDecorator(Reporte reporte) {
        super(reporte);
    }

    @Override
    public String getdescripcion() {
        return super.getdescripcion() + " + Total";
    }

    @Override
    public String generar() {
        return super.generar() + "\nTotal de ventas: S/1100";
    }
}
