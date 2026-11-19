package com.example.myapplication.uicontroller.route

import com.example.myapplication.R
import com.example.myapplication.view.uicontroller.DestinasiNavigasi

object DestinasiEditSiswa : DestinasiNavigasi {
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "idsiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
}