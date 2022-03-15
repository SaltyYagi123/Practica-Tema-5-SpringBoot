package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class estudianteController {
    @GetMapping("/estudiantes") // Cuando pongamos /estudiantes en explorador
                                // se va a ejecutar la funcion getEstudiantes
    public String getEstudiantes() {
        return "Lista de Estudiantes";
    }

    // En caso de que queramos enviar información
    // Dependiendo del metodo vamos a hacer get o post que se ejecute x funcion
    @PostMapping("/estudiantes")
    public Estudiante postEstudiantes(@RequestBody Estudiante estudiante) {
        estudiante.setAge(20);
        return estudiante; //Lo devuelve como un JSON a solas 
    }

}
