package br.com.messoretech

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivitySnackbarBinding
import com.google.android.material.snackbar.Snackbar

class SnackBarActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySnackbarBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root )

        binding.showing.setOnClickListener {
            Snackbar.make(it, "Click no primeiro botão", Snackbar.LENGTH_SHORT).show()
        }

        binding.action.setOnClickListener {
            Snackbar.make(it, "Click no segundo botão", Snackbar.LENGTH_LONG)
                .setAction("Go") {
                    Log.e("TAG", "Clicou na ação")
                }
                .show()
        }
    }

    companion object {
        fun createIntent(context: Context) : Intent = Intent (context, SnackBarActivity::class.java)
    }
}
