package jp.ac.meijou.android.charity_muscle.ui.ranking;

import android.os.Bundle;
import jp.ac.meijou.android.charity_muscle.R;
import jp.ac.meijou.android.charity_muscle.base.BaseNavigationActivity;

/**
 * ランキング画面を担当するActivity
 *
 * 責任範囲:
 * - ランキング情報の表示
 * - ユーザーのランキング確認
 * - ランキング関連機能
 */
public class RankingActivity extends BaseNavigationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);
    }
}
