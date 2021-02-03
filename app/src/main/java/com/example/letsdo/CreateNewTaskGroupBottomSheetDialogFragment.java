package com.example.letsdo;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import java.util.Objects;

public class CreateNewTaskGroupBottomSheetDialogFragment extends BottomSheetDialogFragment {

    EditText editText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savesInstance) {
        View root = inflater.inflate(R.layout.create_new_task_groupe_bottom_sheet_fragment, container, false);
        editText = root.findViewById(R.id.editTextGropeName);

//        editText.requestFocus();
//        editText.setFocusableInTouchMode(true);
//
//        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
//        imm.showSoftInput(editText, InputMethodManager.SHOW_IMPLICIT);

        return root;
    }

    public String getTextFromEditText() {
        return editText.getText().toString();
    }

//    public void setSelectedTrue() {
//        InputMethodManager imm = (InputMethodManager) Objects.requireNonNull(getActivity()).getSystemService(Context.INPUT_METHOD_SERVICE);
//        imm.showSoftInput(editText, InputMethodManager.SHOW_FORCED);
//    }



}
