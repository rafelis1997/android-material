package br.com.messoretech

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import br.com.messoretech.databinding.ActivityTextFieldsBinding

class TextFieldActivity: AppCompatActivity() {
    private val binding by lazy { ActivityTextFieldsBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tiWithError.error = "Campo obrigatório"
    }

    companion object {
        fun createIntent(context: Context) : Intent = Intent (context, TextFieldActivity::class.java)
    }
}
