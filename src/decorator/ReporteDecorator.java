package decorator;

import component.Reporte;

public class ReporteDecorator implements Reporte {
    protected final Reporte reporte;

    public ReporteDecorator(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public String generar() {
        return this.reporte.generar();
    }

    @Override
    public String getdescripcion() {
        return this.reporte.getdescripcion();
    }
}
