package jp.ac.meijou.android.charity_muscle.ui.favorite;

import android.os.Bundle;
import jp.ac.meijou.android.charity_muscle.R;
import jp.ac.meijou.android.charity_muscle.base.BaseNavigationActivity;

/**
 * お気に入り画面を担当するActivity
 *
 * 責任範囲:
 * - お気に入りアイテムの表示
 * - お気に入りの追加・削除機能
 * - お気に入りリストの管理
 *
 * チーム開発時の担当者: データ管理担当開発者
 */
public class FavoriteActivity extends BaseNavigationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
    }
}
