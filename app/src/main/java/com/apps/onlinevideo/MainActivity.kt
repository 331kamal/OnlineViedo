package com.apps.onlinevideo

import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {


    private lateinit var drawerLayout: DrawerLayout
    private lateinit var coordinatorLayout: CoordinatorLayout
    private lateinit var toolbar: Toolbar
    private lateinit var frameLayout: FrameLayout
    private lateinit var navigationView: NavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        drawerLayout = findViewById(R.id.my_drawer_layout)
        coordinatorLayout = findViewById(R.id.coordinatorLayout)
        toolbar = findViewById(R.id.toolbar)
        frameLayout = findViewById(R.id.frameLayout)
//        navigationView = findViewById(R.id.navigationView)

        setToolbar()
        val actionBarDrawerToggle = ActionBarDrawerToggle(this@MainActivity , drawerLayout, R.string.nav_open , R.string.nav_close)
        drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        navigationView.setNavigationItemSelectedListener {

            when(it.itemId){
                R.id.nav_account -> {
                    Toast.makeText(this, "Accout Clicked", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_settings -> {
                    Toast.makeText(this, "Accout Clicked", Toast.LENGTH_SHORT).show()
                }
                R.id.nav_logout -> {
                    Toast.makeText(this, "Accout Clicked", Toast.LENGTH_SHORT).show()
                }

            }
            return@setNavigationItemSelectedListener true
        }

    }

    private fun setToolbar(){
        setSupportActionBar(toolbar)
        supportActionBar?. title = " Toolbar title"
        supportActionBar?. setHomeButtonEnabled(true)
        supportActionBar?. setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId
        if (id == android.R.id.home){
            drawerLayout.openDrawer(GravityCompat.START)
        }
        return super.onOptionsItemSelected(item)
    }


}