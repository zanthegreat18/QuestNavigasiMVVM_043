package com.tugas.cobaapk.ui.viewmodel


import androidx.lifecycle.ViewModel
import com.tugas.cobaapk.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {

    private val _dataModel = MutableStateFlow(Mahasiswa())

    val dataModel: StateFlow<Mahasiswa> = _dataModel.asStateFlow()

    fun saveDataMhs(
        listData : MutableList<String>
    ){
        _dataModel.update { mhs ->
            mhs.copy(
                nama = listData[0],
                nim = listData[1],
                gender = listData[2],
                alamat = listData[3],
                email = listData[4],
                notelepon = listData[5]
            )
        }
    }
}