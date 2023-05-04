package com.kelompok4.grafy
import android.content.*
import android.net.Uri
import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.dhaval2404.imagepicker.ImagePicker
import com.google.android.gms.vision.Frame
import com.google.android.gms.vision.text.TextRecognizer
import com.kelompok4.grafy.databinding.ActivityOcrBinding


class Ocr(function: () -> ActivityOcrBinding) : AppCompatActivity() {
    var FOTO_URI: Uri? = null
    var bitmap: Bitmap? =null
    private lateinit var binding : ActivityOcrBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOcrBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnPicture.setOnClickListener {
            ImagePicker.with(this)
                .crop()
                .start()
        }
        binding.btnCopy.setOnClickListener {
            copytoClipboard(binding.resultText.text.toString())
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == RESULT_OK && requestCode == ImagePicker.REQUEST_CODE && data != null) {
            FOTO_URI = data.data
            bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, FOTO_URI)
            binding.imageView.visibility = View.GONE
            binding.textView.visibility = View.GONE
            getTextFromImage(bitmap!!)
        } else if (resultCode == ImagePicker.RESULT_ERROR) {
            Toast.makeText(this, ImagePicker.getError(data), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Take Picture Cancelled", Toast.LENGTH_SHORT).show()
        }
    }

    private fun getTextFromImage(bitmap: Bitmap) {
        val recognizer = TextRecognizer.Builder(this@Ocr).build()
        if (!recognizer.isOperational) {
            Toast.makeText(this, "Failed load to text", Toast.LENGTH_SHORT).show()
        } else {
            val frame = Frame.Builder().setBitmap(bitmap).build()
            val textBlockSparseArray = recognizer.detect(frame)
            val stringbuilder = StringBuilder()
            for (i in 0 until textBlockSparseArray.size()) {
                val textBlock = textBlockSparseArray.valueAt(i)
                stringbuilder.append(textBlock.value)
                stringbuilder.append("\n")
            }
            binding.resultText.setText(stringbuilder.toString())
        }
    }

    private fun copytoClipboard(resultText: String) {
        val clipboard = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("Copied Data", resultText)
        clipboard.setPrimaryClip(clip)
        Toast.makeText(this, "Copied", Toast.LENGTH_SHORT).show()
    }
}



    

