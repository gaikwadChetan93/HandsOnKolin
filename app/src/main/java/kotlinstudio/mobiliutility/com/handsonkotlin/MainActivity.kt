package kotlinstudio.mobiliutility.com.handsonkotlin

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.google.firebase.firestore.FirebaseFirestore
import kotlinstudio.mobiliutility.com.handsonkotlin.databinding.ActivityMainBinding
import kotlinstudio.mobiliutility.com.handsonkotlin.model.User
import kotlinx.android.synthetic.main.activity_main.*
import timber.log.Timber
import java.io.File

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        initRecyclerView();

    }

    private fun initRecyclerView() {
        var userArray: ArrayList<User> = ArrayList()
        userArray.add(User("dsd",32));

        // Creates a vertical Layout Manager
        rv_animal_list.layoutManager = LinearLayoutManager(this)

        // You can use GridLayoutManager if you want multiple columns. Enter the number of columns as a parameter.
        rv_animal_list.layoutManager = GridLayoutManager(this, 2)

        // Access the RecyclerView Adapter and load the data into it
        rv_animal_list.adapter = AnimalAdapter(userArray, this)
    }
}
