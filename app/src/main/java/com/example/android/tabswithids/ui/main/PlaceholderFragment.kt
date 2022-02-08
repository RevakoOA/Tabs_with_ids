package com.example.android.tabswithids.ui.main

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.example.android.tabswithids.R
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.include.view.*
import kotlin.random.Random
import androidx.core.graphics.BlendModeCompat

import androidx.core.graphics.BlendModeColorFilterCompat




/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        loading.setOnClickListener {

            val progressDrawable = CircularProgressDrawable(requireContext())
            progressDrawable.setStyle(CircularProgressDrawable.DEFAULT) //DEFAULT or LARGE

            progressDrawable.colorFilter =
                BlendModeColorFilterCompat.createBlendModeColorFilterCompat(
                    Color.RED,
                    BlendModeCompat.SRC_IN
                ) //set indicator color


            loading.icon = progressDrawable
            loading.text = "I am loading"
        }
        randomizeText.setOnClickListener {
            random_text_x.text = Random.nextInt().toString()
            include1.random_text.text = Random.nextInt().toString()
            include2.random_text.text = Random.nextInt().toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
    }
}