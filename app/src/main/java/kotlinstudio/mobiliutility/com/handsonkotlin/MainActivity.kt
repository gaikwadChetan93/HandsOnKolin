package kotlinstudio.mobiliutility.com.handsonkotlin

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinstudio.mobiliutility.com.handsonkotlin.databinding.ActivityMainBinding
import kotlinstudio.mobiliutility.com.handsonkotlin.model.User

class MainActivity : AppCompatActivity() {
    //lateinit var mainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val user = User("Kuma", 23)
        mainBinding.user = user;
        //binding.setVariable(BR.user, user)
        //binding.executePendingBindings()
    }
}
