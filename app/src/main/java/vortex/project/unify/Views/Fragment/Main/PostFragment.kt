package vortex.project.unify.Views.Fragment.Main

import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.toDrawable
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*
import vortex.project.unify.R


class PostFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_post, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setWidgets()
    }

    private fun setWidgets() {
        activity?.bottom_nav_view!!.visibility = View.VISIBLE

        val value = TypedValue()
        activity?.theme!!.resolveAttribute(R.attr.colorOnPrimary, value, true)
        val background = context?.let { ContextCompat.getColor(it, value.resourceId) }

        activity?.toolbar_layout!!.visibility = View.VISIBLE
        activity?.drawer_button!!.visibility = View.VISIBLE
        activity?.camera_button!!.visibility = View.VISIBLE
        activity?.message_button!!.visibility = View.VISIBLE
        activity?.toolbar_layout!!.background = background!!.toDrawable()

        val parameter = activity?.toolbar!!.layoutParams as ViewGroup.MarginLayoutParams
        parameter.marginStart = 100
        activity?.toolbar!!.layoutParams = parameter
    }
}