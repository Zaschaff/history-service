package edu.iu.tariqnb.historyservice.controllers;

import edu.iu.tariqnb.historyservice.model.PrimesRecord;
import edu.iu.tariqnb.historyservice.repository.PrimesHistoryRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/primes")
public class PrimesHistorycontroller {
    private final PrimesHistoryRepository primesHistoryRepository;
    public PrimesHistorycontroller(
            PrimesHistoryRepository primesHistoryRepository)
    {
        this.primesHistoryRepository=primesHistoryRepository;
    }
    @GetMapping("/{customer}")
    public List<PrimesRecord> findAll(@PathVariable String
                                      customer){
        return primesHistoryRepository.findAllByCustomer(customer);
    }
}
