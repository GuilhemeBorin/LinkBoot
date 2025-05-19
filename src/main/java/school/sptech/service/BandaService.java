package school.sptech.service;

import org.springframework.stereotype.Service;
import school.sptech.repository.BandaRepository;

@Service
public class BandaService {
    private final BandaRepository bandaRepository;

    public BandaService(BandaRepository bandaRepository) {
        this.bandaRepository = bandaRepository;
    }
}
