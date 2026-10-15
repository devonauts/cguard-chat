package com.e.c_guard_secure_chat

import android.graphics.Color
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import java.util.*


class CreateUserActivity : AppCompatActivity() {
    var userAvatar = "profileDefault"
    var avatarColor = "[0.5,0.5,0.5,1]"
    val random = Random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)
        val createAvatarImage = findViewById<ImageView>(R.id.createAvatarImageView)
        createAvatarImage.setOnClickListener() {

            val color = random.nextInt(2)
            val avatar = random.nextInt(28)
            if (color == 0) {
                userAvatar = "light$avatar"
            } else {
                userAvatar = "dark$avatar"
            }
            val resourceId = resources.getIdentifier(userAvatar, "drawable", packageName)
            createAvatarImage.setImageResource(resourceId)
        }
        val generateBackgroundColor = findViewById<Button>(R.id.generateBackgroundColor)
        generateBackgroundColor.setOnClickListener {
            val r = random.nextInt(255)
            val g = random.nextInt(255)
            val b = random.nextInt(255)
            createAvatarImage.setBackgroundColor(Color.rgb(r,g,b))
            val savedR = r.toDouble() / 255
            val savedG = g.toDouble() / 255
            val savedB = b.toDouble() / 255
            avatarColor = "[$savedR,$savedB,$savedG, 1]"

        }
    }

    fun createUserButtonPressed(view:View) {

    }
}