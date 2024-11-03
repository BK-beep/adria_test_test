package ma.enset.walletservice.services;

import lombok.RequiredArgsConstructor;
import ma.enset.walletservice.entities.Wallet;
import ma.enset.walletservice.repos.WalletRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WalletService {
    private final WalletRepository walletRepository;
    public List<Wallet> getWallets(){
        return walletRepository.findAll();
    }
    public void addWallet(Wallet wallet){
        walletRepository.save(wallet);
    }
    public void deleteWallet(String id){
        walletRepository.deleteById(id);
    }
    public Wallet getWallet(String id){
        return walletRepository.findById(id).orElse(null);
    }
    public void updateWallet(String id, Wallet wallet){
        wallet.setId(id);
        walletRepository.save(wallet);
    }
    public void updateSolde(String id, double solde){
        Wallet wallet = walletRepository.findById(id).orElse(null);
        wallet.setSolde(solde);
        walletRepository.save(wallet);
    }
}
