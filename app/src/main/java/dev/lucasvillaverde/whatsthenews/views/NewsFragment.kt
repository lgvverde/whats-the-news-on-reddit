package dev.lucasvillaverde.whatsthenews.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsthenews.R
import dev.lucasvillaverde.whatsthenews.utils.inflate
import kotlinx.android.synthetic.main.fragment_news.*

/**
 * A simple [Fragment] subclass.
 */
class NewsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = container?.inflate(R.layout.fragment_news)
        newsList.setHasFixedSize(true)
        newsList.layoutManager = LinearLayoutManager(context)

        return view
    }
}
