package boxresin.test.jetpacknavigationsample

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_main.view.*

/** 학교 검색 프래그먼트 */
class SchoolSearchFragment : Fragment(R.layout.fragment_school_search) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // 툴바 메뉴 초기화
        view.toolbar.inflateMenu(R.menu.fragment_school_search)
        val searchMenuItem: MenuItem = view.toolbar.menu.findItem(R.id.action_search_school)
        searchMenuItem.expandActionView() // 검색창 펼쳐진 상태로 놓기
        searchMenuItem.setOnActionExpandListener(object : MenuItem.OnActionExpandListener {
            override fun onMenuItemActionExpand(item: MenuItem): Boolean = true
            override fun onMenuItemActionCollapse(item: MenuItem): Boolean {
                // 검색창의 뒤로 가기를 누르면 프래그먼트가 닫히도록 처리
                findNavController().popBackStack()
                return false
            }
        })
    }
}
