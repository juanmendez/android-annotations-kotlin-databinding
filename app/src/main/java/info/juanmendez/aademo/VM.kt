package info.juanmendez.aademo

import android.databinding.BaseObservable
import android.databinding.Bindable

/**
 * Created by juan on 2/5/18.
 */
class VM : BaseObservable(){

    private var msg:String = ""

    var message: String
    @Bindable get()= msg
    set(value) {
        msg = value
        notifyPropertyChanged(BR.message)
    }

}