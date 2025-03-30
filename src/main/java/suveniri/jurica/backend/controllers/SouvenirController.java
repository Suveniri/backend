package suveniri.jurica.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import suveniri.jurica.backend.dto.SouvenirUpdateDto;
import suveniri.jurica.backend.models.Souvenir;
import suveniri.jurica.backend.services.SouvenirService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/souvenirs")
public class SouvenirController {

    @Autowired
    private SouvenirService souvenirService;

    @GetMapping
    public ResponseEntity<List<Souvenir>> getSouvenirs() {
        return souvenirService.getSouvenirs();
    }

    @PostMapping
    public ResponseEntity<Souvenir> addSouvenir(@RequestBody Souvenir souvenir) {
        return souvenirService.addSouvenir(souvenir);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Souvenir> getSouvenir(@PathVariable Long id) {
        return souvenirService.getSouvenir(id);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Souvenir> updateSouvenir(
            @RequestBody SouvenirUpdateDto request,
            @PathVariable Long id) {
        return souvenirService.updateSouvenir(request, id);
    }
}
