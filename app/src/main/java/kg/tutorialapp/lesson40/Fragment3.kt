package kg.tutorialapp.lesson40

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kg.tutorialapp.lesson40.databinding.Fragment3Binding

class Fragment3: Fragment(R.layout.fragment_3) {

    private var binding: Fragment3Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Fragment3Binding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding!!.buttonFragment3.setOnClickListener {
            Toast.makeText(context, "Hello Fragment 3 !", Toast.LENGTH_LONG).show()
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object{
        const val TAG = "fragment3"
    }
}