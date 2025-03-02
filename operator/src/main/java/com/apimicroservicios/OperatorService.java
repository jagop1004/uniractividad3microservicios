package com.apimicroservicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apimicroservicios.Datos.Datos;

@Service
public class OperatorService {

    @Autowired
    private OperatorRepository operadorRepository;

    public Object obtenerDatos(Long id) {
        // Lógica para obtener datos desde la base de datos
        return operadorRepository.findById(id).orElseThrow(() -> new OperatorException("Datos no encontrados"));
    }

    public Object insertarDatos(Datos datos) {
        //falta agregar logica para poder leer de elastic el movie id y agregarlo a datos para esribirlo en posgre


        // Lógica para insertar datos en la base de datos
        operadorRepository.save(datos);
        return datos;
    }

    public Object actualizarDatos(Long id, Datos datos) {
        // Lógica para actualizar datos en la base de datos
        if (!operadorRepository.existsById(id)) {
            throw new OperatorException("Datos no encontrados para actualizar");
        }
        //datos.setId(id);
        operadorRepository.save(datos);
        return datos;
    }

    public void eliminarDatos(Long id) {
        // Lógica para eliminar datos de la base de datos
        if (!operadorRepository.existsById(id)) {
            throw new OperatorException("Datos no encontrados para eliminar");
        }
        operadorRepository.deleteById(id);
    }
}
