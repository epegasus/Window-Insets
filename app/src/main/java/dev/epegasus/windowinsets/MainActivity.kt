package dev.epegasus.windowinsets

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fitSystemWindow(false)
    }

    /**
     * @param isFit:    Whether the content should be scroll under the statusBar.
     *     true:    Content will not scroll, it will be bound
     *     false:   It will scroll behind statusBar
     */

    private fun fitSystemWindow(isFit: Boolean) {
        WindowCompat.setDecorFitsSystemWindows(window, isFit)
    }
}