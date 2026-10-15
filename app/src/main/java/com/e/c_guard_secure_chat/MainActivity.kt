package com.e.c_guard_secure_chat

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import com.e.c_guard_secure_chat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.appBarMain.toolbar)

    }

    fun loginButtonNavClicked (view: View) {

    }
    fun addChannelButtonClicked(view:View) {

    }
    fun sendMessageButtonClicked(view:View) {

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.id.nav_view, menu)
        return true
    }

//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.content_main)
//        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
//    }
}