package prova.controller;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import prova.entities.Casa;
import prova.service.CasaService;


import java.util.List;

@Path("/casa")
public class Casacontroller {

    @Inject
    private CasaService casaService;

    @GET
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Casa> listar() {
        return casaService.listaCasas();
    }
}
