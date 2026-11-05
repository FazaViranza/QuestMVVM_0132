package com.example.p8.viewmodel

import com.example.p8.model.Siswa
import kotlinx.coroutines.flow.StateFlow

class SiswaViewModel {
    private val_statusUI = MutableStateFlow(Siswa())
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa(ls:MutaleList<string>){
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(nama=ls[0], gender=ls[1], alamat=ls[3])
        }
    }
}