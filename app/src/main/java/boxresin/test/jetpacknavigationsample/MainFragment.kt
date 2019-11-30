package boxresin.test.jetpacknavigationsample

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.view.menu.MenuBuilder
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.view.*

/** 메인 프래그먼트 */
class MainFragment : Fragment(R.layout.fragment_main) {
    @SuppressLint("RestrictedApi")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // 툴바 메뉴 초기화
        view.toolbar.inflateMenu(R.menu.fragment_main)
        (view.toolbar.menu as? MenuBuilder)?.setOptionalIconsVisible(true)
        view.toolbar.setOnMenuItemClickListener(this::onToolbarMenuClick)
    }

    /** 툴바 메뉴를 클릭할 때 호출된다. */
    private fun onToolbarMenuClick(item: MenuItem): Boolean = when (item.itemId) {
        // 학교 검색 메뉴
        R.id.action_search_school -> {
            this.findNavController().navigate(R.id.action_search_school); true
        }
        else -> false
    }
}
