package com.example.myapplication.uicontroller.route

import com.example.myapplication.R
import com.example.myapplication.view.uicontroller.DestinasiNavigasi

object DestinasiDetailSiswa : DestinasiNavigasi {
    override val route = "item_detail"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "idsiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}