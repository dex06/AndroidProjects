package com.example.newsletter.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.newsletter.R
import com.example.newsletter.adapters.CategoryAdapter
import com.example.newsletter.model.Category

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CategoriesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CategoriesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categories, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)

        val articles = listOf<Category>(
            Category("sante","https://picsum.photos/200/300?random=1"),
            Category("sport", "https://picsum.photos/seed/picsum/200/300?random=2"),
            Category("politique","https://picsum.photos/seed/picsum/200/300?random=3"),
            Category("commerce","https://picsum.photos/200/300?random=4"),
            Category("politique","https://picsum.photos/200/300?random=5"),
            Category("politique","https://picsum.photos/200/300?random=6")

        )

        val adapterRecycler = CategoryAdapter(articles)
        recyclerView.hasFixedSize()

        recyclerView.layoutManager = GridLayoutManager(view.context, 2)

        recyclerView.adapter = adapterRecycler
    }

}