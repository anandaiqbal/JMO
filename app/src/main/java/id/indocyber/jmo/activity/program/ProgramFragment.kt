package id.indocyber.jmo.activity.program

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import id.indocyber.jmo.R
import id.indocyber.jmo.databinding.ProgramFragmentBinding
import id.indocyber.jmo.entity.Program

class ProgramFragment : Fragment() {


    private val adapter = ProgramAdapter()
    private lateinit var binding: ProgramFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ProgramFragmentBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.programList.adapter = adapter
    }


}