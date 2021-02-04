package com.crymzee.amina.sample_animation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.crymzee.amina.sample_animation.Fragments.bouncefragment;
import com.google.android.material.navigation.NavigationView;


public class Navigation_Drawer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ImageView menuImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        Toolbar toolbar=findViewById(R.id.toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        /*ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();*/
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        menuImg=findViewById(R.id.menu_btn);
        menuImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawer.openDrawer(Gravity.LEFT);
            }
        });
    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        displaySelectedScreen(item.getItemId());
        return false;
    }

    private void displaySelectedScreen(int itemId) {

        Fragment fragment = null;

        switch (itemId) {
            case R.id.nav_bounce:
                fragment = new bouncefragment();
                break;
            case R.id.nav_Blink:
                fragment = new blinkfragment();
                break;
     /*       case R.id.nav_zoomin:
                fragment = new zoominfragment();
                break;
            case R.id.nav_zoomout:
                fragment = new zoomoutfragment();
                break;
            case R.id.nav_rotate:
                fragment = new rotatefragment();
                break;
            case R.id.nav_move:
                fragment = new movefragment();
                break;
            case R.id.nav_slideup:
                fragment = new slideupfragment();
                break;
            case R.id.nav_slidedown:
                fragment = new slidedownfragment();
                break;
            case R.id.nav_sequentialanimation:
                fragment = new sequentialanimationfragment();
                break;
            case R.id.nav_togetheranimation:
                fragment = new togetheranimationfragment();
                break;
            case R.id.nav_flip:
                fragment = new flipfragment();
                break;
            case R.id.nav_fade:
                fragment = new fadefragment();
                break;
            case R.id.nav_drawable:
                fragment = new drawableanimationfragment();
                break;
            case R.id.nav_swap:
                fragment = new swapanimationfragment();
                break;*/
        }
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);

    }
    }


