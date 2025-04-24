package school.sptech.controller;

import school.sptech.entity.Banda;
import school.sptech.service.BandaService;

public class BandaController {

    private final BandaService bandaService;

    public BandaController(BandaService bandaService) {
        this.bandaService = bandaService;
    }
}
