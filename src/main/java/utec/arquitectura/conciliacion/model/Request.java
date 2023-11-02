package utec.arquitectura.conciliacion.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import lombok.Data;

import java.sql.Date;

@Data
public class Request {
   private String autorizacion;
   private String codigoComercio;

   @NotNull
   private String fechaProceso;

   @NotNull
   private String estado;

    @NotNull
   private String estadoDevolucion;

    @Override
    public String toString() {
        return "Request{" +
                "autorizacion='" + autorizacion + '\'' +
                ", codigoComercio='" + codigoComercio + '\'' +
                ", fechaProceso=" + fechaProceso +
                ", estado='" + estado + '\'' +
                ", estadoDevolucion='" + estadoDevolucion + '\'' +
                '}';
    }


}
