package ma.enset.walletservice.web;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import ma.enset.walletservice.entities.Wallet;
import ma.enset.walletservice.services.WalletService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/wallets")

@AllArgsConstructor
public class WalletClient {
    private WalletService walletService;
    @GetMapping
    public List<Wallet> getWallets() {
        return walletService.getWallets();
    }
    @PostMapping
    public void addWallet(@RequestBody Wallet wallet) {
        walletService.addWallet(wallet);
    }
    @DeleteMapping(path = "/{id}")
    public void deleteWallet(@PathVariable String id) {
        walletService.deleteWallet(id);
    }
    @GetMapping(path = "/{id}")
    public Wallet getWallet(@PathVariable String id) {
        return walletService.getWallet(id);
    }
    @PutMapping(path = "/{id}")
    public void updateWallet(@PathVariable String id, @RequestBody Wallet wallet) {
        walletService.updateWallet(id, wallet);
    }
    @PutMapping(path = "/{id}/solde")
    public void updateSolde(@PathVariable String id, @RequestBody double solde) {
        walletService.updateSolde(id, solde);
    }

}
