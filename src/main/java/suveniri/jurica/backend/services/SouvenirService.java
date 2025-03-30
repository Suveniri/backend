package suveniri.jurica.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import suveniri.jurica.backend.dto.SouvenirUpdateDto;
import suveniri.jurica.backend.models.Souvenir;
import suveniri.jurica.backend.repositories.SouvenirRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SouvenirService {

    @Autowired
    private SouvenirRepository souvenirRepository;

    public ResponseEntity<List<Souvenir>> getSouvenirs() {
        return new ResponseEntity<>(souvenirRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Souvenir> addSouvenir(Souvenir souvenir) {
        souvenir.setSold(0);
        return new ResponseEntity<>(souvenirRepository.save(souvenir), HttpStatus.CREATED);
    }

    public ResponseEntity<Souvenir> getSouvenir(Long id) {
        Optional<Souvenir> souvenirOptional = souvenirRepository.findById(id);
        if (souvenirOptional.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        Souvenir souvenir = souvenirOptional.get();
        return new ResponseEntity<>(souvenir, HttpStatus.OK);
    }

    public ResponseEntity<Souvenir> updateSouvenir(SouvenirUpdateDto request, Long id) {
        Optional<Souvenir> souvenirOptional = souvenirRepository.findById(id);
        if (souvenirOptional.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        Souvenir updatedSouvenir = souvenirOptional.get();
        updatedSouvenir.setName(request.getName());
        updatedSouvenir.setPrice(request.getPrice());
        updatedSouvenir.setOrdered(request.getOrdered());

        int newBatch = request.getNewBatch() != null ? request.getNewBatch() : 0;
        updatedSouvenir.setSold(request.getSold() + newBatch);

        souvenirRepository.save(updatedSouvenir);
        return new ResponseEntity<>(updatedSouvenir, HttpStatus.OK);
    }
}
