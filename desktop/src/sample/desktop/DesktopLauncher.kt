package sample.desktop

import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration
import sample.KotlinSample

public fun main(arg: Array<String>): Unit {
	val config = LwjglApplicationConfiguration()
	LwjglApplication(KotlinSample(), config)
}
