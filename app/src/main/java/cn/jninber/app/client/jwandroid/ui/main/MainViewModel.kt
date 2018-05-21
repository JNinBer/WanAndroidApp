package cn.jninber.app.client.jwandroid.ui.main

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import android.view.View

class MainViewModel : ViewModel() {

    val _count = MutableLiveData<Int>()

    init {
        _count.postValue(1)
    }

    fun update(view: View) {
        _count.value = _count.value?.plus(1)
    }

}
