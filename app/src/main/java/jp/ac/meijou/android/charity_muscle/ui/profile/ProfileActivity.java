package jp.ac.meijou.android.charity_muscle.ui.profile;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import jp.ac.meijou.android.charity_muscle.R;
import jp.ac.meijou.android.charity_muscle.base.BaseNavigationActivity;

/**
 * プロフィール画面を担当するActivity
 *
 * 責任範囲:
 * - ユーザープロフィール情報の表示
 * - プロフィール編集機能
 * - アカウント設定
 */
public class ProfileActivity extends BaseNavigationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
}
