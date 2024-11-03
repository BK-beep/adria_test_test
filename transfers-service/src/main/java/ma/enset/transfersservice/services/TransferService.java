package ma.enset.transfersservice.services;

import lombok.RequiredArgsConstructor;
import ma.enset.transfersservice.entities.Wallet;
import ma.enset.transfersservice.web.WalletFeignClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransferService {
    private final WalletFeignClient walletFeignClient;
    public void transfer(String from, String to, double amount) {
        Wallet source=walletFeignClient.getWalletById(from);
        Wallet destination=walletFeignClient.getWalletById(to);
        if(source.getSolde()>=amount){
            source.setSolde(source.getSolde()-amount);
            destination.setSolde(destination.getSolde()+amount);
            walletFeignClient.updateSolde(source.getId(),source.getSolde());
            walletFeignClient.updateSolde(destination.getId(),destination.getSolde());
        }
    }
}
