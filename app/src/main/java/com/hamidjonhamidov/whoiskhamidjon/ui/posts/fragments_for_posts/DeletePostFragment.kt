package com.hamidjonhamidov.whoiskhamidjon.ui.posts.fragments_for_posts


import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.hamidjonhamidov.whoiskhamidjon.R
import com.hamidjonhamidov.whoiskhamidjon.ui.DialogButtonClickListener
import com.hamidjonhamidov.whoiskhamidjon.ui.displayDialog
import com.hamidjonhamidov.whoiskhamidjon.util.setActionBarTitle
import kotlinx.android.synthetic.main.fragment_delete_post.*
import kotlinx.android.synthetic.main.fragment_update_post.*

class DeletePostFragment : BasePostsFragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_delete_post, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setActionBarTitle("Delete Post")

        btn_delete_delete_post.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_delete_delete_post -> {
                try{
                    val k = Integer.parseInt(et_delete_using_id_delete_post.text.toString())
                    if(k > 100){
                        Toast.makeText(this@DeletePostFragment.context, "Sorry, nothing found with this field", Toast.LENGTH_SHORT).show()
                        return
                    }
                } catch (e: Exception){
                    Toast.makeText(this@DeletePostFragment.context, "Numbers required for id field", Toast.LENGTH_SHORT).show()
                    return
                }


                if(et_delete_using_id_delete_post.text.isNullOrEmpty()){

                    Toast.makeText(this@DeletePostFragment.context, "You must fill id field first", Toast.LENGTH_SHORT).show()
                }
                else {
                    Toast.makeText(this@DeletePostFragment.context, "Success!!! Post Deleted.", Toast.LENGTH_SHORT).show()

                    et_delete_using_id_delete_post.setText("")

                    activity?.displayDialog(
                        "Ok",
                        "Uhh, okkk!",
                        "Attenttion!!!",
                        getString(R.string.not_deleted),
                        false,
                        object : DialogButtonClickListener {
                            override fun onOkClick(dialog: Dialog) {
                                dialog.hide()
                            }

                            override fun onNoClick(dialog: Dialog) {
                                dialog.hide()
                            }
                        })
                }

            }
        }
    }

}




















