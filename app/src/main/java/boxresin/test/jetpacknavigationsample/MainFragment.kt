package boxresin.test.jetpacknavigationsample

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.appcompat.view.menu.MenuBuilder
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.view.*

/** 메인 프래그먼트 */
class MainFragment : Fragment(R.layout.fragment_main) {
    @SuppressLint("RestrictedApi")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // 툴바 메뉴 초기화
        view.toolbar.inflateMenu(R.menu.fragment_main)
        (view.toolbar.menu as? MenuBuilder)?.setOptionalIconsVisible(true)
    }
}
