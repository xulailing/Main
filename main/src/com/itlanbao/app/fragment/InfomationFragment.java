package com.itlanbao.app.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.LinearLayout;

import com.itlanbao.app.R;

/**
 * 信息
 *
 * @author itlanbao.com
 */
public class InfomationFragment extends MyFragment implements View.OnClickListener  {
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        view = inflater.inflate(R.layout.fragment_list, container, false);

        return view;
    }



    /**
     * onClick事件
     */
    @Override
    public void onClick(View view) {
    }




    @Override
    protected void onVisible(boolean isInit) {

    }
}
