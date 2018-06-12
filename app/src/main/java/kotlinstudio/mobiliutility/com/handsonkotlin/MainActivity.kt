package kotlinstudio.mobiliutility.com.handsonkotlin

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.firestore.FirebaseFirestore
import kotlinstudio.mobiliutility.com.handsonkotlin.databinding.ActivityMainBinding
import kotlinstudio.mobiliutility.com.handsonkotlin.model.User
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        val user = User("Kuma", 23)
        mainBinding.user = user;
    }
}
