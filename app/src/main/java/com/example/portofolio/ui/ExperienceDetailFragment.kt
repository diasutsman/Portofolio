package com.example.portofolio.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import coil.load
import com.example.portofolio.R
import com.example.portofolio.databinding.FragmentExperienceDetailBinding
import kotlinx.android.synthetic.main.item_experience.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ExperienceDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ExperienceDetailFragment : Fragment() {
    private var _binding: FragmentExperienceDetailBinding? = null
    private val binding get() = _binding!!
    private val experienceArgs by navArgs<ExperienceDetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentExperienceDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
            txtTitle.text = experienceArgs.experience.title
            txtDetail.text = experienceArgs.experience.detail
            imgDetailProfile.load(experienceArgs.experience.image){
                crossfade(2000)
            }
        }
    }
}