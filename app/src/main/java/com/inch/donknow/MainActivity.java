package com.inch.donknow;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;
import com.inch.donknow.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Fragment1 fragment1 = new Fragment1();
        Fragment2 fragment2 = new Fragment2();
        Fragment3 fragment3 = new Fragment3();

        BottomNavigationView bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnItemSelectedListener((MenuItem menuItem) -> {
            Fragment selectedFragment = null;
            int itemId = menuItem.getItemId();
            if (itemId == R.id.tab1) {
                selectedFragment = fragment1;
            } else if (itemId == R.id.tab2) {
                selectedFragment = fragment2;
            } else if (itemId == R.id.tab3) {
                selectedFragment = fragment3;
            }

            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, selectedFragment).commit();
                return true;
            }
            return false;
        });



        setSupportActionBar(binding.appBarMain.toolbar);
        binding.appBarMain.toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow)
                .setOpenableLayout(drawer)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_top, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int curId = item.getItemId();
        if (curId == R.id.menu_refresh) {
            // Refresh 메뉴를 눌렀을 때의 동작 예시
            // 데이터를 새로고침하는 코드를 여기에 추가할 수 있습니다.
            refreshData();
            return true;
        } else if (curId == R.id.menu_search) {
            // Search 메뉴를 눌렀을 때의 동작 예시
            // 검색 창을 열거나 검색 기능을 실행하는 코드를 여기에 추가할 수 있습니다.
            openSearchDialog();
            return true;
        } else if (curId == R.id.menu_settings) {
            // Settings 메뉴를 눌렀을 때의 동작 예시
            // 설정 화면을 열거나 설정을 변경하는 코드를 여기에 추가할 수 있습니다.
            openSettingsActivity();
            return true;
        } else {
            // 기타 메뉴를 눌렀을 때의 동작 예시
            // 알 수 없는 메뉴를 선택했을 때 사용자에게 알림을 표시하는 코드를 여기에 추가할 수 있습니다.
            showUnknownMenuMessage();
            return super.onOptionsItemSelected(item);
        }
    }

    // 데이터를 새로고침하는 메서드 예시
    private void refreshData() {
        // 여기에 데이터를 새로고침하는 코드를 추가하세요
    }

    // 검색 다이얼로그를 열기 위한 메서드 예시
    private void openSearchDialog() {
        // 여기에 검색 다이얼로그를 열기 위한 코드를 추가하세요
    }

    // 설정 화면을 열기 위한 메서드 예시
    private void openSettingsActivity() {
        // 여기에 설정 화면을 열기 위한 코드를 추가하세요
    }

    // 알 수 없는 메뉴를 선택했을 때 사용자에게 알림을 표시하는 메서드 예시
    private void showUnknownMenuMessage() {
        // 여기에 알 수 없는 메뉴를 선택했을 때 사용자에게 알림을 표시하는 코드를 추가하세요
    }


}
