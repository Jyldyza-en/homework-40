package kg.tutorialapp.lesson40

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kg.tutorialapp.lesson40.databinding.Fragment1Binding

class Fragment1: Fragment(R.layout.fragment_1) {

    private var binding: Fragment1Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment1Binding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding!!.buttonFragment1.setOnClickListener {
            Toast.makeText(context, "Hello Fragment 1 !", Toast.LENGTH_LONG).show()
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object{
        const val TAG = "fragment1"
    }
}