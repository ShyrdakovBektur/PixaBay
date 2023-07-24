package com.itproger.pixabay.retrofit


data class PixaModel(
    var hits: ArrayList<ImageModel>
)

data class ImageModel(
    var largeImageURL: String
)

