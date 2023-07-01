package eu.pl.snk.senseibunny.recyclerviewviewbindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.HorizontalScrollView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import eu.pl.snk.senseibunny.recyclerviewviewbindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding:ActivityMainBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        val adapter=MainAdapter(TaskList.taskList)
        binding?.taskRecyclerView?.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding?.taskRecyclerView?.adapter=adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        binding=null
    }
}