package info.juanmendez.aademo

import android.support.v7.app.AppCompatActivity
import info.juanmendez.aademo.databinding.ActivityMainBinding
import org.androidannotations.annotations.AfterViews
import org.androidannotations.annotations.BindingObject
import org.androidannotations.annotations.DataBound
import org.androidannotations.annotations.EActivity

@DataBound
@EActivity(R.layout.activity_main)
class MainActivity:AppCompatActivity() {

    @BindingObject
    lateinit var binding:ActivityMainBinding

    @AfterViews
    fun afterViews() {
        binding.vm = VM()
    }
}