package id.indocyber.jmo.activity.news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import id.indocyber.jmo.databinding.NewsFragmentBinding
import id.indocyber.jmo.viewmodel.NewsViewModel

class NewsFragment : Fragment() {

    val vm: NewsViewModel by viewModels()
    private val adapter = NewsAdapter()
    private lateinit var binding: NewsFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = NewsFragmentBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vm.loadNews()
        binding.newsList.adapter = adapter
    }
}