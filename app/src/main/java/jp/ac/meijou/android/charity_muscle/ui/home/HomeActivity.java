package jp.ac.meijou.android.charity_muscle.ui.home;

import android.os.Bundle;
import jp.ac.meijou.android.charity_muscle.R;
import jp.ac.meijou.android.charity_muscle.base.BaseNavigationActivity;

/**
 * ホーム画面を担当するActivity
 *
 * 責任範囲:
 * - アプリのメイン画面表示
 * - ダッシュボード機能
 * - 主要機能へのエントリーポイント
 *
 * チーム開発時の担当者: フロントエンド開発者
 */
public class HomeActivity extends BaseNavigationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
}
