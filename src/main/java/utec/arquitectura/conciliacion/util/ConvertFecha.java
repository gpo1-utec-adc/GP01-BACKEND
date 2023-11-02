package utec.arquitectura.conciliacion.util;

import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class ConvertFecha {

    public static Date convertFechaToDate(String fecha)
    {
        Date fechaDate = null;
        try {
            String pattern = "yyyy-MM-dd";
            SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            fechaDate =  simpleDateFormat.parse(fecha);
        }catch (Exception ex)
        {
            log.error("Error al parse fecha");
        }
        return fechaDate;
    }
}
