package com.crymzee.amina.sample_animation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.crymzee.amina.sample_animation.Fragments.Blinkfragment;
import com.crymzee.amina.sample_animation.Fragments.Bouncefragment;
import com.crymzee.amina.sample_animation.Fragments.Movefragment;
import com.crymzee.amina.sample_animation.Fragments.Rotatefragment;
import com.crymzee.amina.sample_animation.Fragments.ZoomInfragment;
import com.crymzee.amina.sample_animation.Fragments.ZoomOutfragment;
import com.google.android.material.navigation.NavigationView;


public class Navigation_Drawer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    ImageView menuImg;
    private static final String TAG = "Navigation_Drawer";
    private Toolbar toolbar;
    DrawerLayout drawer;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

         toolbar = findViewById(R.id.toolbar);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
         navigationView = (NavigationView) findViewById(R.id.nav_view);
        //navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        for (Fragment fragment : getSupportFragmentManager().getFragments()) {
            getSupportFragmentManager().beginTransaction().remove(fragment).commit();
        }
        int id = item.getItemId();

        if (id == R.id.nav_bounce) {
            // Handle the camera action

            Toast.makeText(this, "Bounce Fragment", Toast.LENGTH_SHORT).show();
            Bouncefragment bouncefragment= new Bouncefragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .add(R.id.detail_fragment_container, bouncefragment, "bounce frag")
                    .commit();
        } else if (id == R.id.nav_Blink) {
            Toast.makeText(this, "Blink  Fragment", Toast.LENGTH_SHORT).show();
            Blinkfragment blinkfragment= new Blinkfragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.detail_fragment_container, blinkfragment, "bounce frag")
                    .commit();
        }
        else if (id == R.id.nav_zoomin) {
            Toast.makeText(this, "Zoom In  Fragment", Toast.LENGTH_SHORT).show();
            ZoomInfragment zoomInfragment= new ZoomInfragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.detail_fragment_container, zoomInfragment, "Zoom In frag")
                    .commit();
        }
        else if (id == R.id.nav_zoomout) {
            Toast.makeText(this, "Zoom In  Fragment", Toast.LENGTH_SHORT).show();
            ZoomOutfragment zoomOutfragment= new ZoomOutfragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.detail_fragment_container, zoomOutfragment, "Zoom out frag")
                    .commit();
        }
        else if (id == R.id.nav_rotate) {
            Toast.makeText(this, "Zoom In  Fragment", Toast.LENGTH_SHORT).show();
            Rotatefragment rotatefragment= new Rotatefragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.detail_fragment_container, rotatefragment, "Zoom out frag")
                    .commit();
        }
        else if (id == R.id.nav_move) {
            Toast.makeText(this, "movefragment", Toast.LENGTH_SHORT).show();
            Movefragment movefragment= new Movefragment();
            FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.detail_fragment_container, movefragment, "movefragment")
                    .commit();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }




    }




