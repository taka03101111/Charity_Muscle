package jp.ac.meijou.android.charity_muscle.ui.search;

import android.os.Bundle;
import jp.ac.meijou.android.charity_muscle.R;
import jp.ac.meijou.android.charity_muscle.base.BaseNavigationActivity;

/**
 * 検索画面を担当するActivity
 *
 * 責任範囲:
 * - 検索機能の実装
 * - 検索結果の表示
 * - フィルタリング機能
 */
public class SearchActivity extends BaseNavigationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }
}
