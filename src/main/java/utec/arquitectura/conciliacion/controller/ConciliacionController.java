package utec.arquitectura.conciliacion.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import utec.arquitectura.conciliacion.dominio.ConciliacionDominio;
import utec.arquitectura.conciliacion.model.Request;
import utec.arquitectura.conciliacion.service.ConciliacionService;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value = "ConciliacionRest", produces = "application/json", tags = {"Controlador Conciliacion"})
public class ConciliacionController {

    @Autowired
    private ConciliacionService conciliacionService;

    @ApiOperation(value = "Lista las Trxs", notes = "")
    @GetMapping("/trxs")
    public List<ConciliacionDominio> getAllTrxs(@RequestParam String codigoComercio,@RequestParam String autorizacion,@RequestParam String estado,
                                                @RequestParam String estadoDevolucion,@RequestParam String fechaProcesoInicio,@RequestParam String fechaProcesoFin
                                                )
    {
        return conciliacionService.obtenerConciliaciones(codigoComercio, autorizacion, estado, estadoDevolucion, fechaProcesoInicio, fechaProcesoFin);
    }

}
