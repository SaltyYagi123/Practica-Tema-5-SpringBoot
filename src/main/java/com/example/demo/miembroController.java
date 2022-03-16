package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class miembroController {
    @GetMapping("/miembros") // Cuando pongamos /miembros en explorador
                                // se va a ejecutar la funcion getmiembros
    public String getMiembros() {
        return "Lista de miembros";
    }

    // En caso de que queramos enviar información
    // Dependiendo del metodo vamos a hacer get o post que se ejecute x funcion
    @PostMapping("/miembros")
    public Miembro postMiembros(@RequestBody Miembro estudiante) {
        return estudiante; //Lo devuelve como un JSON a solas 
    }

}
