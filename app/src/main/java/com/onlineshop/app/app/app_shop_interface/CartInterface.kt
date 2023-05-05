package com.onlineshop.app.app.app_shop_interface

import com.onlineshop.app.app.app_models.AppCartItemAddedModel

interface CartInterface {
    fun addCart(cartItemAddedModel: AppCartItemAddedModel)
}
