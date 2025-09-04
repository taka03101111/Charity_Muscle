package jp.ac.meijou.android.charity_muscle.base;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import jp.ac.meijou.android.charity_muscle.R;
import jp.ac.meijou.android.charity_muscle.ui.home.HomeActivity;
import jp.ac.meijou.android.charity_muscle.ui.search.SearchActivity;
import jp.ac.meijou.android.charity_muscle.ui.favorite.FavoriteActivity;
import jp.ac.meijou.android.charity_muscle.ui.profile.ProfileActivity;

/**
 * 全ての画面で共通するナビゲーションバーを持つ基底Activity
 * チーム開発において、ナビゲーション機能の一元管理を実現
 */
public abstract class BaseNavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 子クラスでsetContentView()を呼び出した後にsetupNavigation()を実行
    }

    @Override
    protected void onResume() {
        super.onResume();
        setupNavigation();
    }

    /**
     * ナビゲーションバーのセットアップ
     * 全ての画面で共通のナビゲーション動作を提供
     */
    private void setupNavigation() {
        ImageButton navHome = findViewById(R.id.navHome);
        ImageButton navSearch = findViewById(R.id.navSearch);
        ImageButton navFavorite = findViewById(R.id.navFavorite);
        ImageButton navProfile = findViewById(R.id.navProfile);

        // null チェックを追加（ナビゲーションバーがない画面でも安全）
        if (navHome != null) {
            navHome.setOnClickListener(v -> navigateToHome());
        }
        if (navSearch != null) {
            navSearch.setOnClickListener(v -> navigateToSearch());
        }
        if (navFavorite != null) {
            navFavorite.setOnClickListener(v -> navigateToFavorite());
        }
        if (navProfile != null) {
            navProfile.setOnClickListener(v -> navigateToProfile());
        }
    }

    /**
     * 現在のActivityクラス名を取得（同一画面への遷移を防ぐため）
     */
    private String getCurrentActivityName() {
        return this.getClass().getSimpleName();
    }

    private void navigateToHome() {
        if (!getCurrentActivityName().equals("HomeActivity")) {
            startActivity(new Intent(this, HomeActivity.class));
        }
    }

    private void navigateToSearch() {
        if (!getCurrentActivityName().equals("SearchActivity")) {
            startActivity(new Intent(this, SearchActivity.class));
        }
    }

    private void navigateToFavorite() {
        if (!getCurrentActivityName().equals("FavoriteActivity")) {
            startActivity(new Intent(this, FavoriteActivity.class));
        }
    }

    private void navigateToProfile() {
        if (!getCurrentActivityName().equals("ProfileActivity")) {
            startActivity(new Intent(this, ProfileActivity.class));
        }
    }
}
