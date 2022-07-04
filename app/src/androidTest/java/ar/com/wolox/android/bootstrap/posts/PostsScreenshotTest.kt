package ar.com.wolox.android.bootstrap.posts

import androidx.test.ext.junit.runners.AndroidJUnit4
import ar.com.wolox.android.bootstrap.ui.posts.PostsActivity
import com.shopify.testify.ScreenshotRule
import com.shopify.testify.annotation.ScreenshotInstrumentation
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@HiltAndroidTest
@RunWith(AndroidJUnit4::class)
class PostsScreenshotTest {

    @get:Rule
    val hiltRule = HiltAndroidRule(this)

    @get:Rule
    var rule = ScreenshotRule(PostsActivity::class.java)

    @ScreenshotInstrumentation
    @Test
    fun default() {
        rule.assertSame()
    }
}
