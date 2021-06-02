package kg.tutorialapp.lesson40

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kg.tutorialapp.lesson40.databinding.Fragment2Binding

class Fragment2: Fragment(R.layout.fragment_2) {

    private var binding: Fragment2Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment2Binding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding!!.buttonFragment2.setOnClickListener {
            Toast.makeText(context, "Hello Fragment 2 !", Toast.LENGTH_LONG).show()
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object{
        const val TAG = "fragment2"
    }
}