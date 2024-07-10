package prova.controller;

import jakarta.annotation.security.RolesAllowed;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import prova.entities.Especializacao;

import prova.service.EspecializacaoService;

import java.util.List;

@Path("/especializacao")
public class EspecializacaoController {

    @Inject
    private EspecializacaoService especializacaoService;

    @GET
    @RolesAllowed("admin")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Especializacao> listar() {
        return especializacaoService.listar();
    }
}
