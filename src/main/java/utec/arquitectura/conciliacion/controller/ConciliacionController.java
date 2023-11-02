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

    @ApiOperation(value = "", notes = "")
    @PostMapping("/trxs")
    public List<ConciliacionDominio> getAllTrxs(@RequestBody Request request)
    {
        return conciliacionService.obtenerConciliaciones(request);
    }

}
