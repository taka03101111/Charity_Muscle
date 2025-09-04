package jp.ac.meijou.android.charity_muscle;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import jp.ac.meijou.android.charity_muscle.ui.home.HomeActivity;

/**
 * アプリケーションのエントリーポイント
 *
 * 責任範囲:
 * - アプリの初期化とスプラッシュ画面表示
 * - 必要な初期設定の実行
 * - 適切なタイミングでホーム画面に遷移
 *
 * チーム開発時の担当者: 共通基盤担当開発者
 */
public class MainActivity extends AppCompatActivity {

    private static final int SPLASH_DELAY_MS = 2000; // 2秒間スプラッシュ画面を表示

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // アプリの初期化処理を実行
        initializeApp();

        // 2秒後にホーム画面に遷移
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            navigateToHome();
        }, SPLASH_DELAY_MS);
    }

    /**
     * アプリの初期化処理
     * - 設定の読み込み
     * - データベースの初期化
     * - 必要なサービスの起動など
     */
    private void initializeApp() {
        // TODO: 実際の初期化処理をここに実装
        // 例：SharedPreferences の読み込み、Database初期化など
    }

    /**
     * ホーム画面への遷移
     */
    private void navigateToHome() {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
        finish();
    }
}