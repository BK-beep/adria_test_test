package ma.enset.transfersservice.web;

import ma.enset.transfersservice.entities.Wallet;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "wallet-service")
public interface WalletFeignClient {
    @GetMapping("/api/wallets")
    List<Wallet> getWallets();
    @GetMapping("/api/wallets/{id}")
    Wallet getWalletById(@PathVariable String id);
    @PostMapping("/api/wallets")
    void saveWallet(@RequestBody String wallet);
    @PostMapping("/api/wallets/{id}")
    void updateWallet(@PathVariable String id,@RequestBody String wallet);
    @PostMapping("/api/wallets/{id}/solde")
    void updateSolde(@PathVariable String id, @RequestBody double solde);

}