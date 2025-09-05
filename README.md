# Charity Muscle - 開発者向けドキュメント

## 📱 プロジェクト概要
Charity Muscleは、チャリティとフィットネスを組み合わせたAndroidアプリケーションです。  
**チーム開発に最適化されたアーキテクチャ**で設計されており、複数の開発者が効率的に並行開発できます。

## 🏗️ アーキテクチャ設計

### パッケージ構造
```
jp.ac.meijou.android.charity_muscle/
├── MainActivity.java                    # 🚀 アプリエントリーポイント（スプラッシュ画面）
├── base/
│   └── BaseNavigationActivity.java     # 🔧 共通ナビゲーション基底クラス
└── ui/                                  # 🎯 機能別完全分離
    ├── home/HomeActivity.java          # 🏠 ホーム画面
    ├── search/SearchActivity.java      # 🔍 検索画面
    ├── favorite/FavoriteActivity.java  # ❤️ お気に入り画面
    └── profile/ProfileActivity.java    # 👤 プロフィール画面
```

### レイアウト構造
```
res/layout/
├── navigation_bar.xml                  # 🎨 共通ナビゲーションバー（押下エフェクト対応）
├── activity_main.xml                   # 🚀 スプラッシュ画面（2秒間表示）
├── activity_home.xml                   # 🏠 ホーム画面
├── activity_search.xml                 # 🔍 検索画面
├── activity_favorite.xml               # ❤️ お気に入り画面
└── activity_profile.xml                # 👤 プロフィール画面
```

## 🔧 技術仕様

### 開発環境
- **言語**: Java
- **最小SDK**: Android API
- **ビルドツール**: Gradle
- **IDE**: Android Studio

### UI/UX設計
- **ナビゲーション**: 円形押下エフェクト付きの固定ナビゲーションバー
- **アニメーション**: リップルエフェクト
- **レスポンシブ**: 異なる画面サイズに対応

## 🚀 新しい画面の追加方法

### 1. パッケージ作成
```
ui/[feature_name]/
└── [FeatureName]Activity.java
```

### 2. Activityクラス作成
```java
package jp.ac.meijou.android.charity_muscle.ui.[feature_name];

import jp.ac.meijou.android.charity_muscle.base.BaseNavigationActivity;

public class NewFeatureActivity extends BaseNavigationActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_feature);
    }
}
```

### 3. レイアウトファイル作成
```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout ...>
    
    <!-- 画面固有のコンテンツ -->
    <TextView android:text="新機能画面" ... />
    
    <!-- 共通ナビゲーションバーを1行で追加 -->
    <include layout="@layout/navigation_bar" />
    
</androidx.constraintlayout.widget.ConstraintLayout>
```

### 4. AndroidManifest.xml更新
```xml
<activity
    android:name=".ui.[feature_name].NewFeatureActivity"
    android:exported="false" />
```
