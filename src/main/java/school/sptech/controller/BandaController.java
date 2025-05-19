package school.sptech.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.sptech.service.BandaService;

@RestController
@RequestMapping("/banda")
public class BandaController {

    private final BandaService bandaService;

    public BandaController(BandaService bandaService) {
        this.bandaService = bandaService;
    }
}
