package com.example.pj1.presentation.productDetails

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ProductDetailsViewModel : ViewModel() {

    private val _quantity = MutableStateFlow(1)
    val quantity: StateFlow<Int> = _quantity.asStateFlow()

    fun increaseQuantity() {
        _quantity.value += 1
    }

    fun decreaseQuantity() {
        if (_quantity.value > 1) {
            _quantity.value -= 1
        }
    }

    fun addToBasket() {
        // TODO: Implement add to basket logic
        // You can access current quantity with _quantity.value
        println("Added ${_quantity.value} items to basket")
    }
}