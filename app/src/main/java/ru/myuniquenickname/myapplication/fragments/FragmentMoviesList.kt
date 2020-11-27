package ru.myuniquenickname.myapplication.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import ru.myuniquenickname.myapplication.R


class FragmentMoviesList : Fragment() {

    private var clickListener: TransactionsFragmentClicks? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_movies_list, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<ImageView>(R.id.backGround).
            setOnClickListener { clickListener?.replaceFragment()
        }

    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is TransactionsFragmentClicks){
            clickListener = context
        }
    }

    override fun onDetach() {
        super.onDetach()
        clickListener = null
    }

    interface TransactionsFragmentClicks{
        fun replaceFragment()
    }
}