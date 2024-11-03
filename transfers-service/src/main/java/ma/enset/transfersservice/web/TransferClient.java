package ma.enset.transfersservice.web;

import lombok.RequiredArgsConstructor;
import ma.enset.transfersservice.entities.Transfer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/transfers")
@RequiredArgsConstructor
public class TransferClient{
    @GetMapping
    public String getTransfers() {
        return "Transfers";
    }
    @GetMapping(path = "/{id}")
    public String getTransferById(String id) {
        return "Transfer " + id;
    }
    @PostMapping
    public String saveTransfer(@RequestBody Transfer transfer) {

        return "Transfer ";
    }


}
