package com.cihancelik.accounts.mapper;

import com.cihancelik.accounts.dto.AccountsDto;
import com.cihancelik.accounts.entity.Accounts;

public class AccountsMapper {

    // Bu metot, Accounts entity'sini (varlığı) DTO'ya dönüştürür.
    // Parametre olarak bir Accounts entity ve AccountsDto alır ve DTO'ya veriyi aktarır.
    public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto){
        // Entity'deki hesap numarasını DTO'ya atıyoruz
        accountsDto.setAccountNumber(accounts.getAccountNumber());

        // Entity'deki hesap türünü DTO'ya atıyoruz
        accountsDto.setAccountType(accounts.getAccountType());

        // Entity'deki şube adresini DTO'ya atıyoruz
        accountsDto.setBranchAddress(accounts.getBranchAddress());

        // Tamamlanan DTO'yu döndürüyoruz
        return accountsDto;
    }

    // Bu metot, AccountsDto'yu Entity'ye dönüştürür.
    // Parametre olarak AccountsDto ve boş bir Accounts entity alır, veriyi Entity'ye aktarır.
    public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts){
        // DTO'daki hesap numarasını Entity'ye atıyoruz
        accounts.setAccountNumber(accountsDto.getAccountNumber());

        // DTO'daki hesap türünü Entity'ye atıyoruz
        accounts.setAccountType(accountsDto.getAccountType());

        // DTO'daki şube adresini Entity'ye atıyoruz
        accounts.setBranchAddress(accountsDto.getBranchAddress());

        // Tamamlanan Entity'yi döndürüyoruz
        return accounts;
    }
}