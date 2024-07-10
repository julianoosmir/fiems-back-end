package prova.controller;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import prova.entities.Registro;
import prova.service.RegistroService;

import java.util.List;

@Path("/registro")
public class RegistroController {

    @Inject
    private RegistroService registroService;

    @GET
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Registro> listar() {
        return registroService.listar();
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public void registrar(Registro registro) {
        registroService.registrar(registro);
    }
}
