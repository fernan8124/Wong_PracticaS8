package concrete_component;

import component.Reporte;

public class ReporteBase implements Reporte {

    @Override
    public String generar() {
        return "1. Venta A - S/250 \n2. Venta B - S/350 \n3. Venta C - S/500";
    }

    @Override
    public String getdescripcion() {
        return "Reporte base";
    }
}
