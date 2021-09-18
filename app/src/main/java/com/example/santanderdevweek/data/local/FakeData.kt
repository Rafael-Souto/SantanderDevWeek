package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Olá, Rafael")
        val cartao = Cartao("0626")

        return Conta(
            "123123-0",
            "0101",
            "R$ 2.450,90",
            "R$ 4.500,00",
            cliente,
            cartao
        );
    }
}