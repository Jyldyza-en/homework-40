package kg.tutorialapp.lesson40


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()

    }

    private fun setup() {

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = supportFragmentManager.backStackEntryCount.toString()

        supportFragmentManager.addOnBackStackChangedListener {
            textView.text = supportFragmentManager.backStackEntryCount.toString()
        }

        val fragment1 = findViewById<Button>(R.id.button)
        fragment1.setOnClickListener {
            addFragment(Fragment1())
        }

        val fragment2 = findViewById<Button>(R.id.button2)
        fragment2.setOnClickListener {
            addFragment(Fragment2())
        }

        val fragment3 = findViewById<Button>(R.id.button3)
        fragment3.setOnClickListener {
            addFragment(Fragment3())
        }

        val popBackStack = findViewById<Button>(R.id.button4)
        popBackStack.setOnClickListener {
            supportFragmentManager.popBackStack(Fragment2.TAG, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }
        /*
        * id(например 0), flags(0)
        * id(0), FragmentManager.POP_BACK_STACK_INCLUSIVE
        * "string", 0
        * "string", FragmentManager.POP_BACK_STACK_INCLUSIVE*/
    }

    private fun addFragment(fragment: Fragment) {

        val transaction = supportFragmentManager.beginTransaction()

        val tag = when(fragment){
            is Fragment1 -> Fragment1.TAG
            is Fragment2 -> Fragment2.TAG
            else -> Fragment3.TAG
        }

        transaction.run {
            replace(R.id.container, fragment)
            addToBackStack(tag)
            commit()
        }
    }

}