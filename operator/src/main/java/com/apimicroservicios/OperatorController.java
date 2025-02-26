package com.apimicroservicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.apimicroservicios.Datos.Datos;


@RestController
@RequestMapping("/operador")
public class OperatorController {

    @Autowired
    private OperatorService operadorService;

    @GetMapping("/obtener/{id}")
    public ResponseEntity<Object> obtenerDatos(@PathVariable Long id) {
        return ResponseEntity.ok(operadorService.obtenerDatos(id));
    }

    @PostMapping("/insertar")
    public ResponseEntity<Object> insertarDatos(@RequestBody Datos datos) {
        return ResponseEntity.ok(operadorService.insertarDatos(datos));
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Object> actualizarDatos(@PathVariable Long id, @RequestBody Datos datos) {
        return ResponseEntity.ok(operadorService.actualizarDatos(id, datos));
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Object> eliminarDatos(@PathVariable Long id) {
        operadorService.eliminarDatos(id);
        return ResponseEntity.noContent().build();
    }
}
