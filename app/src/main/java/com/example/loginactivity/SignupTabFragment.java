package com.example.loginactivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class SignupTabFragment extends Fragment {
    float v =0;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.sign_tab_fragment, container, false);


        EditText signup_email = root.findViewById(R.id.signup_email);
        EditText signup_no = root.findViewById(R.id.signup_no);
        EditText signup_pass = root.findViewById(R.id.signup_password);
        EditText confirm_pass = root.findViewById(R.id.signup_passwordConfirm);
        Button signup_button = root.findViewById(R.id.signupButton);

        signup_email.setTranslationX(800);
        signup_no.setTranslationX(800);
        signup_pass.setTranslationX(800);
        confirm_pass.setTranslationX(800);
        signup_button.setTranslationX(800);

        signup_email.setAlpha(v);
        signup_no.setAlpha(v);
        signup_pass.setAlpha(v);
        confirm_pass.setAlpha(v);
        signup_button.setAlpha(v);


        signup_email.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(300).start();
        signup_no.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        signup_pass.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(500).start();
        confirm_pass.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(700).start();
        signup_button.animate().translationX(0).alpha(1).setDuration(1000).setStartDelay(700).start();

        return root;
    }
}