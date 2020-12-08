package org.example.mvvmpractice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    val counter: MutableLiveData<Int> = MutableLiveData(0)

    fun incrementCount(){
        counter.postValue(counter.value?.plus(1))
    }

    fun decrementCount(){
        counter.value?.let {
            if(it > 0){
                counter.postValue(counter.value?.minus(1))
            }
        }
    }
}