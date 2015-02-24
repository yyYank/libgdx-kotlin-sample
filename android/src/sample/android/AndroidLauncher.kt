package sample.android

import android.os.Bundle

import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import sample.KotlinSample

public class AndroidLauncher : AndroidApplication() {
	override protected fun onCreate (savedInstanceState: Bundle?): Unit {
		super.onCreate(savedInstanceState)
		val config = AndroidApplicationConfiguration()
		initialize(KotlinSample(), config)
	}
}
